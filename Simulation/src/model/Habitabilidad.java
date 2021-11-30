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
public class Habitabilidad {
    private boolean es_habitable;
    
    private float nivel_iluminacion_medio;
    private float nivel_iluminacion_medio_esperado;
    
    private int numero_luminarias_ideal;
    private int numero_luminarias_actual;

    public Habitabilidad(float nivel_iluminacion_medio, float nivel_iluminacion_medio_esperado, int numero_luminarias_ideal, int numero_luminarias_actual) {
        this.es_habitable = false;
        this.nivel_iluminacion_medio = nivel_iluminacion_medio;
        this.nivel_iluminacion_medio_esperado = nivel_iluminacion_medio_esperado;
        this.numero_luminarias_ideal = numero_luminarias_ideal;
        this.numero_luminarias_actual = numero_luminarias_actual;
    }

    public boolean Es_habitable() {
        return this.nivel_iluminacion_medio >= this.nivel_iluminacion_medio;
    }

    public void setHabitable() {
        this.es_habitable = Es_habitable();
    }

    public float getNivel_iluminacion_medio() {
        return nivel_iluminacion_medio;
    }

    public void setNivel_iluminacion_medio(float nivel_iluminacion_medio) {
        this.nivel_iluminacion_medio = nivel_iluminacion_medio;
    }

    public float getNivel_iluminacion_medio_esperado() {
        return nivel_iluminacion_medio_esperado;
    }

    public void setNivel_iluminacion_medio_esperado(float nivel_iluminacion_medio_esperado) {
        this.nivel_iluminacion_medio_esperado = nivel_iluminacion_medio_esperado;
    }

    public int getNumero_luminarias_ideal() {
        return numero_luminarias_ideal;
    }

    public void setNumero_luminarias_ideal(int numero_luminarias_ideal) {
        this.numero_luminarias_ideal = numero_luminarias_ideal;
    }

    public int getNumero_luminarias_actual() {
        return numero_luminarias_actual;
    }

    public void setNumero_luminarias_actual(int numero_luminarias_actual) {
        this.numero_luminarias_actual = numero_luminarias_actual;
    }
    
    
}