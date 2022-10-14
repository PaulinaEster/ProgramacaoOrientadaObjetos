/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Usuário
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoMotor auto = null;
        auto = new Aviao("Gol", 4, 2.0, 1999, "Cinza", "12344");
        System.out.println(auto.toString());
    }
    
}
