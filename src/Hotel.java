import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {

    private List<Camera> listaCamere;
    private Map<Cliente, Prenotazione> mappaPrenotazioni;

    public Hotel(List<Camera> listaCamere) {

        setListaCamere(listaCamere);
        setMappaPrenotazioni(new HashMap<Cliente, Prenotazione>());
    }

    public List<Camera> getListaCamere() {
        return listaCamere;
    }

    public void setListaCamere(List<Camera> listaCamere) {
        this.listaCamere = listaCamere;
    }

    public Map<Cliente, Prenotazione> getMappaPrenotazioni() {
        return mappaPrenotazioni;
    }

    public void setMappaPrenotazioni(Map<Cliente, Prenotazione> mappaPrenotazioni) {
        this.mappaPrenotazioni = mappaPrenotazioni;
    }

    public void addPrenotazione(Cliente c, Prenotazione p) throws Exception {

        checkPrenotazione(c, p);

        getMappaPrenotazioni().put(c, p);
    }

    public void editPrenotazione(Cliente c, Prenotazione p) throws Exception {

        checkPrenotazione(c, p);

        getMappaPrenotazioni().put(c, p);
    }

    public void removePrenotazione(Cliente c, Prenotazione p) throws Exception {

        checkPrenotazione(c, p);

        getMappaPrenotazioni().remove(c);
    }

    private void checkPrenotazione(Cliente c, Prenotazione p) throws Exception {

        if (getMappaPrenotazioni().containsKey(c))
            throw new Exception();

        if (!getListaCamere().contains(p.getCamera()))
            throw new Exception();
    }
}
