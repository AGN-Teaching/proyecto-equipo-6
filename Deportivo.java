public class Deportivo extends Evento {

    private String equipos; 
    private String tipoDeporte;
    
    public Deportivo(String nombre, int año, int mes, int dia, String lugar, double costo, boolean esPremiun,
            int boletosDisponibles, String equipos, String tipoDeporte) {
        super(nombre, año, mes, dia, lugar, costo, esPremiun, boletosDisponibles);
        this.equipos = equipos;
        this.tipoDeporte = tipoDeporte;
    }

    public String getEquipos() {
        return equipos;
    }

    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }
}
