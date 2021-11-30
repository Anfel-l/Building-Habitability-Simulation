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
public class Pisos {
    private LinkedList<Espacio> espacios;
    private int numero_piso;

    public Pisos(LinkedList<Espacio> espacios) {
        this.espacios = espacios;
    }

    public Pisos(LinkedList<Espacio> espacios, int numero_piso) {
        this.espacios = espacios;
        this.numero_piso = numero_piso;
    }

    public Pisos(int numero_piso) {
        this.numero_piso = numero_piso;
        this.espacios = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "\n\033[0;1mPiso #"+ numero_piso +"\nEspacios #:" + espacios  + "";
    }
    
    

    public int getNumero_piso() {
        return numero_piso;
    }

    public void setNumero_piso(int numero_piso) {
        this.numero_piso = numero_piso;
    }
    

    public LinkedList<Espacio> getEspacios() {
        return espacios;
    }

    public void setEspacios(LinkedList<Espacio> espacios) {
        this.espacios = espacios;
    }
    
}
