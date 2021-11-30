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
public class TipoSistemaIluminacion {

    private String nombre;
    private int value;

    public TipoSistemaIluminacion(String nombre, int value) {
        this.nombre = nombre;
        this.value = value;
    }

    @Override
    public String toString() {
        return "TipoSistemaIluminacion{" + "nombre=" + nombre + ", value=" + value + '}';
    }
 
    public float obtenerIndiceLocal(float ancho, float largo, float altura, float plano_trabajo) {
        float indice_local = 0;
        switch (this.value) {
            case 0://Si el tipo de iluminacion es indirecta
                indice_local = this.iluminacionIndirecta(ancho, largo, altura, plano_trabajo);
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

    public float iluminacionDirecta(float ancho, float largo, float altura) {
        float indice_local_iluminacion_directa = 0;
        float ancho_largo = (ancho * largo);
        indice_local_iluminacion_directa = ancho_largo / (altura * (ancho+largo));
        return indice_local_iluminacion_directa;
    }

    public float iluminacionIndirecta(float ancho, float largo, float altura, float plano_trabajos) {
        float indice_local_iluminacion_indirecta = 0;

        indice_local_iluminacion_indirecta = (3 * ancho * largo) / (2 * (altura + plano_trabajos) * (ancho + largo));

        return indice_local_iluminacion_indirecta;
    }

}
