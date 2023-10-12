/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.control;

import java.util.Scanner;
import mvc.model.Alimento;
import mvc.model.AlimentoDAO;
import mvc.model.AlimentoRefeicao;
import mvc.model.AlimentoRefeicaoDAO;
import mvc.model.AvaliacaoDAO;
import mvc.model.Avaliacao;
import mvc.model.Pessoa;
import mvc.model.PessoaDAO;
import mvc.model.Preferencias;
import mvc.model.PreferenciasDAO;
import mvc.model.Refeicoes;
import mvc.model.RefeicoesDAO;
import mvc.model.RegistroDieta;
import mvc.model.RegistroDietaDAO;
import mvc.model.TipoDieta;
import mvc.model.TipoDietaDAO;
import mvc.view.GUIMain;

/**
 *
 * @author Ana Cristina e Maria Luisa
 */
public class controlMain {

    GUIMain gui = new GUIMain();
    private PessoaDAO pessoaDAO = new PessoaDAO();
    private AlimentoDAO alimentoDAO = new AlimentoDAO();
    private AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();
    private PreferenciasDAO preferenciasDAO = new PreferenciasDAO();
    Scanner ler = new Scanner(System.in);

    public controlMain() {

        int opc = -1;
        do {
            opc = gui.menuBoasVindas();
            switch (opc) {
                case 0:
                    gui.encerrar();
                    break;
                case 1:
                    String login = gui.login();
                    String senha = gui.senha();
                    Pessoa logada = pessoaDAO.buscaPessoaLogin(login, senha);

                    if (logada != null) {
                        int opcMenu = 10;
                        do {
                            opcMenu = gui.menuPrincipal();
                            switch (opcMenu) {
                                case 0:
                                    gui.encerrar();
                                    opc = 0;
                                    break;
                                case 1:
                                    Pessoa mostrarPessoa = pessoaDAO.buscaPorNome(logada.getNome());
                                    System.out.println(mostrarPessoa.toString());
                                    break;
                                case 2:
                                    String novoNome = gui.alterarPessoa();
                                    if (pessoaDAO.alterarNome(logada.getNome(), novoNome)) {
                                        System.out.println("\nNome alterado com sucesso, " + logada.getNome());
                                    } else {
                                        gui.erro();
                                    }
                                    break;
                                case 3:
                                    int opcAv = gui.menuAvaliacao();
                                    avaliacao(opcAv, logada);
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    int opcPref = gui.menuPreferencias();
                                    preferencia(opcPref, logada);

                                    break;
                                case 7:
                                    String resp = gui.excluiPessoa(logada);
                                    if (pessoaDAO.remover(resp)) {
                                        System.out.println("\nConta excluida com sucesso!");
                                        opcMenu = 0;
                                        opc = 0;
                                        gui.encerrar();
                                    } else {
                                        gui.erro();
                                    }
                                    break;
                                default:
                                    gui.invalido();
                            }
                        } while (opcMenu != 0);
                    } else {
                        System.out.println("\n===================\nLogin Invalido, tente novamente\n====================\n");
                    }
                    break;

                case 2:
                    Pessoa pessoa = gui.criaPessoa();

                    if (pessoaDAO.adiciona(pessoa)) {
                        System.out.println("\nCadastro realizado com sucesso!");
                    } else {
                        gui.erro();
                    }
                    break;

                case 3:
                    System.out.println("Login admin");
                    login = gui.login();
                    senha = gui.senha();
                    logada = pessoaDAO.buscaPessoaLoginAdmin(login, senha);

                    if (logada != null) {
                        int opcMenu = 0;
                        do {
                            opcMenu = gui.menuPrincipalAdmin();
                            switch (opcMenu) {
                                case 0:
                                    gui.encerrar();
                                    opcMenu = 10;
                                    opc = 0;
                                    break;
                                case 1:
                                    System.out.println("INSERIR MENU PESSOA");

                                    break;
                                case 2:
                                    int opcMenuAlimentos = gui.menuAlimentos();
                                    alimento(opcMenuAlimentos, logada);

                                    break;
                                case 3:
                                    System.out.println("INSERIR MENU AVALIACAO");
                                    break;
                                case 4:
                                    System.out.println("INSERIR MENU PREFERENCIAS");
                                    break;
                                case 5:
                                    System.out.println("INSERIR MENU REFEICOES");
                                    break;
                                case 6:
                                    System.out.println("INSERIR MENU REGISTRO DIETA");
                                    break;
                                case 7:
                                    System.out.println("INSERIR MENU TIPO DIETA");
                                    break;
                                case 10:
                                    break;
                                default:
                                    gui.invalido();
                            }
                        } while (opcMenu != 10);
                    } else {
                        System.out.println("\n===================\nLogin Invalido, tente novamente\n====================\n");
                    }

                    break;

                default:
                    gui.invalido();

            }
        } while (opc != 0);
    }

