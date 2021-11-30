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

    private Espacio espacio;
    
    public static float coeficiente_techo_reflexion = (float) 0.5;
    public static float coeficiente_paredes_reflexion = (float) 0.3;
    public static float coeficiente_suelo_reflexion = (float) 0.1;
    
    public static int OL = 3350;
    public static int nLamparas = 2; 
    
    public static double[] matriz_indice_local= new double[]
    {
        0.60, 
        0.80, 
        1.00, 
        1.25, 
        1.50, 
        2.00, 
        2.50,
        3.00, 
        4.00, 
        5.00
    }; 
    public static double[] matriz_coeficiente_utilizacion = new double[]{
        0.18,
        0.23,
        0.28,
        0.32,
        0.35,
        0.40,
        0.43,
        0.46,
        0.49,
        0.51
    };
    
    public MetodoLumenes() 
    {
        

    }

    public Habitabilidad procesarEspacio()
    {
        float flujo_luminoso = 0;
        flujo_luminoso = this.obtenerFlujoLuminoso();
        int NL = 1;
        
        NL = this.obtenerNumeroLuminarias();
        float LARGO = this.getEspacio().getLargo_de_espacio();
        float ANCHO = this.getEspacio().getAncho_de_espacio();
        
        int Nancho = (int)this.obtenerFilaLuminarias(NL, ANCHO, LARGO);
        int Nlargo = (int)this.obtenerColumnaLuminarias(Nancho,ANCHO,LARGO);
        
        float Em = this.nivelIluminanciaMedio();
        float Cu = (float)this.calcular_coeficiente_utilizacion();
        float Cm = (float)this.getEspacio().obtenerCoeficienteMantenimiento();
        int lamparas = this.getEspacio().getCantidad_de_lamparas();
        float EmIdeal = this.getEspacio().obtenerIluminacionIdeal();
        
        float k = this.getEspacio().getIndice_local();
        
        Habitabilidad habitabilidad_espacio = new  Habitabilidad(Em, EmIdeal, NL, lamparas, Cu, Cm,k, flujo_luminoso);
        
        return habitabilidad_espacio;
    }
    
    public float obtenerFilaLuminarias(double NL, float ANCHO, float LARGO)
    {
        float numero_de_filas_luminarias = 0;
        float NL_largo_ancho = (float)((NL*ANCHO)/LARGO);
        numero_de_filas_luminarias = (float) Math.sqrt(NL_largo_ancho);
        return numero_de_filas_luminarias;
    }
    
    public float obtenerColumnaLuminarias(float Nancho, float ANCHO, float LARGO)
    {
        return (Nancho*(LARGO/ANCHO));
    }
    
    public float nivelIluminanciaMedio()
    {
        float Em = 0;
        
        Espacio espacio_actual = this.getEspacio();
        
        float Cm = espacio_actual.obtenerCoeficienteMantenimiento(); //Cm = Coeficiente de mantenimiento
        
        double Cu = this.calcular_coeficiente_utilizacion(); //Cu = Coeficiente de utilizacion
        
        int NL = this.obtenerNumeroLuminarias(); //NL = Numero de luminarias necesarias
        
        int n = MetodoLumenes.nLamparas; //n = Numero de lamparas en una luminaria
        
        int Ol = MetodoLumenes.OL; //Ol = Flujo luminoso
        
        float S = espacio_actual.obtenerSuperficie(); //S = superficie (m^2)
        
        Em =  (float) (NL*n*Ol*Cu*Cm/S);
                
        return Em;
    }

    public float obtenerFlujoLuminoso()
    {
        float OT = 0;
        float Em = this.espacio.obtenerIluminacionIdeal();
        float S = this.espacio.obtenerSuperficie();
        float Cu = (float)this.calcular_coeficiente_utilizacion();
        float Cm = this.espacio.obtenerCoeficienteMantenimiento();
        
        OT = (Em*S)/(Cu*Cm);
        
        
        return OT;
    }
    
    public double calcular_coeficiente_utilizacion()
    {
        
        double Cu = MetodoLumenes.matriz_coeficiente_utilizacion[MetodoLumenes.matriz_coeficiente_utilizacion.length-1];
        for (int i = 0; i < MetodoLumenes.matriz_indice_local.length; i++) {
            System.out.println("Comparacion:"+this.espacio.obtenerIndiceLocal()+":"+MetodoLumenes.matriz_indice_local[i]);
            if ( this.espacio.obtenerIndiceLocal() <= MetodoLumenes.matriz_indice_local[i]) {
               
                Cu = MetodoLumenes.matriz_coeficiente_utilizacion[i];
                break;
            }
        }
        
        return Cu;
    }
    
    public int obtenerNumeroLuminarias()
    {
        float NL = 0;
        float OT = 0;
        float n = MetodoLumenes.nLamparas;
        float OL = MetodoLumenes.OL;
        
        OT = this.obtenerFlujoLuminoso();
        
        NL = OT/(n*OL);

        return Math.round(NL);
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }
}
