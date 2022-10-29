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
public class Empresa {
    private String nombre;
    private List<Usuario> usuarios;
    private List<Granja> granjas;
    private List<Galpon> galpones;
    private List<Lote> lotes;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }
    
}
