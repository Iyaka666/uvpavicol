package modelo;

import java.util.List;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan 
 * @author Santiago G.
 * 
 */
public class Galpon {
    private long identificador;
    private int cantidadAvesAdultas;
    private List<Lote> lotes;

    public Galpon(long identificador, int cantidadAvesAdultas) {
        this.identificador = identificador;
        this.cantidadAvesAdultas = cantidadAvesAdultas;
    }
    
    
}
