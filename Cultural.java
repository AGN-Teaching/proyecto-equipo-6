public class Cultural extends Evento{
    
    private String tipoEvento; 
    private String artista;
   
    public Cultural(String nombre, int año, int mes, int dia, String lugar, double costo, boolean esPremiun,
            int boletosDisponibles, String tipoEvento, String artista) {
        super(nombre, año, mes, dia, lugar, costo, esPremiun, boletosDisponibles);
        this.tipoEvento = tipoEvento;
        this.artista = artista;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

}
