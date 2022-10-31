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
public class Empresa {
    private String nombre;
    private List<Usuario> usuarios = new LinkedList<>();
    private List<Granja> granjas = new LinkedList<>();
    private List<Galpon> galpones = new LinkedList<>();
    private List<Lote> lotes = new LinkedList<>();

    public Empresa(String nombre) throws Exception{
        if("".equals(nombre.trim())){
            throw new StringVoidException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }
    
}
