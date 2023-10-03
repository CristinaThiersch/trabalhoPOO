/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model;

/**
 *
 * @author  Ana Cristina e Maria Luisa
 */
public class AlimentoDAO {
    Alimento[] alimentos = new Alimento[50];
    
    public AlimentoDAO(){
        Alimento arroz1 = new Alimento();
        arroz1.setNome("Arroz Integral Cozido");
        arroz1.setPorcao(100);
        arroz1.setTipoUsuario("Admin");
        arroz1.setProteinas(2.6);
        arroz1.setCarboidratos(25.8);
        arroz1.setGorduras(1.0);
        arroz1.getCalorias();
        this.adiciona(arroz1);
        
        Alimento arroz2 = new Alimento();
        arroz2.setNome("Arroz cozido");
        arroz2.setPorcao(100);
        arroz2.setTipoUsuario("Admin");
        arroz2.setProteinas(7.2);
        arroz2.setCarboidratos(78.8);
        arroz2.setGorduras(0.3);
        arroz2.getCalorias();
        this.adiciona(arroz2);
    }

    
    public boolean adiciona(Alimento alimento) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            alimentos[proximaPosicaoLivre] = alimento;
            return true;
        } else {
            return false;
        }

    }

    public boolean ehVazio() {
        for (Alimento alimento : alimentos) {
            if (alimento != null) {
                return false;
            }
        }
        return true;

    }

    public void mostrarTodos() {
        boolean temAli = false;
        for (Alimento alimento : alimentos) {
            if (alimento != null) {
                System.out.println(alimento);
                temAli = true;
            }
        }
        if (!temAli) {
            System.out.println("não existe alimento cadastrad");
        }
    }

    public boolean alterarNome(String nome, String novoNome) {
        for (Alimento alimento : alimentos) {
            if (alimento != null && alimento.getNome().equals(nome)) {
                alimento.setNome(novoNome);
                return true;
            }
        }
        return false;

    }

    public Alimento buscaPorNome(String nome) {
        for (Alimento alimento : alimentos) {
            if (alimento != null && alimento.getNome().equals(nome)) {
                return alimento;
            }
        }
        return null;

    }

    public boolean remover(String nome) {
        for (int i = 0; i < alimentos.length; i++) {
            if (alimentos[i] != null && alimentos[i].getNome().equals(nome)) {
                alimentos[i] = null;
                return true;
            }
        }
        return false;

    }

    private int proximaPosicaoLivre() {
        for (int i = 0; i < alimentos.length; i++) {
            if (alimentos[i] == null) {
                return i;
            }
        }
        return -1;

    }
}
