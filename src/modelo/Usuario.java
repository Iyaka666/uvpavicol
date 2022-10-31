package modelo;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan 
 * @author Santiago G.
 * 
 */
public class Usuario extends Persona{
    /*
    Se omite este atributo modificandolo del diagrama de clases ya que el nombre completo de la
    persona se puede establecer como nombre de usuario
    */
    //private String nombre;
    
    private Contrasenia contrasenia;
    private Granja granjaAcargo;

    public Usuario(Contrasenia contrasenia, Granja granjaAcargo, long nuip, String nombreCompleto, String correoElectronico) {
        super(nuip, nombreCompleto, correoElectronico);
        this.contrasenia = contrasenia;
        this.granjaAcargo = granjaAcargo;
    }
    
}
