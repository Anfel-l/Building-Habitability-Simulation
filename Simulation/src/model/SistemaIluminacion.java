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
public class SistemaIluminacion 
{
    private String nombre;
    private int value;
    
    
    
    public float obtenerIndiceLocal(float ancho,float largo,float altura){
        float indice_local = 0;
        switch(this.value)
        {
            case 0://Si el tipo de iluminacion es indirecta
                break;
            
            case 1://Si el tipo de iluminacion es directa
                indice_local = this.iluminacionDirecta(ancho, largo, altura);
                break;
                
            default://Si el tipo de iluminacion no es definido se usa directa
                indice_local = this.iluminacionDirecta(ancho, largo, altura);
                break;
        }
        return indice_local;
    }
    
    public float iluminacionDirecta(float ancho,float largo,float altura)
    {
        float indice_local_iluminacion_directa = 0;
        float ancho_largo = (ancho*largo);
        indice_local_iluminacion_directa = ancho_largo/(altura*(ancho_largo));
        return indice_local_iluminacion_directa;
    }
    
    public float iluminacionIndirecta(float ancho,float largo,float altura)
    {
        float indice_local_iluminacion_indirecta = 0;
        
        
        return indice_local_iluminacion_indirecta;
    }
    
    
}
