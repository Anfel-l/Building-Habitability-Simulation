/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class Simulacion {
    private Edificio edificio;
    private MetodoLumenes algoritmo;
    
    public Simulacion(Edificio edificio) {
        this.edificio = edificio;
        this.algoritmo = new MetodoLumenes();
    }
    
    public void CalcularHabitabilidad()
    {
        for (Pisos piso_n : edificio.getPisos()) {
            for (Espacio espacio : piso_n.getEspacios()) {
                algoritmo.setEspacio(espacio);
                algoritmo.procesarEspacio();
            }
        }
    
    }
    
}
