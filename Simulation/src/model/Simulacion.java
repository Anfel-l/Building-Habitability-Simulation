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

    public void CalcularHabitabilidad() {
        for (Pisos piso_n : edificio.getPisos()) {
            for (Espacio espacio : piso_n.getEspacios()) {
                algoritmo.setEspacio(espacio);
                algoritmo.procesarEspacio();
            }
        }

    }

    public LinkedList<Espacio> fabricar_falsos_espacios(int numero_espacios) {
        LinkedList<Espacio> espacios = new LinkedList<>();
        for (int i = 0; i < numero_espacios; i++) {
            //Espacio espacio = new Espacio(numero_espacios, numero_espacios, numero_espacios, tipo_de_espacio, numero_espacios, numero_espacios, numero_espacios, tipo_ambiente, tipo_sistema_iluminacion);

        }

        return espacios;
    }

    public double randomNumber(int intervalo_minimo, int intervalo_maximo) {
        int rango = intervalo_minimo - intervalo_minimo;
        return (Math.random() * rango) + intervalo_minimo;
    }

    public float falso_ancho() {
        return (float) randomNumber(3, 10);
    }

    public float falso_largo() {
        return (float) randomNumber(3, 7);
    }

    public float falso_altura() {
        return (float) randomNumber(2, 4);
    }

    public float falso_altura_trabajo() {
        return (float) randomNumber(0, 1);
    }

    public TiposEspacios falso_tipo_espacio() {
        TiposEspacios tipo_espacio = null;
        switch ((int) randomNumber(1, 7)) {
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

        switch ((int) randomNumber(1, 2)) {
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

        switch ((int) randomNumber(1, 2)) {
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
        return (int) randomNumber(1, 10);
    }
    
    public float falso_desplazamiento_lamparas() {
        return (float) randomNumber(0, 1);
    }

}
