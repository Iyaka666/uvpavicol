package modelo;

import excepciones.ObjetoYaExisteException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Marlon E. Zambrano Z.
 * @author Santiago Gallardo S.
 * @author Juan E. Rodriguez R.
 */
public class Empresa {

    List<Usuario> usuarios = new ArrayList<>();
    List<Granja> granjas = new ArrayList<>();
    List<Lote> lotes = new LinkedList<>();

    public Empresa() {
    }

    public void addUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void addGranja(Granja g) throws Exception{
        if(granjas.contains(g)){
            throw new ObjetoYaExisteException("La granja ya existe");
        }
        granjas.add(g);
    }

    public void addLotes(Lote l) {
        lotes.add(l);
    }

    public void removeUsuario(Usuario u) {
        usuarios.remove(u);
    }

    public void removeGranja(Granja g) {
        granjas.remove(g);
    }

    public void removeLote(Lote l) {
        lotes.remove(l);
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public List<Granja> getGranjas() {
        return this.granjas;
    }

    public List<Lote> getLotes() {
        return this.lotes;
    }
    
    public Granja buscaGranjaPorIndice(int indice){
        return granjas.get(indice);
    }

}
