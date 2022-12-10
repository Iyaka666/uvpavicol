package modelo;

import excepciones.ValorIncorrectoException;
import excepciones.NegativoNoPermitidoException;
import excepciones.TextoVacioException;

/**
 *
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
public class Propietario {
    private long identificacion;
    private String nombre;
    private long telefono;
    private String correo;

    public Propietario(long identificacion, String nombre, long telefono, String correo) throws Exception{
        setIdentificacion(identificacion);
        setNombre(nombre);
        setTelefono(telefono);
        setCorreo(correo);
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }  

    public void setIdentificacion(long identificacion) throws Exception{
        if(!(identificacion >= 1000000 && identificacion <= 1000000000)){
            throw new ValorIncorrectoException("La identificacion debe "
                    + "ser un numero entre 7 o 10 digitos");
        }
        if (identificacion < 0){
            throw new NegativoNoPermitidoException("La identificacion no puede "
                    + "ser un numero negativo");
        }
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) throws Exception{
        if ("".equals(nombre.trim())){
            throw new TextoVacioException("El nombre no contiene texto");
        }
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) throws Exception{
        if(!(telefono >= 1000000 && telefono <= 1000000000)){
            throw new ValorIncorrectoException("El numero de telefono debe "
                    + "ser un numero entre 7 o 10 digitos");
        }
        this.telefono = telefono;
    }

    public void setCorreo(String correo) throws Exception{
        if ("".equals(correo.trim())){
            throw new TextoVacioException("El correo no contiene texto");
        }
        this.correo = correo;
    }
    
    
    
}
