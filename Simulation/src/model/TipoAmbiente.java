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
public class TipoAmbiente {
    
    //Esta clase permite conocer el tipo de ambiente que tiene ligado un espacio
    private String tipo_ambiente;
    private float valor;
    /**
     * 
     * @param tipo_ambiente nombre del tipo de ambiente
     * @param valor se refiere al coeficiente de mantenimiento
     */
    public TipoAmbiente(String tipo_ambiente, float valor) {
        this.tipo_ambiente = tipo_ambiente;
        this.valor = valor;
    }
    
    public String getTipoAmbiente() {
        return tipo_ambiente;
    }

    public void setTipoAmbiente(String tipo_ambiente) {
        this.tipo_ambiente = tipo_ambiente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
