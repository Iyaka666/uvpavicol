package modelo;

import util.exceptions.StringVoidException;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan
 * @author Santiago G.
 *
 */
public class Contrasenia {

    private String llave;

    public Contrasenia(String llave) throws Exception {
        if ("".equals(llave.trim())) {
            throw new StringVoidException("La contrasenia no puede ser un campo vacio");
        }
        this.llave = llave;
    }

}
