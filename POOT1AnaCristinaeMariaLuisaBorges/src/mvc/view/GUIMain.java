/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import mvc.model.Alimento;
import mvc.model.Avaliacao;
import mvc.model.Dieta;
import mvc.model.Pessoa;
import mvc.model.Preferencias;
import mvc.model.AvaliacaoCalculos;
import mvc.model.TipoDieta;
import mvc.model.TipoDietaDAO;

/**
 *
 * @author Ana Cristina e Maria Luisa
 */
public class GUIMain {

    Scanner scanner = new Scanner(System.in);
    StringBuilder requisicoes = new StringBuilder("");

    public int menuBoasVindas() {

        StringBuilder builder = new StringBuilder("");

        builder.append("SEJA BEM VINDO AO MEU PROGRAMA\n\n");
        builder.append("0 - Para sair do programa");
        builder.append("\n1 - Login");
        builder.append("\n2 - Ainda nao e cadastrado\n");

        System.out.println(builder.toString());

        return Integer.parseInt(scanner.nextLine());
    }

    public int menuPrincipal() {

        StringBuilder builder = new StringBuilder("");

        builder.append("\n\n\nTRABALHO POO\n\n");
        builder.append("0 - Para sair do programa");
        builder.append("\n1 - Visualizar cadastro");
        builder.append("\n2 - Alterar Cadastro");
        builder.append("\n3 - Avaliacao Fisica");
        builder.append("\n4 - Dieta");
        builder.append("\n5 - Refeicoes");
        builder.append("\n6 - Preferencias");
        builder.append("\n7 - Excluir conta");
        builder.append("\nQual sua opcao ? R: ");
        System.out.println(builder.toString());

        return Integer.parseInt(scanner.nextLine());
    }

    public String login() {
        System.out.print("Login: ");
        return scanner.nextLine();
    }

    public String senha() {
        System.out.print("Senha: ");
        return scanner.nextLine();
    }

    public int menuPrincipalAdmin() {
        StringBuilder builder = new StringBuilder("");

        builder.append("TRABALHO POO - ADMIN\n\n");
        builder.append("0 - Para sair do programa");
        builder.append("\n1 - Menu Alimentos");
        builder.append("\nQual sua opcao ? R: ");
        System.out.println(builder.toString());

        return Integer.parseInt(scanner.nextLine());
    }

    public int menuAlimentos() {
        StringBuilder builder = new StringBuilder("");

        builder.append("\nMENU ALIMENTOS\n\n");
        builder.append("\n10 - Voltar ao menu anterior ");
        builder.append("\n1 - Cadastrar Alimentos");
        builder.append("\n2 - Alterar Alimentos");
        builder.append("\n3 - Buscar Alimento");
        builder.append("\n4 - Mostrar Alimentos Cadastrados");
        builder.append("\n5 - Excluir Alimentos");
        builder.append("\nQual sua opcao ? R: ");
        System.out.println(builder.toString());

        return Integer.parseInt(scanner.nextLine());
    }

    public void encerrar() {
        System.out.println("Encerrando aplicacao");
    }

    public void invalido() {
        System.out.println("\n\nOpcao invalida\n\n");
    }

    public Alimento criaAlimento() {
        Alimento a1 = new Alimento();
        System.out.println("\nCADASTRO ALIMENTO");
        System.out.println("\nNome: ");
        String nome = scanner.nextLine();
        a1.setNome(nome);

        System.out.println("\nPorcao: ");
        int porcao = Integer.parseInt(scanner.nextLine());
        a1.setPorcao(porcao);

        System.out.println("\nProteina: ");
        double proteina = Double.parseDouble(scanner.nextLine());
        a1.setProteinas(proteina);

        System.out.println("\nCarboidrato: ");
        double carbo = Double.parseDouble(scanner.nextLine());
        a1.setCarboidratos(carbo);

        System.out.println("\nGorduras: ");
        double gorduras = Double.parseDouble(scanner.nextLine());
        a1.setGorduras(gorduras);

        return a1;
    }

