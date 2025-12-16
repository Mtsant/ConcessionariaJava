/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 */
public class Venda implements Comparable<Venda> {
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
    
    public int compareTo(Venda v) {
        int valor = Double.compare(v.valor(), this.valor());
        if (valor!=0) return valor;
        valor = this.d.compareTo(v.d);
        if (valor!=0) return valor;
        return valor = this.cliente.getCpf().compareTo(v.cliente.getCpf());
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
    
    public void salvarArq(BufferedWriter b) throws IOException   {
        if (this.veiculo instanceof Combustao) b.write("COMBUSTAO\n");
        else if (this.veiculo instanceof Eletrico) b.write("ELETRICO\n");
        else if (this.veiculo instanceof Hibrido) b.write("HIBRIDO\n");
        this.veiculo.salvarArq(b);
        this.cliente.salvarArq(b);
        b.write(this.desconto + "\n");
        this.d.salvarArq(b);
        b.write(chassi + "\n");
    }
    
    public Venda(BufferedReader b) throws IOException {
        String tipo = b.readLine();
        if ("COMBUSTAO".equals(tipo)) this.veiculo = new Combustao(b);
        else if ("ELETRICO".equals(tipo)) this.veiculo = new Eletrico(b);
        else if ("HIBRIDO".equals(tipo)) this.veiculo = new Hibrido(b);
        this.cliente = new Cliente(b);
        this.desconto = Double.parseDouble(b.readLine());
        this.d = new Data(b);
        this.chassi = b.readLine();
    }    
}
