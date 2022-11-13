package modelo;

import java.util.List;

/**
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
public class Lote {
    private List<RegistroDiario> registrosDiarios;
    private List<Salida> salidas;
    private Galpon galpon;
    
    public Lote(Galpon galpon){
        this.galpon = galpon;
    }
}
