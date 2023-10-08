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
public class Refeicoes {
    private long id;
    private TipoDieta dieta;
    private double carboidratos;
    private double proteinas;
    private double gorduras;
    private double calorias;
    private String nomeRefeicao;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    private static long serial;

    public Refeicoes() {
        Refeicoes.serial = Refeicoes.serial +1;
        this.id = Refeicoes.serial;
        this.dataCriacao = LocalDate.now();
    }

    public long getId() {
        return id;
    }

    public TipoDieta getDieta() {
        return dieta;
    }

    public void setDieta(TipoDieta dieta) {
        this.dieta = dieta;
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

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public String getNomeRefeicao() {
        return nomeRefeicao;
    }

    public void setNomeRefeicao(String nomeRefeicao) {
        this.nomeRefeicao = nomeRefeicao;
        // café da manhã, almoço, café da tarde, janta, ceia ou outro nome.

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
                + "\nRefeicoes{" + "\nid=" + id + "\n dieta=" + dieta + "\n carboidratos=" + carboidratos 
                + "\n proteinas=" + proteinas + "\n gorduras=" + gorduras + "\n calorias=" + calorias 
                + "\n nomeRefeicao=" + nomeRefeicao + "\n dataCriacao=" + dataCriacao + ", dataModificacao=" + dataModificacao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Refeicoes other = (Refeicoes) obj;
        return this.id == other.id;
    }

}
