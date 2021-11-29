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
    private static float INCANDESCENTES;
    private static float HALOGENAS;
    private static float FLUORESCENTES;
    private static float LED;
    
    public void cargarValoresLamparas()
    {
        INCANDESCENTES = 12;
        HALOGENAS = 10;
        FLUORESCENTES = 70;
        LED =50; 
    }
}
