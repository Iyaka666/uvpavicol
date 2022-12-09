package modelo;

/**
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
public class Galpon {

    private String identificador;
    private short cantidadAvesAlojadas;

    public Galpon(String id, short avesAlojadas) {
        this.identificador = id;
        this.cantidadAvesAlojadas = avesAlojadas;
    }

    public String getIdentificador() {
        return identificador;
    }

    public short getCantidadAvesAlojadas() {
        return cantidadAvesAlojadas;
    }
    
    
}
