/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author mbss2
 */
public class Eletrico extends Veiculo {
    private double autonomiaBat;
    private double capacidadeBat;

    public Eletrico(double autonomiaBat, double capacidadeBat, String marca, String modelo, int anoFab, int mesFab, int anoMod, double valor) {
        super(marca, modelo, anoFab, mesFab, anoMod, valor);
        this.autonomiaBat = autonomiaBat;
        this.capacidadeBat = capacidadeBat;
    }
    
    public int getAutonomia(){
        return (int) (this.autonomiaBat);
    }

    public String toString(){
        return this.marca + " " + this.modelo + " " + this.anoFab + "/" + this.anoMod + " - Autonomia: " + this.getAutonomia() + "km (Elétrico)";
    }
}
