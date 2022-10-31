package modelo;

import util.exceptions.OutRangeAtribbuteException;
import util.exceptions.StringVoidException;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan
 * @author Santiago G.
 *
 */
public class Persona {

    private long nuip;
    private String nombreCompleto;
    private String correoElectronico;

    public Persona(long nuip, String nombreCompleto, String correoElectronico)
            throws Exception {
        if (!(nuip >= 1000000 && nuip <= 9999999999L)) {
            throw new OutRangeAtribbuteException("El documento de identificacion"
                    + " debe contener entre 7 y 10 digitos");
        }
        if ("".equals(nombreCompleto.trim())) {
            throw new StringVoidException("El nombre no puede estar vacio");
        }
        if ("".equals(correoElectronico.trim())) {
            throw new StringVoidException("El correo no puede estar vacio");
        }
        this.nuip = nuip;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
    }

}
