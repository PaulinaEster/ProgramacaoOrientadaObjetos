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
public class AutoMotor {
    private String modelo;
    private int numLugares;
    private double comprimento;
    private int ano;
    private String cor;
    private String placa;

    public AutoMotor(String modelo, int numLugares, double comprimento, int ano, String cor, String placa) {
        this.modelo = modelo;
        this.numLugares = numLugares;
        this.comprimento = comprimento;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "AutoMotor{" + "modelo=" + modelo + ", numLugares=" + numLugares + ", comprimento=" + comprimento + ", ano=" + ano + ", cor=" + cor + ", placa=" + placa + '}';
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
