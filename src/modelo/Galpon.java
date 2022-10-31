package modelo;

import java.util.LinkedList;
import java.util.List;
import util.exceptions.NegativeInvalidException;

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
    private List<Lote> lotes = new LinkedList<>();

    public Galpon(long identificador, int cantidadAvesAdultas) throws Exception{
        if (!(identificador >= 0)){
            throw new NegativeInvalidException("El identificador no puede ser "
                    + "un numero negativo");
        }
        if (!(cantidadAvesAdultas >= 0)){
            throw new NegativeInvalidException("La cantidad de aves adultas no "
                    + "puede ser un numero negativo");
        }
        this.identificador = identificador;
        this.cantidadAvesAdultas = cantidadAvesAdultas;
    }
    
    
}
