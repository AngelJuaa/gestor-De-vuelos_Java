package controller;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import modelo.Vuelos;
import view.VueloView;

public class VuelosControler {

    private List<Vuelos> vuelos = new ArrayList<>();
    private Vuelos model;
    private VueloView view;

    public VuelosControler(Vuelos model, VueloView view){
        this.model = model;
        this.view = view;
    }

    public void CRUDVuelo(){
        view.CRUDVuelo(model);
    }

    public void createVuelo() {
        view.createVuelo(model);
    }

    public void readVuelo(){
        view.readVuelo(model);
    }

    public void updateVuelo(){
        view.updateVuelo(model);
    }

    public boolean deleteVuelo(String codigo){
        return vuelos.removeIf(v -> v.getCodigo().equalsIgnoreCase(codigo));
    }

    public Vuelos buscarVuelo(String codigo) {
        return vuelos.stream()
                     .filter(v -> v.getCodigo().equalsIgnoreCase(codigo))
                     .findFirst()
                     .orElse(null);
    }

    public List<Vuelos> vuelosOrdenados() {
        List<Vuelos> ordenados = new ArrayList<>(vuelos);
        ordenados.sort((Vuelos v1, Vuelos v2) -> v2.getFecha_llegada().compareTo(v1.getFecha_llegada()));
        return ordenados;
    }

    public Vuelos vueloPasajeros() {
        return vuelos.stream()
                     .min((v1, v2) -> v1.getNumeroPasajeros().compareTo(v2.getNumeroPasajeros()))
                     .orElse(null);
    }

    public Vuelos llegada(){
        List<Vuelos> ordenados = vuelosOrdenados();
        return ordenados.isEmpty() ? null : ordenados.get(0);
    }

    public void guardarVuelo(String codigo, String origen, String destino, String hora, Date fecha_completa, Integer numeroPasajeros){
        Vuelos nuevo = new Vuelos(codigo, origen, destino, hora, fecha_completa, numeroPasajeros);
        vuelos.add(nuevo);
        view.updateTable(nuevo);
    }
}
