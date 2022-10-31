package modelo;

import java.time.LocalDate;
import java.util.List;

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
    private List<Alimento> alimentos;
    private List<Sacrificio> sacrificios;

    public Lote(short cantidadAves, short numeroMuertes, Double numeroPromedio, LocalDate fechaIngreso) {
        this.cantidadAves = cantidadAves;
        this.numeroMuertes = numeroMuertes;
        this.numeroPromedio = numeroPromedio;
        this.fechaIngreso = fechaIngreso;
    }
    
    
}
