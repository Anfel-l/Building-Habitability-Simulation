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
public class MetodoLumenes {

    private Espacios espacio;
    
    public static float coeficiente_techo_reflexion = (float) 0.5;
    public static float coeficiente_paredes_reflexion = (float) 0.3;
    public static float coeficiente_suelo_reflexion = (float) 0.1;
 
    public MetodoLumenes() 
    {

    }

    public void procesarEspacio()
    {
        float flujo_luminoso = 0;
        flujo_luminoso = this.obtenerFlujoLuminoso(); 

    }

    public float obtenerFlujoLuminoso()
    {
        float OT = 0;
        float Em = this.espacio.obtenerIluminacionIdeal();
        float S = this.espacio.obtenerSuperficie();
        float Cu = this.calcular_coeficiente_utilizacion();
        float Cm = this.espacio.obtenerCoeficienteMantenimiento();
        
        OT = (Em*S)/(Cu*Cm);
        
        return OT;
    }
    
    public float calcular_coeficiente_utilizacion()
    {
        float Cu = 0;
        
        return Cu;
    }
    
    public float obtenerNumeroLuminarias()
    {
        float NL = 0;
        float OT = 0;
        float n = 0;
        float OL = 0;
        
        OT = this.obtenerFlujoLuminoso();
        
        NL = OT/(n*OL);

        return NL;
    }

    public Espacios getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacios espacio) {
        this.espacio = espacio;
    }
}
