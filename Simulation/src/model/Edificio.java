/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;

/**
 *
 * @author USER
 */
public class Edificio {
    private LinkedList<Pisos> pisos;

    public Edificio(LinkedList<Pisos> pisos) {
        this.pisos = pisos;
    }
    public Edificio() {
        this.pisos = new LinkedList<>();
    }

    public LinkedList<Pisos> getPisos() {
        return pisos;
    }

    public void setPisos(LinkedList<Pisos> pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "Edificio{" + "pisos=" + pisos + '}';
    }
    
    
    
    
}
