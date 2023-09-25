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
public class Preferencias {

    private int id;
    private Pessoa pessoa;
    private Alimento alimento;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public Preferencias() {
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

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
        /*
        Escolha pelo menos 3 alimentos como fonte principal de carboidrato.
        Escolha pelo menos 3 alimentos como fonte principal de proteína.
        Escolha pelo menos 3 alimentos como fonte principal de gordura.

         */
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
