public interface IAdministrador {

    // Método para agregar un evento cultural al sistema.
    public void agregarEventoCultural(String nombre, int año, int mes, int dia, String lugar, double costo,
            boolean esPremiun,
            int boletosDisponibles, String tipoEvento, String artista);

    // Método para agregar un evento deportivo al sistema.
    public void agregarEventoDeportivo(String nombre, int año, int mes, int dia, String lugar, double costo,
            boolean esPremiun,
            int boletosDisponibles, String equipos, String tipoDeporte);

    // Método para eliminar un evento del sistema por su número de evento.
    public void eliminarEvento(int numeroEvento);

    // Método para guardar eventos en un archivo específico.
    public void guardarEventos(String archivoAGuardar);

    // Método para cargar eventos desde un archivo específico.
    public void cargarEventos(String nombreArchivo);
}
