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
class Pisos {
    private LinkedList<Espacios> espacios;
    private int numero_piso;

    public Pisos(LinkedList<Espacios> espacios) {
        this.espacios = espacios;
    }

    public Pisos(LinkedList<Espacios> espacios, int numero_piso) {
        this.espacios = espacios;
        this.numero_piso = numero_piso;
    }

    public int getNumero_piso() {
        return numero_piso;
    }

    public void setNumero_piso(int numero_piso) {
        this.numero_piso = numero_piso;
    }
    

    public LinkedList<Espacios> getEspacios() {
        return espacios;
    }

    public void setEspacios(LinkedList<Espacios> espacios) {
        this.espacios = espacios;
    }
    
}
