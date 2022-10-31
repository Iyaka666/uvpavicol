package modelo;

import java.util.List;

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
    private List<Galpon> galpones;
    private List<Convenio> convenios;

    public Granja(String departamento, String municipio, boolean propia) {
        this.departamento = departamento;
        this.municipio = municipio;
        this.propia = propia;
    }
    
    
}
