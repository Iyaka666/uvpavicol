package modelo;

/**
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private Granja granja;

    public Usuario(String nombre, String correo, String contrasenia, Granja granja) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.granja = granja;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Granja getGranja() {
        return granja;
    }
    
    
    public boolean esRoot(){
        return this.nombre.toLowerCase().equals("root");
    }
    
}
