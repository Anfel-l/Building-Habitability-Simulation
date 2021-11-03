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
class Espacios {
    
    //Parametros para calcular medidas del espacio
   //enum TiposEspacios{APARTAMENTO,PASILLO,RECEPCION}
    private float ancho_de_espacio;
    private float largo_de_espacio;
    private float altura_de_espacio;
    
    private Float tipo_de_espacio; //Valor obtenido segun reglas europeas
    
    
    //Area de trabajo
    private float altura_de_trabajo;
    
    
    
    //Cantidad de lamparas en el espacio
    private int cantidad_de_lamparas;
    
    //Tipos de lamparas
    
    private String tipo_de_lamparas;
    
    
    //Desplazamiento de las lamparas entre sí
    private float desplazamiento_de_lamparas;

    public Espacios(float ancho_de_espacio, float largo_de_espacio, float altura_de_espacio, Float tipo_de_espacio, float altura_de_trabajo, int cantidad_de_lamparas, String tipo_de_lamparas, float desplazamiento_de_lamparas) {
        this.ancho_de_espacio = ancho_de_espacio;
        this.largo_de_espacio = largo_de_espacio;
        this.altura_de_espacio = altura_de_espacio;
        this.tipo_de_espacio = tipo_de_espacio;
        this.altura_de_trabajo = altura_de_trabajo;
        this.cantidad_de_lamparas = cantidad_de_lamparas;
        this.tipo_de_lamparas = tipo_de_lamparas;
        this.desplazamiento_de_lamparas = desplazamiento_de_lamparas;
    }

    public float getAncho_de_espacio() {
        
        return ancho_de_espacio;
        
    }

    public void setAncho_de_espacio(float ancho_de_espacio) {
        this.ancho_de_espacio = ancho_de_espacio;
    }

    public float getLargo_de_espacio() {
        return largo_de_espacio;
    }

    public void setLargo_de_espacio(float largo_de_espacio) {
        this.largo_de_espacio = largo_de_espacio;
    }

    public float getAltura_de_espacio() {
        return altura_de_espacio;
    }

    public void setAltura_de_espacio(float altura_de_espacio) {
        this.altura_de_espacio = altura_de_espacio;
    }

    public Float getTipo_de_espacio() {
        return tipo_de_espacio;
    }

    public void setTipo_de_espacio(Float tipo_de_espacio) {
        this.tipo_de_espacio = tipo_de_espacio;
    }

    public float getAltura_de_trabajo() {
        return altura_de_trabajo;
    }

    public void setAltura_de_trabajo(float altura_de_trabajo) {
        this.altura_de_trabajo = altura_de_trabajo;
    }

    public int getCantidad_de_lamparas() {
        return cantidad_de_lamparas;
    }

    public void setCantidad_de_lamparas(int cantidad_de_lamparas) {
        this.cantidad_de_lamparas = cantidad_de_lamparas;
    }

    public String getTipo_de_lamparas() {
        return tipo_de_lamparas;
    }

    public void setTipo_de_lamparas(String tipo_de_lamparas) {
        this.tipo_de_lamparas = tipo_de_lamparas;
    }

    public float getDesplazamiento_de_lamparas() {
        return desplazamiento_de_lamparas;
    }

    public void setDesplazamiento_de_lamparas(float desplazamiento_de_lamparas) {
        this.desplazamiento_de_lamparas = desplazamiento_de_lamparas;
    }
    
    
    
    
   
    
}
