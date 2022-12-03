package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
public class Salida {
    private LocalDate fechaSalida;
    private LocalTime tiempoSalida;
    private EstadoLote estadoLote; 
    //otros atributos
    private short avesASacrificio;

    public Salida(LocalDate fechaSalida, LocalTime tiempoSalida, EstadoLote estadoLote) {
        this.fechaSalida = fechaSalida;
        this.tiempoSalida = tiempoSalida;
        this.estadoLote = estadoLote;
    }
    
    
}
