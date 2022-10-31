package modelo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import util.exceptions.NegativeInvalidException;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Juan 
 * @author Santiago G.
 * 
 */
public class Lote {
    private short cantidadAves;
    private short numeroMuertes;
    private Double numeroPromedio;
    private LocalDate fechaIngreso;
    private List<Alimento> alimentos = new LinkedList<>();
    private List<Sacrificio> sacrificios = new LinkedList<>();

    public Lote(short cantidadAves, LocalDate fechaIngreso) throws Exception{
        if(!(cantidadAves >= 0)){
            throw new NegativeInvalidException("La cantidad de aves no puede ser negativa");
        }
        
        this.cantidadAves = cantidadAves;
        this.numeroMuertes = 0;
        this.numeroPromedio = 0.0;
        this.fechaIngreso = fechaIngreso;
    }
    
    
}
