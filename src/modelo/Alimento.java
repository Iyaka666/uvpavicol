package modelo;

import util.exceptions.StringVoidException;
import util.exceptions.NegativeInvalidException;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan
 * @author Santiago G.
 *
 */
public class Alimento {

    private String tipo;
    private short cantidad;

    public Alimento(String tipo, short cantidad) throws Exception {
        if ("".equals(tipo.trim())) {
            throw new StringVoidException("El tipo no puede estar vacio");
        }
        if (!(cantidad > 0)) {
            throw new NegativeInvalidException("La cantidad no puede ser un numero negativo");
        }
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

}
