import java.util.Calendar;

public class prueba {
    
    public void ejecucion(){
    Evento evento = new Evento("Arte Abtracto", 2023,9,6, "Monterrey", 240, false, 3000);

    System.out.println("Dia: " + evento.getFecha().get(Calendar.DATE) + ", Mes: " + evento.getFecha().get(Calendar.MONTH) + ", Año: " + evento.getFecha().get(Calendar.YEAR));

    }

    public static void main(String[] arg){
        prueba prueba1 = new prueba();
        prueba1.ejecucion();
    }
}
