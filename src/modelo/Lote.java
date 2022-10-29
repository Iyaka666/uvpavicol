/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class Lote {
    private short cantidadAves;
    private short numeroMuertes;
    private Double numeroPromedio;
    private LocalDate fechaIngreso;
    private List<Alimento> alimentos;
    private List<Sacrificio> sacrificios;
}
