/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model;

import java.time.LocalDate;

/**
 *
 * @author Ana Cristina e Maria Luisa
 */
public class TipoDieta {
    private long id;
    private String nome;
    private double carboidratos;
    private double proteinas;
    private double gorduras;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    private static long serial;

    public TipoDieta() {
        TipoDieta.serial = TipoDieta.serial + 1;
        this.id = TipoDieta.serial;
        this.dataCriacao = LocalDate.now();
    }

    public long getId() {
        return id;
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

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    
    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

    @Override
    public String toString() {
        return "\n========================================"
                + "\nTipoDieta{" + "\nid=" + id + "\n nome=" + nome + "\n carboidratos=" 
                + carboidratos + "\n proteinas=" + proteinas + "\n gorduras=" + gorduras 
                + "\n dataCriacao=" + dataCriacao + ", dataModificacao=" + dataModificacao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoDieta other = (TipoDieta) obj;
        return this.id == other.id;
    }


}
