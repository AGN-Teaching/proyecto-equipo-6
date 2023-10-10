import java.util.GregorianCalendar;
import java.util.Calendar;

public class Evento {
    
    private String nombre;
    private Calendar fecha; 
    private String lugar;
    private double costo; 
    private boolean esPremiun;
    private int boletosDisponibles;

    public Evento(String nombre, int año, int mes, int dia, String lugar, double costo, boolean esPremiun,
                  int boletosDisponibles) {
        
        this.nombre = nombre;
        fecha = new GregorianCalendar();
        fecha.set(año, mes, dia);       
        this.costo = costo;
        this.esPremiun = esPremiun;
        this.boletosDisponibles = boletosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isEsPremiun() {
        return esPremiun;
    }

    public void setEsPremiun(boolean esPremiun) {
        this.esPremiun = esPremiun;
    }

    public int getBoletosDisponibles() {
        return boletosDisponibles;
    }

    public void setBoletosDisponibles(int boletosDisponibles) {
        this.boletosDisponibles = boletosDisponibles;
    } 
}