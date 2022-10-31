package modelo;

import util.exceptions.OutRangeAtribbuteException;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan
 * @author Santiago G.
 *
 */
public class Propietario extends Persona {

    private long telefono;

    public Propietario(long telefono, long nuip, String nombreCompleto,
            String correoElectronico) throws Exception {
        super(nuip, nombreCompleto, correoElectronico);
        if (!(telefono >= 1000000000L && telefono <= 9999999999L)) {
            throw new OutRangeAtribbuteException("El numero de telefono no tiene"
                    + " 10 digitos");
        }
        this.telefono = telefono;
    }

}
