/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paulinaexercicio02;

import java.util.ArrayList;

/**
 *
 * @author Usuário
 */
public class DataBase {
    ArrayList<Item> itens = new ArrayList<>();

    public ArrayList<Item> getItens() {
        return itens;
    }
    
    public void adicionaNovoItem(Item novoItem){
        this.itens.add(novoItem);
    }
    
}
