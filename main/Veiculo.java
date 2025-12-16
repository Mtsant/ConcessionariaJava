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
public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFab;
    protected int mesFab;
    protected int anoMod;
    protected double valor;

    public Veiculo(String marca, String modelo, int anoFab, int mesFab, int anoMod, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.mesFab = mesFab;
        this.anoMod = anoMod;
        this.valor = valor;
    }
    
    public abstract int getAutonomia();
    
    public double getValor(){
        return this.valor;
    }
    
    public String toString() {
        return this.marca + " " + this.modelo + " " + this.anoFab + "/" + this.anoMod;
    }
    
    public void salvarArq(BufferedWriter b) throws IOException {
        b.write(this.marca + "\n");
        b.write(this.modelo + "\n");
        b.write(this.anoFab + "\n");
        b.write(this.mesFab + "\n");
        b.write(this.anoMod + "\n");
        b.write(this.valor + "\n");
    }
       
    public Veiculo(BufferedReader b) throws IOException {
        this.marca = b.readLine();
        this.modelo = b.readLine();
        this.anoFab = Integer.parseInt(b.readLine());
        this.mesFab = Integer.parseInt(b.readLine());
        this.anoMod = Integer.parseInt(b.readLine());
        this.valor = Double.parseDouble(b.readLine());
    }
}
