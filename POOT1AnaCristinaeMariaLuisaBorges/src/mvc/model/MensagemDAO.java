/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model;

/**
 *
 * @author Ana Cristina e Maria Luisa
 */
public class MensagemDAO {

    Mensagem[] mensagens = new Mensagem[100];

    public MensagemDAO() {
    }

    public boolean adiciona(Mensagem mensagem) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            mensagens[proximaPosicaoLivre] = mensagem;
            return true;
        } else {
            return false;
        }
    }

    public boolean ehVazio() {
        for (Mensagem mensagem : mensagens) {
            if (mensagem != null) {
                return false;
            }
        }
        return true;

    }

    public void mostrarTodos() {
        boolean tem = false;
        for (Mensagem mensagem : mensagens) {
            if (mensagem != null) {
                System.out.println(mensagem.toString());
                tem = true;
            }
        }
        if (!tem) {
            System.out.println("Não há mensagem cadastrada.");
        }
    }

    public boolean alterarMensagem(String mensagem, String novaMensagem) {
        for (Mensagem mensagen : mensagens) {
            if (mensagen != null && mensagen.getMensagem().equals(mensagem)) {
                return true;
            }
        }
        return false;

    }

    public String buscaPorMensagem(String mensagem) {
        for (Mensagem mensagen : mensagens) {
            if (mensagen != null && mensagen.getMensagem().equals(mensagem)) {
                return mensagem;
            }
        }
        return null;

    }

    public boolean remover(String mensagem) {
        for (int i = 0; i < mensagens.length; i++) {
            if (mensagens[i] != null && mensagens[i].getMensagem().equals(mensagem)) {
                mensagens[i] = null;
                return true;
            }
        }
        return false;
    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < mensagens.length; i++) {
            if (mensagens[i] == null) {
                return i;
            }
        }
        return -1;

    }
}