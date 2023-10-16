public class Cultural extends Evento {

    // Atributos adicionales específicos de eventos culturales

    // Tipo de evento cultural (ejemplo: concierto, exposición, teatro).
    private String tipoEvento;
    // Nombre del artista o grupo relacionado al evento cultural.
    private String artista;

    // Constructor de la clase Cultural

    public Cultural(String nombre, int año, int mes, int dia, String lugar, double costo, boolean esPremiun,
            int boletosDisponibles, String tipoEvento, String artista) {

        // Llamamos al constructor de la clase base (Evento) utilizando "super".
        super(nombre, año, mes, dia, lugar, costo, esPremiun, boletosDisponibles);

        // Inicializamos los atributos específicos de eventos culturales.
        this.tipoEvento = tipoEvento;
        this.artista = artista;
    }

    // Métodos "getter" y "setter" para los atributos específicos de eventos
    // culturales:

    // Getter para obtener el tipo de evento cultural.
    public String getTipoEvento() {
        return tipoEvento;
    }

    // Setter para establecer el tipo de evento cultural.
    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    // Getter para obtener el nombre del artista o grupo relacionado.
    public String getArtista() {
        return artista;
    }

    // Setter para establecer el nombre del artista o grupo relacionado.
    public void setArtista(String artista) {
        this.artista = artista;
    }

}
