package modelo;

/**
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
public class Municipio {
    private String nombre;
    private Departamento departamento;

    public Municipio(String nombreMunicipio, Departamento departamento) {
        this.nombre = nombreMunicipio;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    
    
    @Override
    public String toString() {
        return this.nombre;
    }    
}
