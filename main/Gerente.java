/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author mbss2
 */
public class Gerente extends Funcionario {
    private String senha;

    public Gerente(String senha, String nome, String cpf, int dia, int mes, int ano, double salario) {
        super(nome, cpf, dia, mes, ano, salario);
        this.senha = senha;
    }
    
    public boolean validarAcesso(String senha) {
        return this.senha.equals(senha);
    }
}
