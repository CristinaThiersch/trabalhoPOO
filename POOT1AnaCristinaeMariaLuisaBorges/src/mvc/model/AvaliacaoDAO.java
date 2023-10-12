/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model;

/**
 *
 * @author Ana Cristina e Maria Luisa
 */
public class AvaliacaoDAO {
    Avaliacao[] avaliacoes = new Avaliacao[50];
            
    public AvaliacaoDAO(){
       
    }

    
    public boolean adiciona(Avaliacao avaliacao) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            avaliacoes[proximaPosicaoLivre] = avaliacao;
            return true;
        } else {
            return false;
        }

    }

    public boolean ehVazio() {
        for (Avaliacao avaliacao : avaliacoes) {
            if (avaliacao != null) {
                return false;
            }
        }
        return true;

    }

    public void mostrarTodos() {
        boolean tem = false;
        for (Avaliacao avaliacao : avaliacoes) {
            if (avaliacao != null) {
                System.out.println(avaliacao.toString());
                tem = true;
            }
        }
        if (!tem) {
            System.out.println("Não há avaliação física cadastrada.");
        }
    }

    /*public boolean alterarID(Long id, Long novoId) {
        for (Avaliacao avaliacao : avaliacoes) {
            if (avaliacao != null && avaliacao.getId().equals(id)) {
                avaliacao.setId(novoId);
                return true;
            }
        }
        return false;

    }*/

    public Avaliacao buscaPorID(long id) {
        for (Avaliacao avaliacao : avaliacoes) {
            if (avaliacao != null && avaliacao.equals(id)) {
                return avaliacao;
            }
        }
        return null;
    }

    public boolean remover(long id) {
        for (int i = 0; i < avaliacoes.length; i++) {
            if (avaliacoes[i] != null && avaliacoes[i].equals(id)) {
                avaliacoes[i] = null;
                return true;
            }
        }
        return false;
    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < avaliacoes.length; i++) {
            if (avaliacoes[i] == null) {
                return i;
            }
        }
        return -1;

    }
}
