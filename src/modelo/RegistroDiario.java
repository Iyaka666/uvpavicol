package modelo;

import java.time.LocalDate;

/**
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
enum Alimento{
    INICIADOR,CRECIMIENTO,ENGORDE
}

public class RegistroDiario {
    private LocalDate fechaRegistroDiario;
    private short cantidadAvesIngreso;
    private Alimento tipoAlimento;
    private short cantidadAlimento;
    private short cantidadAvesMuertasEnfermedad;
    

    public RegistroDiario(LocalDate fechaRegistroDiario) {
        this.fechaRegistroDiario = fechaRegistroDiario;
    }
    
    
}
