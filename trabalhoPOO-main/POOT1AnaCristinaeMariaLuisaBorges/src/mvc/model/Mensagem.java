/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model;
import java.time.LocalDate;
import java.util.Objects;

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

    public long getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "\n========================================"
                + "\nPessoa Origem: " + pessoaOrigem + "\nid: " + id + "\n Pessoa Destino: " + pessoaDestino + "\nMensagens: " + mensagem
                + "\n dataCriacao: " + dataCriacao + ", dataModificacao: " + dataModificacao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 53 * hash + Objects.hashCode(this.pessoaOrigem);
        hash = 53 * hash + Objects.hashCode(this.pessoaDestino);
        hash = 53 * hash + Objects.hashCode(this.mensagem);
        hash = 53 * hash + Objects.hashCode(this.dataCriacao);
        hash = 53 * hash + Objects.hashCode(this.dataModificacao);
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
        final Mensagem other = (Mensagem) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.mensagem, other.mensagem)) {
            return false;
        }
        if (!Objects.equals(this.pessoaOrigem, other.pessoaOrigem)) {
            return false;
        }
        if (!Objects.equals(this.pessoaDestino, other.pessoaDestino)) {
            return false;
        }
        if (!Objects.equals(this.dataCriacao, other.dataCriacao)) {
            return false;
        }
        return Objects.equals(this.dataModificacao, other.dataModificacao);
    }
    
    
}