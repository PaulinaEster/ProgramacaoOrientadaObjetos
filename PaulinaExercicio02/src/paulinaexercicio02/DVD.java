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
public class DVD extends Item{
        
    private String diretor;

    public DVD(String diretor, String titulo, int tempoDuracaoSegundos, boolean tenho, String descricao) {
        super(titulo, tempoDuracaoSegundos, tenho, descricao);
        this.diretor = diretor;
    }

    public DVD() {
    }

    public String getDiretor() {
        return diretor;
    }
}
