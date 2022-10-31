package modelo;

import java.util.LinkedList;
import java.util.List;
import util.exceptions.StringVoidException;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan
 * @author Santiago G.
 *
 */
public class Granja {

    private String departamento;
    private String municipio;
    private boolean propia;
    private List<Galpon> galpones = new LinkedList<>();
    private List<Convenio> convenios = null;

    public Granja(String departamento, String municipio, boolean propia) throws Exception {
        if ("".equals(departamento.trim())) {
            throw new StringVoidException("El departamento no puede ser un campo de texto vacio");
        }
        if ("".equals(municipio.trim())) {
            throw new StringVoidException("El municipio no puede ser un campo de texto vacio");
        }

        this.departamento = departamento;
        this.municipio = municipio;
        this.propia = propia;
        if (!propia) {
            convenios = new LinkedList<>();
        }
    }

}
