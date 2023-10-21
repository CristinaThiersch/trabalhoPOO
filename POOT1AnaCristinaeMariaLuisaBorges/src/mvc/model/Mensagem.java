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
public class Mensagem {
     private long id;
    private Pessoa pessoaOrigem;
    private Pessoa pessoaDestino;
    private String mensagem;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    private static long serial;
    
    public Mensagem() {
        Mensagem.serial = Mensagem.serial + 1;
        this.id = Mensagem.serial;
        this.dataCriacao = LocalDate.now();
        this.dataModificacao = LocalDate.now();
    }

    public Pessoa getPessoaOrigem() {
        return pessoaOrigem;
    }

    public void setPessoaOrigem(Pessoa pessoaOrigem) {
        this.pessoaOrigem = pessoaOrigem;
    }

    public Pessoa getPessoaDestino() {
        return pessoaDestino;
    }

    public void setPessoaDestino(Pessoa pessoaDestino) {
        this.pessoaDestino = pessoaDestino;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(LocalDate dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
    
    @Override
    public String toString() {
        return "\n========================================"
                + "\nPessoa Origem: " + pessoaOrigem + "\nid: " + id + "\n Pessoa Destino: " + pessoaDestino + "\nMensagens: " + mensagem
                + "\n dataCriacao: " + dataCriacao + ", dataModificacao: " + dataModificacao + '}';
    }
    
}