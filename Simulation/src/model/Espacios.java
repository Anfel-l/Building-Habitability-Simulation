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

    /*
     Variables para el calculo del flujo luminoso y nivel de iluminacion medio
    */

    //Tipos de espacios para un espacio
    public static final TiposEspacios APARTAMENTO = new TiposEspacios("Apartamento", (float)0);
    public static final TiposEspacios PASILLO = new TiposEspacios("Pasillos", (float)100);
    public static final TiposEspacios RECEPCION = new TiposEspacios("Recepcion", (float)300);
    public static final TiposEspacios SALA_CONFERENCIAS = new TiposEspacios("Sala_conferencias", (float)500);
    public static final TiposEspacios SALA_ESPERA = new TiposEspacios("Sala_espera", 200);
    
    //Tipo de sistema de iluminacion
    public static final TipoSistemaIluminacion ILUMINACION_DIRECTA = new TipoSistemaIluminacion("Iluminacion directa", 1);
    public static final TipoSistemaIluminacion ILUMINACION_INDIRECTA = new TipoSistemaIluminacion("Iluminacion indirecta", 0);
    
    //Tipos de ambiente para un espacio
    public static final TipoAmbiente AMBIENTE_LIMPIO = new TipoAmbiente("Limpio",(float)0.8);
    public static final TipoAmbiente AMBIENTE_SUCIO = new TipoAmbiente("Sucio",(float)0.6);

    //Parametros para calcular medidas del espacio
    //enum TiposEspacios{APARTAMENTO,PASILLO,RECEPCION}
    

    private float nivel_medio_iluminancia; //Nivel de iluminancia del espacio
    private float nivel_medio_iluminancia_esperado; //Nivel de iluminancia esperado segun NORMAs

    //Medidas del espacio
    private float ancho_de_espacio;
    private float largo_de_espacio;
    private float altura_de_espacio;

    //Area de trabajo
    private float altura_de_trabajo;
    
    //Variables para el calculo de    
    private float indice_local;

    

    //Valor obtenido segun reglas europeas
    private TiposEspacios tipo_de_espacio;

    private TipoAmbiente tipo_ambiente; 
    
    private TipoSistemaIluminacion tipo_sistema_iluminacion;
 
    //Varibles para el calculo del numero de luminarias

    private int cantidad_de_lamparas;
    private String tipo_de_lamparas;
    private float desplazamiento_de_lamparas;
    
    //Habitabilidad del espacio
    
    Habitabilidad habitabilidad;


    public Espacios(float ancho_de_espacio, float largo_de_espacio, float altura_de_espacio, TiposEspacios tipo_de_espacio, float altura_de_trabajo, int cantidad_de_lamparas, String tipo_de_lamparas, float desplazamiento_de_lamparas, TipoAmbiente tipo_ambiente, TipoSistemaIluminacion tipo_sistema_iluminacion) {
        this.ancho_de_espacio = ancho_de_espacio;
        this.largo_de_espacio = largo_de_espacio;
        this.altura_de_espacio = altura_de_espacio;
        this.tipo_de_espacio = tipo_de_espacio;
        this.altura_de_trabajo = altura_de_trabajo;
        this.cantidad_de_lamparas = cantidad_de_lamparas;
        this.tipo_de_lamparas = tipo_de_lamparas;
        this.desplazamiento_de_lamparas = desplazamiento_de_lamparas;
        this.nivel_medio_iluminancia = 0;
        this.nivel_medio_iluminancia_esperado = 0;
        this.tipo_ambiente = tipo_ambiente;
        this.tipo_sistema_iluminacion = tipo_sistema_iluminacion;
        
        this.habitabilidad = null;
    }

    public Habitabilidad getHabitabilidad() {
        return habitabilidad;
    }

    public void setHabitabilidad(Habitabilidad habitabilidad) {
        this.habitabilidad = habitabilidad;
    }
    
    public float obtenerSuperficie()
    {
     return this.ancho_de_espacio*this.largo_de_espacio;
    }
    
    public float obtenerCoeficienteMantenimiento()
    {
        return this.tipo_ambiente.getValor();
    }
    
    public float obtenerIluminacionIdeal()
    {
        return this.tipo_de_espacio.getValor();
    }
    
    public float obtenerIndiceLocal()
    {
        return this.tipo_ambiente.getValor();
    }

    public float getNivel_medio_iluminancia() {
        return nivel_medio_iluminancia;
    }

    public void setNivel_medio_iluminancia(float nivel_medio_iluminancia) {
        this.nivel_medio_iluminancia = nivel_medio_iluminancia;
    }

    public float getNivel_medio_iluminancia_esperado() {
        return nivel_medio_iluminancia_esperado;
    }

    public void setNivel_medio_iluminancia_esperado(float nivel_medio_iluminancia_esperado) {
        this.nivel_medio_iluminancia_esperado = nivel_medio_iluminancia_esperado;
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

    public float getAltura_de_trabajo() {
        return altura_de_trabajo;
    }

    public void setAltura_de_trabajo(float altura_de_trabajo) {
        this.altura_de_trabajo = altura_de_trabajo;
    }

    public float getIndice_local() {
        return indice_local;
    }

    public void setIndice_local(float indice_local) {
        this.indice_local = indice_local;
    }

    public TiposEspacios getTipo_de_espacio() {
        return tipo_de_espacio;
    }

    public void setTipo_de_espacio(TiposEspacios tipo_de_espacio) {
        this.tipo_de_espacio = tipo_de_espacio;
    }

    public TipoAmbiente getTipo_ambiente() {
        return tipo_ambiente;
    }

    public void setTipo_ambiente(TipoAmbiente tipo_ambiente) {
        this.tipo_ambiente = tipo_ambiente;
    }

    public TipoSistemaIluminacion getTipo_sistema_iluminacion() {
        return tipo_sistema_iluminacion;
    }

    public void setTipo_sistema_iluminacion(TipoSistemaIluminacion tipo_sistema_iluminacion) {
        this.tipo_sistema_iluminacion = tipo_sistema_iluminacion;
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
