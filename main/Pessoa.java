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
public abstract class Pessoa implements Salvavel {
    protected String nome;
    protected String cpf;
    protected Data nasc;

    public Pessoa(String nome, String cpf, int dia, int mes, int ano) {
        this.nome = nome;
        this.cpf = cpf;
        this.nasc = new Data(dia,mes,ano);
    }

    public Pessoa(String nome, String cpf, Data nasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.nasc = nasc;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Data getNasc() {
        return nasc;
    }
    
    public int getIdade(Data hoje) {
        if (this.nasc.getMes() > hoje.getMes() || this.nasc.getMes()==hoje.getMes() && this.nasc.getMes() >= hoje.getDia()) return this.nasc.getAno()- hoje.getAno();
        else return this.nasc.getAno() - hoje.getAno() - 1;
    }
    
    public String toString() {
        return this.getNome() + " - CPF: " + this.getCpf();
    }
    
    public void salvarArq(BufferedWriter b) throws IOException {
        b.write(this.nome + "\n");
        b.write(this.cpf + "\n");
        this.nasc.salvarArq(b);
    }
       
    public Pessoa(BufferedReader b) throws IOException {
        this.nome = b.readLine();
        this.cpf = b.readLine();
        this.nasc = new Data(b);
    }

}
