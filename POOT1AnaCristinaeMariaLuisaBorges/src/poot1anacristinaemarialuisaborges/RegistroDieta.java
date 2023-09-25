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
public class RegistroDieta {

    private int id;
    private Pessoa pessoa;
    private Avaliacao avaliacaoFisica;
    private TipoDieta tipo;
    private String objetivo;
    private double calorias;
    private int nroRefeicoes;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public RegistroDieta() {
        this.dataCriacao = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Avaliacao getAvaliacaoFisica() {
        return avaliacaoFisica;
    }

    public void setAvaliacaoFisica(Avaliacao avaliacaoFisica) {
        this.avaliacaoFisica = avaliacaoFisica;
    }

    public TipoDieta getTipo() {
        return tipo;
    }

    public void setTipo(TipoDieta tipo) {
        this.tipo = tipo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
        //DIMINUIR O PESO, MANTER O PESO, MELHORAR COMPOSIÇÃO CORPORAL e AUMENTAR O PESO
        this.setCalorias();
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias() {
        if(this.objetivo.equals("DIMINUIR O PESO"))
        {
            this.calorias = tmb - 500;
        }else if(this.objetivo.equals("MANTER O PESO")){
            this.calorias = tmb;
        }else if(this.objetivo.equals("GANHAR PESO")){
                this.calorias = tmb + 500;
        }     
    }

    public int getNroRefeicoes() {
        return nroRefeicoes;
    }

    public void setNroRefeicoes(int nroRefeicoes) {
        this.nroRefeicoes = nroRefeicoes;
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
