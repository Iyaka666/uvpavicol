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
