/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class Propietario extends Persona{
    private long telefono;

    public Propietario(long telefono, long nuip, String nombreCompleto, String correoElectronico) {
        super(nuip, nombreCompleto, correoElectronico);
        this.telefono = telefono;
    }
    
    
}
