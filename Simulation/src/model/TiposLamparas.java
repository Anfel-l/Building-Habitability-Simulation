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
public class TiposLamparas {
    

    //Esta clase permite conocer el tipo de lampara que tiene ligado un espacio
    private String tipo_lampara;
    private float valor;
    

    public TiposLamparas(String tipo_lampara, float valor) {
        this.tipo_lampara = tipo_lampara;
        this.valor = valor;
    }

    public String getTipo_de_lamparas() {
        return tipo_lampara;
    }

    public void setTipo_de_lamparas(String tipo_lamapara) {
        this.tipo_lampara = tipo_lamapara;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

   /**private static float INCANDESCENTES;
    private static float HALOGENAS;
    private static float FLUORESCENTES;
    private static float LED;
    
    public void cargarValoresLamparas()
    {
        INCANDESCENTES = 12;
        HALOGENAS = 10;
        FLUORESCENTES = 70;
        LED =50; 
    } */ 
}
