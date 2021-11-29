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
public class TiposEspacios {
    
    //Esta clase permite conocer el tipo de espacio que tiene ligado un espacio
    private String tipo_espacio;
    private float valor;
    /**
     * 
     * @param tipo_espacio nombre espacio
     * @param valor se refiere al nivel de iluminancia que requiere ese tipo de espacio en base a la actividad
     */
    public TiposEspacios(String tipo_espacio, float valor) {
        this.tipo_espacio = tipo_espacio;
        this.valor = valor;
    }
    
    public String getTipo_espacio() {
        return tipo_espacio;
    }

    public void setTipo_espacio(String tipo_espacio) {
        this.tipo_espacio = tipo_espacio;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
