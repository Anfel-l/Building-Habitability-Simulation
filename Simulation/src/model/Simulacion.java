/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

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
    
    public Simulacion() {
        
        this.edificio = null;
        this.algoritmo = new MetodoLumenes();
    }
    
    

    public void CalcularHabitabilidad() {
        for (Pisos piso_n : edificio.getPisos()) {
            for (Espacio espacio : piso_n.getEspacios()) {
                algoritmo.setEspacio(espacio);
                espacio.setHabitabilidad(algoritmo.procesarEspacio());
            }
        }

    }

    public LinkedList<Espacio> fabricar_falsos_espacios(int numero_espacios) {
        LinkedList<Espacio> espacios = new LinkedList<>();
        for (int i = 0; i < numero_espacios; i++) {
            //float desplaza = falso_desplazamiento_lamparas();
            //System.out.println("Desplazamiento generado: "+desplaza);
            Espacio espacio = new Espacio(falso_ancho(), falso_largo(), falso_altura(), falso_tipo_espacio(), falso_altura_trabajo(), falso_cantidad_lamparas(), falso_desplazamiento_lamparas(), falso_ambiente(), falso_sistema_iluminacion());
            
            espacios.add(espacio);
        }

        return espacios;
    }
    
    public LinkedList<Pisos> fabricar_falsos_pisos(int numero_pisos)
    {
        LinkedList<Pisos> pisos = new LinkedList<>();
        for (int i = 1; i <= numero_pisos; i++) {
            Pisos piso = new Pisos(i);
            pisos.add(piso);
        }
        return pisos;
    }
    
    public Edificio fabricar_falso_edificio(int numero_pisos, int numero_espacios_por_piso)
    {
        LinkedList<Pisos> pisos = fabricar_falsos_pisos(numero_pisos);
        
        for (Iterator<Pisos> iterator = pisos.iterator(); iterator.hasNext();) {
            Pisos piso = iterator.next();
            LinkedList<Espacio> espacios = fabricar_falsos_espacios(numero_espacios_por_piso);
            piso.setEspacios(espacios);
        }
        
        Edificio edificio_falso = new Edificio(pisos);
        
        return edificio_falso;
    }

    public double randomNumberInteger(int intervalo_minimo, int intervalo_maximo) {
        int rango = intervalo_maximo - intervalo_minimo;
        return Math.round((Math.random() * rango) + intervalo_minimo);
    }
    public double randomNumberDecimal(int intervalo_minimo, int intervalo_maximo) {
        int rango = intervalo_maximo - intervalo_minimo;
        return (Math.random() * rango) + intervalo_minimo;
    }

    public float falso_ancho() {
        return (float) randomNumberInteger(3, 10);
    }

    public float falso_largo() {
        return (float) randomNumberInteger(3, 7);
    }

    public float falso_altura() {
        return (float) randomNumberInteger(2, 4);
    }

    public float falso_altura_trabajo() {
        return (float) randomNumberDecimal(0, 1);
    }

    public TiposEspacios falso_tipo_espacio() {
        TiposEspacios tipo_espacio = null;
        switch ((int) randomNumberInteger(1, 7)) {
            case 1:
                tipo_espacio = Espacio.SALA_DESCANSO;
                break;
            case 2:
                tipo_espacio = Espacio.PASILLO;
                break;
            case 3:
                tipo_espacio = Espacio.RECEPCION;
                break;
            case 4:
                tipo_espacio = Espacio.SALA_CONFERENCIAS;
                break;
            case 5:
                tipo_espacio = Espacio.SALA_ESPERA;
                break;
            case 6:
                tipo_espacio = Espacio.HALL;
                break;
            case 7:
                tipo_espacio = Espacio.SALONES;
                break;
            default:
                tipo_espacio = Espacio.SALA_DESCANSO;
                break;
        }

        return tipo_espacio;
    }

    public TipoSistemaIluminacion falso_sistema_iluminacion() {
        TipoSistemaIluminacion tipo_sistema_iluminacion = null;

        switch ((int) randomNumberInteger(1, 2)) {
            case 1:
                tipo_sistema_iluminacion = Espacio.ILUMINACION_DIRECTA;
                break;
            case 2:

                tipo_sistema_iluminacion = Espacio.ILUMINACION_INDIRECTA;
                break;
            default:

                tipo_sistema_iluminacion = Espacio.ILUMINACION_DIRECTA;
                break;
        }
        return tipo_sistema_iluminacion;
    }

    public TipoAmbiente falso_ambiente() {
        TipoAmbiente tipo_ambiente = null;

        switch ((int) randomNumberInteger(1, 2)) {
            case 1:
                tipo_ambiente = Espacio.AMBIENTE_LIMPIO;
                break;
            case 2:

                tipo_ambiente = Espacio.AMBIENTE_SUCIO;
                break;
            default:

                tipo_ambiente = Espacio.AMBIENTE_LIMPIO;
                break;
        }
        return tipo_ambiente;
    }

    public int falso_cantidad_lamparas() {
        return (int) randomNumberInteger(1, 10);
    }
    
    public float falso_desplazamiento_lamparas() {
        return (float) randomNumberDecimal(0, 1);
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }
    
}