    public static void main(String[] args) {
        new controlMain();
    }

    private void preferencia(int opc, Pessoa logada) {
        switch (opc) {
            case 1:
                String nomeAlimento = gui.criarPreferencia();
                Alimento buscaNome = alimentoDAO.buscaPorNome(nomeAlimento);
                if (buscaNome == null) {
                    gui.requisicoes(nomeAlimento);
                    System.out.println("\nAinda nao temos esse alimento cadastrado em nosso sistema, mas ja abrimos uma requisicao para nossos desenvolvedores adicionaram. Tente novamente em breve!");
                } else {
                    Preferencias p1 = new Preferencias(logada);
                    p1.setAlimento(buscaNome);
                    if (preferenciasDAO.adiciona(p1)) {
                        System.out.println("\nPreferencia adicionada com sucesso");
                    } else {
                        System.out.println("\nPreferencia nao adicionada");
                    }
                }
                break;
            case 2:
                preferenciasDAO.mostrarTodos();
                break;
            case 3:
                nomeAlimento = gui.excluirPreferencia();
                buscaNome = alimentoDAO.buscaPorNome(nomeAlimento);
                if (buscaNome == null) {
                    gui.requisicoes(nomeAlimento);
                    System.out.println("\nAinda nao temos esse alimento cadastrado em nosso sistema, mas ja abrimos uma requisicao para nossos desenvolvedores adicionaram. Tente novamente em breve!");
                } else {
                    if (preferenciasDAO.remover(buscaNome)) {
                        System.out.println("\nPreferencia do alimento " + nomeAlimento + " excluido com sucesso!");
                    } else {
                        gui.erro();
                    }

                }
                break;
                case 10:
                break;
            default:
                gui.invalido();
        }

    }

    private void alimento(int opcMenuAlimentos, Pessoa logada) {
        switch (opcMenuAlimentos) {
            case 1:
                Alimento alimento = gui.criaAlimento();

                if (alimentoDAO.adiciona(alimento)) {

                    System.out.println("\nAlimento adicionado com sucesso");
                } else {
                    System.out.println("\nAlimento nao adicionado");
                }

                break;
            case 2:
                String nome = gui.buscarAlimento();
                Alimento mudaNome = alimentoDAO.buscaPorNome(nome);
                if (mudaNome == null) {
                    System.out.println("\nAlimento nao encontrado, impossivel trocar o nome");
                } else {
                    String novoNome = gui.alterarAlimento(nome);
                    if (alimentoDAO.alterarNome(nome, novoNome)) {
                        System.out.println("\nNome alterado com sucesso, " + logada.getNome());
                    } else {
                        gui.erro();
                    }
                }
                break;
            case 3:
                nome = gui.buscarAlimento();
                Alimento buscaNome = alimentoDAO.buscaPorNome(nome);
                if (buscaNome == null) {
                    System.out.println("\nAlimento nao encontrado");
                } else {
                    System.out.println(buscaNome.toString());
                }
                break;
            case 4:
                alimentoDAO.mostrarTodos();
                break;
            case 5:
                nome = gui.excluirAlimento();
                buscaNome = alimentoDAO.buscaPorNome(nome);
                if (buscaNome == null) {
                    System.out.println("\nAlimento nao encontrado");
                } else {
                    if (alimentoDAO.remover(nome)) {
                        System.out.println("\nAlimento " + nome + " excluido com sucesso!");

                    } else {
                        gui.erro();
                    }
                }

                break;
            case 10:
                break;
            default:
                gui.invalido();
        }
    }

    private void avaliacao(int opcAv, Pessoa logada) {
        
        switch (opcAv) {
            case 1:
                
                Avaliacao avaliacao = gui.criaAvaliacao(logada);
                break;
            case 2:
                avaliacaoDAO.mostrarTodos();
                break;
            case 3:
                //long idBusca = gui.alterarAvaliacao(avaliacao);
                break;
            case 4:
                long id = gui.excluirAvaliacao();
                if(avaliacaoDAO.remover(id)){
                    System.out.println("\nAvaliacao " + id + " excluida com sucesso!");
                }else
                {
                    gui.erro();
                }
                break;
                case 10:
                break;
            default:
                gui.invalido();
        }
    }

}
