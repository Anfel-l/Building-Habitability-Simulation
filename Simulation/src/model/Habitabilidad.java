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
    
    private float Cu;
    private float Cm;
    
    private float k;
    float flujo_luminoso;

    public Habitabilidad(float nivel_iluminacion_medio, float nivel_iluminacion_medio_esperado, int numero_luminarias_ideal, int numero_luminarias_actual, float Cu, float Cm, float k, float flujo_luminoso) {
        this.es_habitable = false;
        this.nivel_iluminacion_medio = nivel_iluminacion_medio;
        this.nivel_iluminacion_medio_esperado = nivel_iluminacion_medio_esperado;
        this.numero_luminarias_ideal = numero_luminarias_ideal;
        this.numero_luminarias_actual = numero_luminarias_actual;
        this.Cu = Cu;
        this.Cm = Cm;
        this.k = k;
        this.flujo_luminoso = flujo_luminoso;
    }

    @Override
    public String toString() {
        return "Habitabilidad{" + "es_habitable=" + es_habitable + ", nivel_iluminacion_medio=" + nivel_iluminacion_medio + ", nivel_iluminacion_medio_esperado=" + nivel_iluminacion_medio_esperado + ", numero_luminarias_ideal=" + numero_luminarias_ideal + ", numero_luminarias_actual=" + numero_luminarias_actual + ", Cu=" + Cu + ", Cm=" + Cm + ", k=" + k + ", flujo_luminoso=" + flujo_luminoso + '}';
    }

    

    
    

    public boolean Es_habitable() {

        return this.nivel_iluminacion_medio >= this.nivel_iluminacion_medio_esperado;
    }

    public void setHabitable() {
        this.es_habitable = this.Es_habitable();
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

    public boolean isEs_habitable() {
        return es_habitable;
    }

    public void setEs_habitable(boolean es_habitable) {
        this.es_habitable = es_habitable;
    }

    public float getCu() {
        return Cu;
    }

    public void setCu(float Cu) {
        this.Cu = Cu;
    }

    public float getCm() {
        return Cm;
    }

    public void setCm(float Cm) {
        this.Cm = Cm;
    }

    public float getK() {
        return k;
    }

    public void setK(float k) {
        this.k = k;
    }

    public float getFlujo_luminoso() {
        return flujo_luminoso;
    }

    public void setFlujo_luminoso(float flujo_luminoso) {
        this.flujo_luminoso = flujo_luminoso;
    }
    
    
}