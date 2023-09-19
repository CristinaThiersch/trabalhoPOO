/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poot1anacristinaemarialuisaborges;
import java.util.Date;
/**
 *
 * @author anath
 */
public class Alimento {
    int id;
    String nome;
    double carboidratos;
    double proteinas;
    double gorduras;
    String tipoUsuario;
    int porcao;
    double calorias;
    Date dataCriacao;
    Date dataModificacao;
    
    double calcCalorias(double carboidratos, double proteinas, double gorduras){
        return this.calorias = (4 * carboidratos) + (4 * proteinas) + (9 * gorduras);
    }
}
