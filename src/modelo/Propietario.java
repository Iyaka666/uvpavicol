package modelo;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan 
 * @author Santiago G.
 * 
 */
public class Propietario extends Persona{
    private long telefono;

    public Propietario(long telefono, long nuip, String nombreCompleto, String correoElectronico) {
        super(nuip, nombreCompleto, correoElectronico);
        this.telefono = telefono;
    }
    
    
}
