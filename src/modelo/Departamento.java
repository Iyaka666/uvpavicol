package modelo;

/**
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
public class Departamento {
    private String nombre;
    
    public Departamento( String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public String getNombre() {
        return nombre;
    }  
    
}
