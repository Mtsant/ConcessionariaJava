/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

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
        return this.marca + " " + this.modelo + " " + this.anoFab + "/" + this.anoMod + " - Autonomia: " + this.getAutonomia() + "km (Híbrido)";
    }
}
