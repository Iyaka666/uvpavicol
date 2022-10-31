package modelo;

import java.util.List;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan 
 * @author Santiago G.
 * 
 */
public class Empresa {
    private String nombre;
    private List<Usuario> usuarios;
    private List<Granja> granjas;
    private List<Galpon> galpones;
    private List<Lote> lotes;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }
    
}
