/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 */
public class Vendedor extends Funcionario implements Salvavel, Comparable<Vendedor> {
    private double comissao;
    private ArrayList<Venda> vendidos;

    public Vendedor(String nome, String cpf, int dia, int mes, int ano, double salario, double comissao) {
        super(nome, cpf, dia, mes, ano, salario);
        this.comissao = comissao;
        this.vendidos = new ArrayList<>();
    }
    
    public int compareTo(Vendedor v) {
        return this.nome.compareTo(v.nome);
    }
    
    public ArrayList<Venda> getVendidos() {
        return this.vendidos;
    } 
    
    public void addVenda(Venda v) {
        this.vendidos.add(v);
    }
    
    public double comissaoTotal(int mes, int ano) {
        double c = 0;
        for (Venda v : this.vendidos) {
            if (v.getData().getAno()==ano && v.getData().getMes()==mes) {
                c += v.valor()*this.comissao;
            }
        }  
        return c;
    }
    
    public double comissaoTotal(int ano) {
        double c = 0;
        for (Venda v : this.vendidos) {
            if (v.getData().getAno()==ano) {
                c += v.valor()*this.comissao;
            }
        }
        return c;
    }
    
    public double getSalario(int mes, int ano) {
        return this.salario + comissaoTotal(mes, ano);
    }
    
    public void salvarArq(BufferedWriter b) throws IOException   {
        super.salvarArq(b);
        b.write(this.comissao + "\n");
        b.write(this.vendidos.size() + "\n");
        for (Venda v : this.vendidos) {
            v.salvarArq(b);
        }
    }
    
    public Vendedor(BufferedReader b) throws IOException {
        super(b);           
        this.comissao = Double.parseDouble(b.readLine());
        this.vendidos = new ArrayList<>();
        int qtdVendas = Integer.parseInt(b.readLine());
        for (int i = 0; qtdVendas > i; i++) {
            this.vendidos.add(new Venda(b));
        }
    }
}
