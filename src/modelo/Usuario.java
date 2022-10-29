/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class Usuario extends Persona{
    private String nombre;
    private Contrasenia contrasenia;
    private Granja granjaAcargo;

    public Usuario(String nombre, Contrasenia contrasenia, Granja granjaAcargo, long nuip, String nombreCompleto, String correoElectronico) {
        super(nuip, nombreCompleto, correoElectronico);
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.granjaAcargo = granjaAcargo;
    }
    
    
}
