import java.util.Calendar;

public class TarjetaCredito {

    // Atributos de la clase TarjetaCredito

    // Número de la tarjeta de crédito.
    private double numeroTrajeta;
    // Fecha de vencimiento de la tarjeta.
    private Calendar fechaVencimiento;
    // Código de seguridad CVV de la tarjeta.
    private int cvv;

    // Constructor de la clase TarjetaCredito
    public TarjetaCredito(double numeroTrajeta, Calendar fechaVencimiento, int cvv) {

        // Inicialización de atributos con valores proporcionados en el constructor.
        this.numeroTrajeta = numeroTrajeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    // Métodos "getter" y "setter" para acceder y modificar los atributos de la
    // clase:

    // Getter para obtener el número de tarjeta de crédito.
    public double getNumeroTrajeta() {
        return numeroTrajeta;
    }

    // Setter para establecer el número de tarjeta de crédito.
    public void setNumeroTrajeta(int numeroTrajeta) {
        this.numeroTrajeta = numeroTrajeta;
    }

    // Getter para obtener la fecha de vencimiento de la tarjeta.
    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    // Setter para establecer la fecha de vencimiento de la tarjeta.
    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getter para obtener el código de seguridad CVV de la tarjeta.
    public int getCvv() {
        return cvv;
    }

    // Setter para establecer el código de seguridad CVV de la tarjeta.
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
