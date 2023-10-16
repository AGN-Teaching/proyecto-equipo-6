public class Deportivo extends Evento {

    // Atributos adicionales específicos de eventos deportivos

    // Equipos o participantes en el evento deportivo.
    private String equipos;
    // Tipo de deporte que se juega en el evento.
    private String tipoDeporte;

    // Constructor de la clase Deportivo
    public Deportivo(String nombre, int año, int mes, int dia, String lugar, double costo, boolean esPremiun,
            int boletosDisponibles, String equipos, String tipoDeporte) {

        // Llamamos al constructor de la clase base (Evento) utilizando "super".
        super(nombre, año, mes, dia, lugar, costo, esPremiun, boletosDisponibles);

        // Inicializamos los atributos específicos de eventos deportivos.
        this.equipos = equipos;
        this.tipoDeporte = tipoDeporte;
    }

    // Métodos "getter" y "setter" para los atributos específicos de eventos
    // deportivos:

    // Getter para obtener la información sobre los equipos o participantes.
    public String getEquipos() {
        return equipos;
    }

    // Setter para establecer la información sobre los equipos o participantes.
    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    // Getter para obtener el tipo de deporte.
    public String getTipoDeporte() {
        return tipoDeporte;
    }

    // Setter para establecer el tipo de deporte.
    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }
}
