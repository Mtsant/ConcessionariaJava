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
public class Combustao extends Veiculo {
    private double autonomiaComb;
    private double capacidadeComb;

    public Combustao(double autonomiaComb, double capacidadeComb, String marca, String modelo, int anoFab, int mesFab, int anoMod, double valor) {
        super(marca, modelo, anoFab, mesFab, anoMod, valor);
        this.autonomiaComb = autonomiaComb;
        this.capacidadeComb = capacidadeComb;
    }
    
    public int getAutonomia(){
        return (int) this.autonomiaComb;
    }

    public String toString(){
        return super.toString() + " - Autonomia: " + this.getAutonomia() + "km (Combustão)";
    }
    
    public void salvarArq(BufferedWriter b) throws IOException   {
        super.salvarArq(b);
        b.write(this.autonomiaComb + "\n");
        b.write(this.capacidadeComb + "\n");
    }
    
    public Combustao(BufferedReader b) throws IOException {
        super(b);           
        this.autonomiaComb = Double.parseDouble(b.readLine());
        this.capacidadeComb = Double.parseDouble(b.readLine());
    }
}
