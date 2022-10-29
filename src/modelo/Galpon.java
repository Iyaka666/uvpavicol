/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class Galpon {
    private long identificador;
    private int cantidadAvesAdultas;
    private List<Lote> lotes;

    public Galpon(long identificador, int cantidadAvesAdultas) {
        this.identificador = identificador;
        this.cantidadAvesAdultas = cantidadAvesAdultas;
    }
    
}
