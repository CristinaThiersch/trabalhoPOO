/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poot1anacristinaemarialuisaborges;

import java.util.Scanner;

/**
 *
 * @author anath
 */
public class TesteAdmin {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opc = 5;
        do {            
            System.out.println(""+
                    "");
            opc = ler.nextInt();
            switch (opc) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 0:
                    return;
                default:
                    System.out.println("\n\nOpcao invalida\n\n");
            }
        } while (opc != 0);
    }
}
