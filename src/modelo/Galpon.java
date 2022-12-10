package modelo;

import excepciones.NegativoNoPermitidoException;
import excepciones.TextoVacioException;
import java.util.Objects;

/**
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
public class Galpon {

    private String identificador;
    private short cantidadAvesAlojadas;

    public Galpon(String id, short avesAlojadas) throws Exception{
        setIdentificador(identificador);
        setCantidadAvesAlojadas(cantidadAvesAlojadas);
    }

    public String getIdentificador() {
        
        return identificador;
    }

    public short getCantidadAvesAlojadas() {
        return cantidadAvesAlojadas;
    }

    public void setIdentificador(String identificador) throws Exception{
        if ("".equals(identificador)){
            throw new TextoVacioException("No hay nada escrito en el identificador");
        }
        this.identificador = identificador;
    }

    public void setCantidadAvesAlojadas(short cantidadAvesAlojadas) throws Exception{
        if(cantidadAvesAlojadas < 0 ){
            throw new NegativoNoPermitidoException("La cantidad de aves no es negativa");
        }
        this.cantidadAvesAlojadas = cantidadAvesAlojadas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Galpon other = (Galpon) obj;
        if (this.cantidadAvesAlojadas != other.cantidadAvesAlojadas) {
            return false;
        }
        return Objects.equals(this.identificador, other.identificador);
    }
    
    
}
