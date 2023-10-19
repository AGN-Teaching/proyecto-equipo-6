import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SistemaVentaBoletos implements IAdministrador, ICliente, Serializable {

    // ArrayList para almacenar eventos
    ArrayList<Evento> eventos = new ArrayList<Evento>();

    // Método para agregar eventos deportivos al sistema
    public void agregarEventoDeportivo(String nombre, int año, int mes, int dia, String lugar, double costo,
            boolean esPremiun, int boletosDisponibles, String equipos, String tipoDeporte) {
        // Crea un nuevo evento deportivo y lo agrega a la lista de eventos
        Evento evento = new Deportivo(nombre, año, mes, dia, lugar, costo, esPremiun, boletosDisponibles, equipos,
                tipoDeporte);
        eventos.add(evento);
    }

    // Método para agregar eventos culturales al sistema
    public void agregarEventoCultural(String nombre, int año, int mes, int dia, String lugar, double costo,
            boolean esPremiun, int boletosDisponibles, String tipoEvento, String artista) {
        // Crea un nuevo evento cultural y lo agrega a la lista de eventos
        Evento evento = new Cultural(nombre, año, mes, dia, lugar, costo, esPremiun, boletosDisponibles, tipoEvento,
                artista);
        eventos.add(evento);
    }

    // Método para eliminar un evento del sistema
    public void eliminarEvento(int numeroEvento) {
        // Elimina un evento específico de la lista de eventos
        eventos.remove(numeroEvento);
    }

    // Método para guardar eventos en un archivo
    public void guardarEventos(String archivoAGuardar) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(archivoAGuardar))) {
            // Serializa y guarda la lista de eventos en un archivo
            outputStream.writeObject(eventos);
            outputStream.close();
            System.out.println("Eventos guardados en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar eventos desde un archivo
    public void cargarEventos(String nombreArchivo) {
        try (FileInputStream file = new FileInputStream(nombreArchivo);
                ObjectInputStream objectInputStream = new ObjectInputStream(file)) {
            // Deserializa y carga la lista de eventos desde un archivo
            eventos = (ArrayList<Evento>) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("Eventos cargados con éxito.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Método para comprar boletos para un evento
    public void comprarBoletos(int numeroEvento, int numeroBoletos) {
        Evento evento = eventos.get(numeroEvento);
        if (numeroBoletos <= evento.getBoletosDisponibles()) {
            if (evento.getEsPremiun() == true) {
                if (numeroBoletos <= 4) {
                    // Verifica la disponibilidad de boletos y aplica restricciones para eventos
                    // premium
                    evento.setBoletosDisponibles(evento.getBoletosDisponibles() - numeroBoletos);
                    double extraPagoBoletos = (numeroBoletos * evento.getCosto()) * 0.1;
                    double pagoTotalBoletos = (numeroBoletos * evento.getCosto()) + extraPagoBoletos;
                    System.out.println("Pago de boletos: " + (evento.getCosto() * numeroBoletos) + "$ \nExtra: "
                            + extraPagoBoletos + "$ \nTotal: " + pagoTotalBoletos + "$");
                    System.out.println("Boletos comprados con éxito");
                } else {
                    System.out.println(
                            "Error: no puedes comprar más de 4 boletos (El evento es premium)\nCompra no realizada, inténtalo de nuevo.");
                }
            } else {
                evento.setBoletosDisponibles(evento.getBoletosDisponibles() - numeroBoletos);
                double extraPagoBoletos = (numeroBoletos * evento.getCosto()) * 0.1;
                double pagoTotalBoletos = (numeroBoletos * evento.getCosto()) + extraPagoBoletos;
                System.out.println("Pago de boletos: " + (evento.getCosto() * numeroBoletos) + "$ \nExtra: "
                        + extraPagoBoletos + "$ \nTotal: " + pagoTotalBoletos + "$");
                System.out.println("Boletos comprados con éxito");
            }
        } else {
            System.out.println("Error: Boletos insuficientes");
        }
    }

    // Método para agregar tarjetas de crédito al sistema
    public TarjetaCredito agregarTarjetas(double numeroTrajeta, int año, int mes, int dia, int cvv) {
        // Crea una nueva tarjeta de crédito con número único, fecha de vencimiento y
        // CVV
        Calendar fechaVencimiento = new GregorianCalendar();
        fechaVencimiento.set(año, mes, dia);
        TarjetaCredito tarjetaCredito = new TarjetaCredito(numeroTrajeta, fechaVencimiento, cvv);
        return tarjetaCredito;
    }

    // Método para crear una cuenta de cliente
    public Cliente crearCuenta(String nombreCliente, String correoElectrónico, ArrayList<TarjetaCredito> tarjetas) {
        // Crea una cuenta de cliente con nombre, correo electrónico y tarjetas de
        // crédito
        Cliente cliente = new Cliente(nombreCliente, correoElectrónico, tarjetas);
        return cliente;
    }

    // Método para mostrar información detallada de los eventos
    public void mostrarEventos() {
        System.out.println("Eventos: \n");
        for (int i = 0; i < eventos.size(); i++) {
            Evento evento = eventos.get(i);
            // Muestra información detallada del evento, incluyendo nombre, fecha, lugar,
            // costo, si es premium y más detalles específicos
            System.out.println(i + ".- Evento:  " + evento.getNombre() + "\nFecha del Evento: "
                    + evento.getFecha().get(Calendar.DATE) + "/" + evento.getFecha().get(Calendar.MONTH) + "/"
                    + evento.getFecha().get(Calendar.YEAR) + "\nLugar: "
                    + evento.getLugar() + "\nCosto del boleto: " + evento.getCosto() + "$\nEs premium: "
                    + evento.getEsPremiun() + "\nBoletos Disponibles: " + evento.getBoletosDisponibles());
            if (evento instanceof Cultural) {
                Cultural cultural = (Cultural) evento;
                // Muestra detalles adicionales para eventos culturales
                System.out.println(
                        "Tipo de Evento: " + cultural.getTipoEvento() + "\nArtista: " + cultural.getArtista() + "\n\n");
            } else if (evento instanceof Deportivo) {
                Deportivo deportivo = (Deportivo) evento;
                // Muestra detalles adicionales para eventos deportivos
                System.out.println("Equipos: " + deportivo.getEquipos() + "\nTipo de Deporte: "
                        + deportivo.getTipoDeporte() + "\n\n");
            }
        }
    }
}
