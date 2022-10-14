/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paulinaexercicio02;

/**
 *
 * @author Usuário
 */
public class Item {
    private String titulo;
    private int tempoDuracaoSegundos;
    private boolean tenho;
    private String descricao;

    public Item() {
    }

    public Item(String titulo, int tempoDuracaoSegundos, boolean tenho, String descricao) {
        this.titulo = titulo;
        this.tempoDuracaoSegundos = tempoDuracaoSegundos;
        this.tenho = tenho;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempoDuracaoSegundos() {
        return tempoDuracaoSegundos;
    }

    public boolean isTenho() {
        return tenho;
    }

    public void setTenho(boolean tenho) {
        this.tenho = tenho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    String getDiretor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
