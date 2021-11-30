/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Edificio;
import model.Simulacion;

/**
 *
 * @author USER
 */
public class ControllerMain {
    public static Edificio edificio;
    private Simulacion simulacion;

    public ControllerMain() {
        this.edificio = new Edificio();
        this.simulacion = new Simulacion();
    }
  
    public void runApp(){
        //Implementar metodo para obtener si el programa inicia una simulacion o una demostracion
        int modo = 0;
        switch(modo)
        {
            case 1:
                runSimulation();
                break;
                
            case 2:
                runDemostracion();
                break;
            default:
                runDemostracion();
                break;
        }
    }
    
    public void runSimulation()
    {
        //Implemen
    }
    
    public void runDemostracion()
    {
        //Implementar metodo para correr la demostracion
        edificio = simulacion.fabricar_falso_edificio(2, 3);
        System.out.println("Edificio creado: OK");
        System.out.println(edificio);
        System.out.println("Calculando habitabilidad");
        simulacion.setEdificio(edificio);
        simulacion.CalcularHabitabilidad();
        System.out.println(edificio);
        
    }
}
