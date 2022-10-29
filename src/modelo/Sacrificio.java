/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class Sacrificio {
    private short cantidadAves;
    private LocalDate fechaRetiro;
    private LocalTime horaRetiro;

    public Sacrificio(short cantidadAves, LocalDate fechaRetiro, LocalTime horaRetiro) {
        this.cantidadAves = cantidadAves;
        this.fechaRetiro = fechaRetiro;
        this.horaRetiro = horaRetiro;
    }
    
    
}
