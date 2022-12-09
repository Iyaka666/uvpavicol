package modelo;

import java.util.List;

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

    public Granja(TipoGranja tipoGranja, EstadoConvenio estadoConvenio, Municipio municipio, Propietario propietario) {
        this.tipoGranja = tipoGranja;
        this.estadoConvenio = estadoConvenio;
        this.municipio = municipio;
        this.propietario = propietario;
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
    
    
    
}
