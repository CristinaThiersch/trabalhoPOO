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
                                default:
                                    gui.invalido();
                            }
                        } while (opcMenu != 0);
                    } else {
                        System.out.println("\n===================\nLogin Invalido, tente novamente\n====================\n");
                    }
                    break;

                case 2:
                    System.out.println("Cadastrar");
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

                                    switch (opcMenuAlimentos) {
                                        case 0:
                                            opcMenu = 10;
                                            opc = 0;

                                            break;
                                        case 1:
                                            Alimento alimento = gui.criaAlimento();

                                            if (alimentoDAO.adiciona(alimento)) {

                                                System.out.println("Alimento adicionado com sucesso");
                                            } else {
                                                System.out.println("Alimento nao adicionado");
                                            }

                                            break;
                                        case 2:
                                            System.out.println("Alterar Alimentos");
                                            break;
                                        case 3:
                                            System.out.println("Buscar Alimento");
                                            break;
                                        case 10:
                                            break;
                                        default:
                                            gui.invalido();
                                    }
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

    
}
