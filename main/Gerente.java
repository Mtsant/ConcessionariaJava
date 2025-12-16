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
public class Gerente extends Funcionario implements Salvavel {
    private String senha;

    public Gerente(String senha, String nome, String cpf, int dia, int mes, int ano, double salario) {
        super(nome, cpf, dia, mes, ano, salario);
        this.senha = senha;
    }
    
    public boolean validarAcesso(String senha) {
        return this.senha.equals(senha);
    }
    
    public void salvarArq(BufferedWriter b) throws IOException   {
        super.salvarArq(b);
        b.write(this.senha + "\n");
    }
    
    public Gerente(BufferedReader b) throws IOException {
        super(b);           
        this.senha = b.readLine();
    }
}
