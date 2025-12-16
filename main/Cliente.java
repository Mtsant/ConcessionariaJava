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
public class Cliente extends Pessoa implements Salvavel {
    private String email;

    public Cliente(String nome, String cpf, int dia, int mes, int ano, String email) {
        super(nome, cpf, dia, mes, ano);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public String toString() {
        return super.toString() + " - " + this.getEmail();
    }

    public void salvarArq(BufferedWriter b) throws IOException   {
        super.salvarArq(b);
        b.write(this.email + "\n");
    }
    
    public Cliente(BufferedReader b) throws IOException {
        super(b);           
        this.email = b.readLine();
    }

}
