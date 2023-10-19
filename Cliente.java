import java.util.ArrayList;

public class Cliente {

    // Atributos de la clase Cliente
    // Nombre del cliente.
    private String nombreCliente;
    // Correo electrónico del cliente.
    private String correoElectronico;
    // Lista de tarjetas de crédito asociadas al cliente.
    private ArrayList<TarjetaCredito> trajetas;

    // Constructor de la clase Cliente
    public Cliente(String nombreCliente, String correoElectronico, ArrayList<TarjetaCredito> trajetas) {

        // Inicialización de atributos con valores proporcionados en el constructor.
        this.nombreCliente = nombreCliente;
        this.correoElectronico = correoElectronico;
        this.trajetas = trajetas;
    }

    // Métodos "getter" y "setter" para acceder y modificar los atributos de la
    // clase:

    // Getter para obtener el nombre del cliente.
    public String getNombreCliente() {
        return nombreCliente;
    }

    // Setter para establecer el nombre del cliente.
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    // Getter para obtener el correo electrónico del cliente.
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    // Setter para establecer el correo electrónico del cliente.
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // Getter para obtener la lista de tarjetas de crédito asociadas al cliente.
    public ArrayList<TarjetaCredito> getTrajetas() {
        return trajetas;
    }

    // Setter para establecer la lista de tarjetas de crédito asociadas al cliente.
    public void setTrajetas(ArrayList<TarjetaCredito> trajetas) {
        this.trajetas = trajetas;
    }
}
