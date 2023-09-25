/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poot1anacristinaemarialuisaborges;

import java.time.LocalDateTime;

/**
 *
 * @author Ana Cristina e Maria Luisa
 */
public class TipoDieta {
    private int id;
    private String nome;
    private double carboidratos;
    private double proteinas;
    private double gorduras;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public TipoDieta() {
        this.dataCriacao = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
    
        if(this.carboidratos == 40 && this.proteinas == 30 && this.gorduras == 30)
        {
            this.nome = "Equilibrada";
        }else if(this.carboidratos == 30 && this.proteinas == 50 && this.gorduras == 20)
        {
            this.nome = "Low Carb";
        }else if(this.carboidratos == 15 && this.proteinas == 15 && this.gorduras == 70)
        {
            this.nome = "Cetogenica";
        }else{
            this.nome = "Atleta";
        }
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getGorduras() {
        return gorduras;
    }

    public void setGorduras(double gorduras) {
        this.gorduras = gorduras;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    
    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(LocalDateTime dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
    
    

}
