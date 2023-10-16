import java.util.ArrayList;

public interface ICliente {

    // Método para que un cliente compre boletos para un evento específico.
    public void comprarBoletos(int numeroEvento, int numeroBoletos);

    // Método para que un cliente cree una cuenta alta, proporcionando su nombre,
    // correo electrónico y tarjetas de crédito.
    public Cliente crearCuenta(String nombreCliente, String correoElectronico, ArrayList<TarjetaCredito> trajetas);
}
