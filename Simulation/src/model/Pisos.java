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

    public Pisos(LinkedList<Espacios> espacios) {
        this.espacios = espacios;
    }

    public LinkedList<Espacios> getEspacios() {
        return espacios;
    }

    public void setEspacios(LinkedList<Espacios> espacios) {
        this.espacios = espacios;
    }
    
    
    
}
