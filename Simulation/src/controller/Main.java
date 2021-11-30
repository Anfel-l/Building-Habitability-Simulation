/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Espacio;
import model.MetodoLumenes;


/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float ANCHO = 10;
        float LARGO = 10;
        float ALTO = 4;
        float ALTURA_TRABAJO = (float)0.5;
        
        int CANTIDAD_LAMPARAS = 5;
        
        float DESPLAZAMIENTO_LAMPARAS = (float)1;
        
        Espacio espacio = new Espacio(ANCHO, LARGO, ALTO, Espacio.SALA_CONFERENCIAS, ALTURA_TRABAJO, CANTIDAD_LAMPARAS, DESPLAZAMIENTO_LAMPARAS, Espacio.AMBIENTE_LIMPIO, Espacio.ILUMINACION_INDIRECTA);
        MetodoLumenes algoritmo = new MetodoLumenes();
        algoritmo.setEspacio(espacio);
        
        espacio.setHabitabilidad(algoritmo.procesarEspacio()); 

        System.out.println("Espacio:" + espacio);
    }
    
}
