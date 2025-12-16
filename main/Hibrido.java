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
public class Hibrido extends Veiculo {
    private double autonomiaComb;
    private double capacidadeComb;
    private double autonomiaBat;
    private double capacidadeBat;

    public Hibrido(double autonomiaComb, double capacidadeComb, double autonomiaBat, double capacidadeBat, String marca, String modelo, int anoFab, int mesFab, int anoMod, double valor) {
        super(marca, modelo, anoFab, mesFab, anoMod, valor);
        this.autonomiaComb = autonomiaComb;
        this.capacidadeComb = capacidadeComb;
        this.autonomiaBat = autonomiaBat;
        this.capacidadeBat = capacidadeBat;
    }
    
    public int getAutonomia(){
        return (int) (this.autonomiaComb + this.autonomiaBat);
    }

    public String toString(){
        return super.toString() + " - Autonomia: " + this.getAutonomia() + "km (Híbrido)";
    }
    
    public void salvarArq(BufferedWriter b) throws IOException   {
        super.salvarArq(b);
        b.write(this.autonomiaComb + "\n");
        b.write(this.capacidadeComb + "\n");
        b.write(this.autonomiaBat + "\n");
        b.write(this.capacidadeBat + "\n");
    }
    
    public Hibrido(BufferedReader b) throws IOException {
        super(b);           
        this.autonomiaComb = Double.parseDouble(b.readLine());
        this.capacidadeComb = Double.parseDouble(b.readLine());
        this.autonomiaBat = Double.parseDouble(b.readLine());
        this.capacidadeBat = Double.parseDouble(b.readLine());

    }
}