    public Pessoa criaPessoa() {
        Pessoa p1 = new Pessoa();
        System.out.println("\nCADASTRO");
        System.out.println("\nNome: ");
        String nome = scanner.nextLine();
        p1.setNome(nome);

        System.out.println("\nSexo - F para feminino ou M para masculino: ");
        String sexo = scanner.nextLine();
        p1.setSexo(sexo);

        System.out.println("\nInforme sua data de nascimento xx/xx/xxxx seguindo dia, mes e ano: ");
        String nasc = scanner.nextLine();
        LocalDate nascimento = LocalDate.parse(nasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        p1.setNascimento(nascimento);

        System.out.println("\nLogin: ");
        String login = scanner.nextLine();
        p1.setLogin(login);

        System.out.println("\nSenha: ");
        String senha = scanner.nextLine();
        p1.setSenha(senha);

        p1.setTipoUsuario("Comum");
        return p1;
    }

    public void erro() {
        System.out.println("\nAlgo deu errado, tente novamente mais tarde");
    }

    public String excluiPessoa(Pessoa logada) {
        System.out.println("\nConfirma a exclusao da sua conta? ATENCAO! Essa e uma escolha permanente e todos os seus dados serao excluidos.\n"
                + "1 - Confirmar \n2 - Cancelar");
        int opc = Integer.parseInt(scanner.nextLine());
        if (opc == 1) {
            return logada.getNome();
        } else {
            return "Error";
        }
    }

    public String alterarPessoa() {
        System.out.println("\nInforme o novo nome para cadastro: ");
        String nome = scanner.nextLine();
        return nome;
    }

    public String buscarAlimento() {
        System.out.println("\nInforme o nome do alimento que esta procurando: ");
        String nome = scanner.nextLine();
        return nome;
    }

    public String alterarAlimento(String alimento) {
        System.out.println("\nInforme o novo nome do alimento: " + alimento);
        String nome = scanner.nextLine();
        return nome;
    }

    public String excluirAlimento() {
        System.out.println("\nInforme o nome do alimento que quer excluir: ");
        String nome = scanner.nextLine();
        return nome;
    }

    public Avaliacao criaAvaliacao(Pessoa logada) {
        AvaliacaoCalculos a = new AvaliacaoCalculos();
        Avaliacao a1 = new Avaliacao(logada);
        System.out.println("\nCADASTRO AVALIACAO FISICA");
        System.out.println("\nInforme seu peso em quilos: ");
        double peso = Double.parseDouble(scanner.nextLine());
        a1.setPeso(peso);

        System.out.println("\nInforme sua altura em cm: ");
        double alt = Double.parseDouble(scanner.nextLine());
        a1.setAltura(alt);

        a1.setIdade(a.calculaIdade(logada));
        a1.setIMC(a.calculaIMC(a1));

        int opcAtiv = menuFatorAtividade();
        double fatorAtiv = a.fatorAtividade(opcAtiv);
        a1.setTMB(a.calculaTMB(a1, logada, fatorAtiv));

        System.out.println("\nInforme o tamanho do seu pescoco em cm: ");
        double pesc = Double.parseDouble(scanner.nextLine());
        a1.setPescoco(pesc);

        System.out.println("\nInforme o tamanho da sua cintura em cm: ");
        double cint = Double.parseDouble(scanner.nextLine());
        a1.setCintura(cint);

        System.out.println("\nInforme o tamanho do seu quadril em cm: ");
        double quadril = Double.parseDouble(scanner.nextLine());
        a1.setQuadril(quadril);

        a1.setBF(a.calculaBF(a1, logada));

        a1.setMassaGorda(a.calculaMassaGorda(a1));
        a1.setMassaMagra(a.calculaMassaMagra(a1, logada));

        System.out.println(a1.toString());

        return a1;
    }

    public String criarPreferencia() {

        System.out.println("\nCADASTRO PREFERENCIA");
        System.out.println("\nNome alimento: ");
        String nome = scanner.nextLine();
        return nome;
    }

    public int menuPreferencias() {
        StringBuilder builder = new StringBuilder("");
        builder.append("\nMENU PREFERENCIAS\n\n");
        builder.append("\n10 - Voltar ao menu anterior ");
        builder.append("\n1 - Adicionar preferencia;");
        builder.append("\n2 - Consultar preferencias;");
        builder.append("\n3 - Excluir preferencia;");
        builder.append("\nQual sua opcao ? R: ");
        System.out.println(builder.toString());
        int opc = Integer.parseInt(scanner.nextLine());
        return opc;
    }

    public void requisicoes(String nomeAlimento) {
        requisicoes.append(nomeAlimento);
    }

    public String excluirPreferencia() {
        System.out.println("\nInforme o nome do alimento que quer excluir de suas preferencias: ");
        String nome = scanner.nextLine();
        return nome;
    }

    public int menuAvaliacao() {
        StringBuilder builder = new StringBuilder("");
        builder.append("\nMENU AVALIACAO\n\n");
        builder.append("\n10 - Voltar ao menu anterior ");
        builder.append("\n1 - Adicionar avaliacao;");
        builder.append("\n2 - Consultar avaliacoes;");
        builder.append("\n3 - Alterar avaliacao;");
        builder.append("\n4 - Excluir avaliacao;");
        builder.append("\nQual sua opcao ? R: ");
        System.out.println(builder.toString());
        int opc = Integer.parseInt(scanner.nextLine());
        return opc;
    }

    private int menuFatorAtividade() {
        StringBuilder builder = new StringBuilder("");
        builder.append("\nCom  relacao a atividade fisica voce se considera: ");
        builder.append("\n1 - Sedentario (pouco ou nenhum exercício);");
        builder.append("\n2 - Levemente ativo  (exercício leve 1 a 3 dias por semana);");
        builder.append("\n3 - Moderadamente ativo (exercício moderado 6 a 7 dias por semana);");
        builder.append("\n4 - Muito ativo (exercício intenso todos os dias ou exercício duas vezes ao dia);");
        builder.append("\n5 - Extra ativo (exercício muito difícil, treinamento ou trabalho físico)");
        builder.append("\nQual sua opcao ? R: ");
        System.out.println(builder.toString());
        int opc = Integer.parseInt(scanner.nextLine());
        return opc;
    }

    public long excluirAvaliacao() {
        long id = -1;
        System.out.println("\nExcluir uma avaliacao fisica ira prejudicar o seu historico, "
                + "tem certeza que deseja excluir uma avaliacao fisica? \n1 - Sim\n2 - Cancelar");
        System.out.println("\nQual sua opcao ? R: ");
        int opc = Integer.parseInt(scanner.nextLine());

        if (opc == 1) {
            System.out.println("\nInforme o ID da avaliacao que deseja excluir: ");
            id = Long.parseLong(scanner.nextLine());
        } else {

        }
        return id;
    }

    public long pegaIDavaliacao() {
        long id = 0;
        System.out.println("\nInforme o ID da avaliacao fisica que deseja alterar: ");
        id =  Long.parseLong(scanner.nextLine());
        return id;
    }

    public double alterarAvaliacao(Avaliacao alterar) {
        System.out.println("\nInforme o peso a ser alterado na avaliacao fisica " + alterar.getId() + ": ");
        double peso = Double.parseDouble(scanner.nextLine());
        return peso;
    }

    public int menuDieta() {
        StringBuilder builder = new StringBuilder("");
        builder.append("\n\nMENU DIETA");
        builder.append("\nQual o tipo de dieta voce ira fazer agora: ");
        builder.append("\n1 - Equilibrada;");
        builder.append("\n2 - Low Carb;");
        builder.append("\n3 - Cetogênica;");
         builder.append("\nQual sua opcao ? R: ");
        System.out.println(builder.toString());
        int opc = Integer.parseInt(scanner.nextLine());
        return opc;
            }

    public int menuObjetivoDieta() {
        StringBuilder builder = new StringBuilder("");
        builder.append("\n\nQual o objetivo da sua dieta? ");
        builder.append("\n1 - Diminuir o peso;");
        builder.append("\n2 - Manter o peso;");
        builder.append("\n3 - Aumentar o peso;");
         builder.append("\nQual sua opcao ? R: ");
        System.out.println(builder.toString());
        int opc = Integer.parseInt(scanner.nextLine());
        return opc;
    }
    
    public Dieta criaDieta(int opcObj, Pessoa logada, Avaliacao av, TipoDieta tipo){
        Dieta dieta = new Dieta(logada, av, tipo);
        
        return dieta;
    }
}
