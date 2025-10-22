/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

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
        return this.marca + " " + this.modelo + " " + this.anoFab + "/" + this.anoMod + " - Autonomia: " + this.getAutonomia() + "km (Combustão)";
    }
}
