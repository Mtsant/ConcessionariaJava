/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author mbss2
 */
public class Funcionario extends Pessoa{
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
}
