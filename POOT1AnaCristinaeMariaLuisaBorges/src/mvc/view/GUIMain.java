/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.view;

import java.util.Scanner;
import mvc.model.Alimento;

/**
 *
 * @author Ana Cristina e Maria Luisa
 */
public class GUIMain {

    Scanner scanner = new Scanner(System.in);

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

        builder.append("TRABALHO POO\n\n");
        builder.append("0 - Para sair do programa");
        builder.append("\n1 - Visualizar cadastro");
        builder.append("\n2 - Alterar Cadastro");
        builder.append("\n3 - Avaliacao Fisica");
        builder.append("\n4 - Registro Dieta");
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
        builder.append("\n1 - Menu Pessoas");
        builder.append("\n2 - Menu Alimentos");
        builder.append("\n3 - Menu Avaliacao Fisica");
        builder.append("\n4 - Menu Preferencias");
        builder.append("\n5 - Menu Refeicoes");
        builder.append("\n6 - Menu Registro Dieta");
        builder.append("\n7 - Menu Tipo Dieta");
        builder.append("\nQual sua opcao ? R: ");
        System.out.println(builder.toString());

        return Integer.parseInt(scanner.nextLine());
    }

    public int menuAlimentos() {
        StringBuilder builder = new StringBuilder("");

        builder.append("\nMENU ALIMENTOS\n\n");
        builder.append("0 - Para sair do programa");
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
        
        System.out.println("\nTipo de Usuario: ");
        String tipo = scanner.nextLine();
        a1.setTipoUsuario(tipo);
        
        System.out.println("\nProteina: ");
        double proteina = Double.parseDouble(scanner.nextLine());
        a1.setProteinas(proteina);
        
        System.out.println("\nCarboidrato: ");
        double carbo = Double.parseDouble(scanner.nextLine());
        a1.setProteinas(carbo);
        
        System.out.println("\nGorduras: ");
        double gorduras = Double.parseDouble(scanner.nextLine());
        a1.setProteinas(gorduras);
        
        return a1;
    }
}
