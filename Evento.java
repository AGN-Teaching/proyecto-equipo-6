import java.util.GregorianCalendar;
import java.io.Serializable;
import java.util.Calendar;

public class Evento implements Serializable {

    // Atributos de la clase Evento
    // Nombre del evento.
    private String nombre;
    // Fecha del evento.
    private Calendar fecha;
    // Lugar donde se llevará a cabo el evento.
    private String lugar;
    // Costo de entrada al evento.
    private double costo;
    // Indica si el evento es de tipo premium.
    private boolean esPremiun;
    // Número de boletos disponibles para el evento.
    private int boletosDisponibles;

    // Constructor de la clase Evento
    public Evento(String nombre, int año, int mes, int dia, String lugar, double costo, boolean esPremiun,
            int boletosDisponibles) {

        // Inicialización de atributos con valores proporcionados en el constructor.
        this.nombre = nombre;

        // Creamos una instancia de GregorianCalendar para representar la fecha del
        // evento.
        // Año, mes y día se proporcionan como argumentos.
        // El mes se ajusta restando 1, ya que en GregorianCalendar, enero es 0, febrero
        // es 1, y así sucesivamente.
        fecha = new GregorianCalendar(año, mes - 1, dia);

        this.lugar = lugar;
        this.costo = costo;
        this.esPremiun = esPremiun;
        this.boletosDisponibles = boletosDisponibles;
    }

    // Métodos "getter" y "setter" para acceder y modificar los atributos de la
    // clase:

    // Getter para obtener el nombre del evento.
    public String getNombre() {
        return nombre;
    }

    // Setter para establecer el nombre del evento.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener la fecha del evento.
    public Calendar getFecha() {
        return fecha;
    }

    // Setter para establecer la fecha del evento.
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    // Getter para obtener el lugar del evento.
    public String getLugar() {
        return lugar;
    }

    // Setter para establecer el lugar del evento.
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    // Getter para obtener el costo del evento.
    public double getCosto() {
        return costo;
    }

    // Setter para establecer el costo del evento.
    public void setCosto(double costo) {
        this.costo = costo;
    }

    // Getter para saber si el evento es premium.
    public boolean getEsPremiun() {
        return esPremiun;
    }

    // Setter para establecer si el evento es premium.
    public void setEsPremiun(boolean esPremiun) {
        this.esPremiun = esPremiun;
    }

    // Getter para obtener la cantidad de boletos disponibles.
    public int getBoletosDisponibles() {
        return boletosDisponibles;
    }

    // Setter para establecer la cantidad de boletos disponibles.
    public void setBoletosDisponibles(int boletosDisponibles) {
        this.boletosDisponibles = boletosDisponibles;
    }
}
