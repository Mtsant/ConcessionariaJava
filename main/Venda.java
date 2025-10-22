/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 */
public class Venda {
    private Veiculo veiculo;
    private Cliente cliente;
    private double desconto;
    private Data d;
    private String chassi;

    public Venda(Veiculo veiculo, Cliente cliente, double desconto, Data d, String chassi) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.desconto = desconto;
        this.d = d;
        this.chassi = chassi;
    }
    
    public Data getData() {
        return this.d;
    }
    
    public double valor() {
        return this.veiculo.getValor() - this.desconto;
    }
    
    public void setDesconto(double desconto, Gerente g, String s){
        if (g.validarAcesso(s)) {
            this.desconto = desconto;
            System.out.println("Valor atualizado da venda: " + this.valor());
        }
        else {
            System.out.println("Senha errada.");
        }
    }
    
    public String toString() {
        return "Veiculo: " + this.veiculo.toString() + "\n" +
        "Cliente: " + cliente.toString() + "\n" +
        "Valor da venda: R$" + this.valor() + "\n" +
        "Data: " + this.d.toString();
    }
}
