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
public class Data implements Salvavel, Comparable<Data> {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public void salvarArq(BufferedWriter b) throws IOException {
        b.write(this.dia + "\n");
        b.write(this.mes + "\n");
        b.write(this.ano + "\n");
    }
    
    public Data(BufferedReader b) throws IOException {
        this.dia = Integer.parseInt(b.readLine());
        this.mes = Integer.parseInt(b.readLine());
        this.ano = Integer.parseInt(b.readLine());
    }

    @Override
    public int compareTo(Data d) {
        if(this.ano < d.getAno()) return 1;
        if(this.ano > d.getAno()) return -1;
        
        if(this.mes < d.getMes()) return 1;
        if(this.mes > d.getMes()) return -1;
        
        if(this.dia < d.getDia()) return 1;
        if(this.dia > d.getDia()) return -1;
        return 0;
    }
}
