/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;

/**
 *
 */
public class Vendedor extends Funcionario {
    private double comissao;
    private ArrayList<Venda> vendidos;

    public Vendedor(String nome, String cpf, int dia, int mes, int ano, double salario, double comissao) {
        super(nome, cpf, dia, mes, ano, salario);
        this.comissao = comissao;
        this.vendidos = new ArrayList<>();
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
}
