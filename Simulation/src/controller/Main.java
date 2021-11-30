/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.Iterator;
import java.util.LinkedList;
import model.Espacio;
import model.MetodoLumenes;
import model.Simulacion;


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
        /*
        float ANCHO = 5;
        float LARGO = 4;
        float ALTO = 4;
        float ALTURA_TRABAJO = (float)0.5;
        
        int CANTIDAD_LAMPARAS = 5;
        
        float DESPLAZAMIENTO_LAMPARAS = (float)1;
        
        Espacio espacio = new Espacio(ANCHO, LARGO, ALTO, Espacio.SALA_ESPERA, ALTURA_TRABAJO, CANTIDAD_LAMPARAS, DESPLAZAMIENTO_LAMPARAS, Espacio.AMBIENTE_LIMPIO, Espacio.ILUMINACION_DIRECTA);
        MetodoLumenes algoritmo = new MetodoLumenes();
        algoritmo.setEspacio(espacio);
        
        espacio.setHabitabilidad(algoritmo.procesarEspacio()); 

        System.out.println("Espacio:" + espacio);
        */
        Simulacion simu = new Simulacion();
        LinkedList<Espacio> espacios = simu.fabricar_falsos_espacios(10);
        System.out.println(simu.falso_cantidad_lamparas());
        
        for (Iterator<Espacio> iterator = espacios.iterator(); iterator.hasNext();) {
            Espacio espacio = iterator.next();
            System.out.println(espacio);
        }
        
    }
    
}
