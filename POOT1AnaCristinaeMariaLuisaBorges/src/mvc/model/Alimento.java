/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model;
import java.time.LocalDateTime;
import java.util.Date;
/**
 *
 * @author Ana Cristina e Maria Luisa
 */
public class Alimento {
    private long id;
    private String nome;
    private double carboidratos;
    private double proteinas;
    private double gorduras;
    private String tipoUsuario;
    private int porcao;
    private double calorias;
    private  LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;
    private static long serial;

    public Alimento() {
        Alimento.serial = Alimento.serial +1;
        this.id = Alimento.serial;
        this.dataCriacao = LocalDateTime.now();
    }
    
    double calcCalorias(){
        return this.calorias = (4 * this.carboidratos) + (4 * this.proteinas) + (9 * this.gorduras);
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getPorcao() {
        return porcao;
    }

    public void setPorcao(int porcao) {
        this.porcao = porcao;
    }

    public double getCalorias() {
        calcCalorias();
        return calorias;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Alimento other = (Alimento) obj;
        return this.id == other.id;
    }
    
    
}
