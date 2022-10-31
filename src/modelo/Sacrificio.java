package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import util.exceptions.NegativeInvalidException;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan 
 * @author Santiago G.
 * 
 */
public class Sacrificio {
    private short cantidadAves;
    private LocalDate fechaRetiro;
    private LocalTime horaRetiro;

    public Sacrificio(short cantidadAves, LocalDate fechaRetiro, LocalTime horaRetiro) throws Exception{
        if(!(cantidadAves >= 0)){
            throw new NegativeInvalidException("La cantidad de aves no puede ser negativa");
        }
        this.cantidadAves = cantidadAves;
        this.fechaRetiro = fechaRetiro;
        this.horaRetiro = horaRetiro;
    }
    
    
}
