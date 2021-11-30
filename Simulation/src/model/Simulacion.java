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
    
    public LinkedList<Espacio> fabricar_falsos_espacios(int numero_espacios)
    {
        LinkedList<Espacio> espacios = new LinkedList<>();
        for (int i = 0; i < numero_espacios; i++) {
            //Espacio espacio = new Espacio(numero_espacios, numero_espacios, numero_espacios, tipo_de_espacio, numero_espacios, numero_espacios, numero_espacios, tipo_ambiente, tipo_sistema_iluminacion);
            
        }
        
        return espacios;
    }
    
    public float falso_ancho()
    {
        return (float)randomNumber(3, 10);
    }
    
    public float falso_largo()
    {
        return (float)randomNumber(3, 10);
    }
    
    public float falso_altura()
    {
        return (float)randomNumber(3, 10);
    }
    
    public double randomNumber(int intervalo_minimo,int intervalo_maximo)
    {
        int rango = intervalo_minimo-intervalo_minimo;
        return (Math.random()*rango)+intervalo_minimo;
    }
}
