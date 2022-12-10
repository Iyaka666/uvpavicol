package modelo;

import excepciones.ObjetoNoInicializadoException;
import excepciones.ListaVaciaNoPermitidoException;
import excepciones.AtributosIncorrectosException;
import java.util.List;
import java.util.Objects;

/**
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
public class Granja {

    private TipoGranja tipoGranja;
    private EstadoConvenio estadoConvenio;
    private Municipio municipio;
    private Propietario propietario;
    private List<Galpon> galpones;

    public Granja(TipoGranja tipoGranja, EstadoConvenio estadoConvenio,
            Municipio municipio, Propietario propietario) throws Exception {
        setTipoGranja(tipoGranja);
        setEstadoConvenio(estadoConvenio);
        setMunicipio(municipio);
        setPropietario(propietario);
    }

    public TipoGranja getTipoGranja() {
        return tipoGranja;
    }

    public EstadoConvenio getEstadoConvenio() {
        return estadoConvenio;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public List<Galpon> getGalpones() {
        return galpones;
    }

    public void setTipoGranja(TipoGranja tipoGranja) {
        this.tipoGranja = tipoGranja;
    }

    public void setEstadoConvenio(EstadoConvenio estadoConvenio) {
        this.estadoConvenio = estadoConvenio;
    }

    public void setMunicipio(Municipio municipio) throws Exception {
        if (municipio == null) {
            throw new ObjetoNoInicializadoException("El municipio o el departamento "
                    + "no ha sido establecido");
        }
        this.municipio = municipio;
    }

    public void setPropietario(Propietario propietario) throws Exception{
        if (propietario != null && this.tipoGranja == TipoGranja.CONVENIO) {
            this.propietario = propietario;
        }
        if (propietario == null && this.tipoGranja == TipoGranja.CONVENIO){
            throw new AtributosIncorrectosException("La granja tiene convenio pero no propietario");
        }
        if (propietario != null && this.tipoGranja == TipoGranja.PROPIA){
            throw new AtributosIncorrectosException("La granja es propia no necesita propietario");
        }
    }

    public void setGalpones(List<Galpon> galpones) throws Exception {
        if (galpones.isEmpty()) {
            throw new ListaVaciaNoPermitidoException("No se ha agregado ningun galpon");
        }
        this.galpones = galpones;
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
        final Granja other = (Granja) obj;
        if (this.tipoGranja != other.tipoGranja) {
            return false;
        }
        if (this.estadoConvenio != other.estadoConvenio) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        if (!Objects.equals(this.propietario, other.propietario)) {
            return false;
        }
        return Objects.equals(this.galpones, other.galpones);
    }   

}
