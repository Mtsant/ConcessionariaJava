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
 * 
 */
public abstract class Funcionario extends Pessoa implements Salvavel {
    protected double salario;

    public Funcionario(String nome, String cpf, int dia, int mes, int ano, double salario) {
        super(nome, cpf, dia, mes, ano);
        this.salario = salario;
    }
    
    public double getSalario(int mes, int ano) {
        return salario;
    }
    
    public String toString() {
        return super.toString() + " - " + this.salario;
    }
    
    public void salvarArq(BufferedWriter b) throws IOException   {
        super.salvarArq(b);
        b.write(this.salario + "\n");
    }
    
    public Funcionario(BufferedReader b) throws IOException {
        super(b);           
        this.salario = Double.parseDouble(b.readLine());
    }
}
