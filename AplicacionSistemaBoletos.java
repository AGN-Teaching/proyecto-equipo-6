import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AplicacionSistemaBoletos {

    SistemaVentaBoletos sistema1 = new SistemaVentaBoletos(); // Creamos una instancia del sistema de venta de boletos.

    // Función para el ingreso de contraseña del administrador.
    public boolean ingresoContraseñaAdministrador() {

        boolean verdadero = true;
        boolean contraseñaCorrecta = false;

        while (verdadero == true) {
            System.out.println("Contraseña:");
            Scanner entrada = new Scanner(System.in);
            try {
                int contraseña = entrada.nextInt();
                if (contraseña == 1234) {
                    verdadero = false;
                    contraseñaCorrecta = true;
                } else {
                    System.out.println("Contraseña incorrecta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                entrada.nextLine();
            }
        }
        return contraseñaCorrecta;
    }

    // Función para el menú del administrador.
    public void usuarioAnministrador() {

        ingresoContraseñaAdministrador(); // Solicitamos la contraseña del administrador.

        boolean verdadero = true;
        while (verdadero == true) {

            System.out.print(
                    "\n\nMenú Administrador: \n1.- Agregar un evento\n2.- Eliminar un evento\n3.- Mostrar los eventos\n4.- Cargar los eventos\n5.- Guardar los eventos\n6.- Regresar\n\n");

            int menu = 0;

            boolean verdaderoMenu = true;
            while (verdaderoMenu == true) {
                System.out.println("Ingresa el número de tu preferencia: ");
                Scanner menuNumero = new Scanner(System.in);
                try {
                    menu = menuNumero.nextInt();
                    if (menu > 0 && menu < 7) {
                        verdaderoMenu = false;
                    } else {
                        System.out.println("Ingresa un número válido");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingresa un número.");
                    menuNumero.nextLine();
                }
            }

            if (menu == 1) {
                menuAgregarEventos();
            } else if (menu == 2) {
                eliminarEvento();
            } else if (menu == 3) {
                sistema1.mostrarEventos();
            } else if (menu == 4) {
                cargarEventos();
            } else if (menu == 5) {
                guardarEventos();
            } else {
                verdadero = false;
                ejecutar();
            }
        }
    }

    // Función para cargar eventos desde un archivo.
    public void cargarEventos() {
        System.out.println("Ingresa el nombre del archivo con terminación .dat");
        Scanner text = new Scanner(System.in);
        String nombreArchivo = text.nextLine();
        sistema1.cargarEventos(nombreArchivo);
    }

    // Función para guardar eventos en un archivo.
    public void guardarEventos() {
        System.out.println("Ingresa el nombre del archivo con terminación .dat");
        Scanner text = new Scanner(System.in);
        String archivoAGuardar = text.nextLine();
        sistema1.guardarEventos(archivoAGuardar);
    }

    // Función para eliminar un evento.
    public void eliminarEvento() {
        sistema1.mostrarEventos();
        System.out.println("Ingresa el número de evento que deseas eliminar: ");
        Scanner eliminarEvento = new Scanner(System.in);
        try {
            int numeroEvento = eliminarEvento.nextInt();
            sistema1.eliminarEvento(numeroEvento);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un número válido.");
        }
    }

    // Función para el menú de agregar eventos.
    public void menuAgregarEventos() {

        System.out.println("\n\nMenú agregar evento:\n1.- Deportivos\n2.- Culturales\n3.- Regresar\n\n");
        Scanner entrada = new Scanner(System.in);
        int menu = 0;
        boolean Verdadero = true;

        while (Verdadero == true) {
            System.out.println("Ingresa el número de tu preferencia: ");
            menu = entrada.nextInt();
            if (menu > 0 && menu < 4) {
                Verdadero = false;
            } else {
                System.out.println("Ingresa un número válido");
            }
        }

        if (menu == 1) {
            agregarDeportivo();
        } else if (menu == 2) {
            agregarCultural();
        } else {
            usuarioAnministrador();
        }
    }

    // Función para agregar un evento deportivo.
    public void agregarDeportivo() {
        Scanner num = new Scanner(System.in);
        Scanner text = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = text.nextLine();
        System.out.println("Año: ");
        int año = num.nextInt();
        System.out.println("Mes: ");
        int mes = num.nextInt();
        System.out.println("Dia: ");
        int dia = num.nextInt();
        System.out.println("Lugar: ");
        String lugar = text.nextLine();
        System.out.println("Costo: ");
        double costo = num.nextInt();
        boolean verdad = true;

        System.out.println("Es Premium: ");
        System.out.println("1.- Si\n2.- No");

        int menuEsPremium = 0;
        while (verdad == true) {
            try {
                menuEsPremium = num.nextInt();
                if (menuEsPremium > 0 && menuEsPremium < 3) {
                    verdad = false;
                } else {
                    System.out.println("Número no válido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un número.");
                num.nextLine();
            }
        }

        boolean esPremium;
        if (menuEsPremium == 1) {
            esPremium = true;
        } else {
            esPremium = false;
        }

        System.out.println("Boletos a Disposición: ");
        int boletosDisponibles = num.nextInt();
        System.out.println("Equipos: ");
        String equipos = text.nextLine();
        System.out.println("Deporte: ");
        String tipoDeporte = text.nextLine();

        // Agregamos el evento deportivo al sistema.
        sistema1.agregarEventoDeportivo(nombre, año, mes, dia, lugar, costo, esPremium, boletosDisponibles, equipos,
                tipoDeporte);
    }

    // Función para agregar un evento cultural.
    public void agregarCultural() {
        Scanner num = new Scanner(System.in);
        Scanner text = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = text.nextLine();
        System.out.println("Año: ");
        int año = num.nextInt();
        System.out.println("Mes: ");
        int mes = num.nextInt();
        System.out.println("Dia: ");
        int dia = num.nextInt();
        System.out.println("Lugar: ");
        String lugar = text.nextLine();
        System.out.println("Costo: ");
        double costo = num.nextInt();
        boolean verdad = true;

        System.out.println("Es Premium: ");
        System.out.println("1.- Si\n2.- No");

        int menuEsPremium = 0;
        while (verdad == true) {
            try {
                menuEsPremium = num.nextInt();
                if (menuEsPremium > 0 && menuEsPremium < 3) {
                    verdad = false;
                } else {
                    System.out.println("Número no válido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un número.");
                num.nextLine();
            }
        }

        boolean esPremium;
        if (menuEsPremium == 1) {
            esPremium = true;
        } else {
            esPremium = false;
        }

        System.out.println("Boletos a Disposición: ");
        int boletosDisponibles = num.nextInt();
        System.out.println("Tipo de Evento: ");
        String tipoEvento = text.nextLine();
        System.out.println("Artista: ");
        String artista = text.nextLine();

        // Agregamos el evento cultural al sistema.
        sistema1.agregarEventoCultural(nombre, año, mes, dia, lugar, costo, esPremium, boletosDisponibles, tipoEvento,
                artista);
    }

    // Función para el menú del usuario cliente.
    public void usuarioCliente() {
        System.out.println("\n\nMenú Cliente\n1.- Mostrar eventos\n2.- Comprar Boletos\n3.- Regresar\n\n");
        int menu = 0;
        Scanner entrada = new Scanner(System.in);
        boolean verdadero = true;

        while (verdadero == true) {
            System.out.println("Ingresa el número de tu preferencia: ");
            try {
                menu = entrada.nextInt();
                if (menu > 0 && menu < 4) {
                    verdadero = false;
                } else {
                    System.out.println("Ingresa un número válido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número");
                entrada.nextLine();
            }
        }

        if (menu == 1) {
            sistema1.mostrarEventos();
        } else if (menu == 2) {
            comprarBoletos();
        } else {
            ejecutar();
        }
    }

    // Función para mostrar las tarjetas de crédito de un cliente.
    public void mostrarTarjetasCredito(Cliente cliente) {
        ArrayList<TarjetaCredito> tarjetas = cliente.getTrajetas();

        for (int i = 0; i < tarjetas.size(); i++) {
            System.out.println(i + ".-  Número de Tarjeta: " + (tarjetas.get(i).getNumeroTrajeta()));
        }
    }

    // Función para comprar boletos.
    public void comprarBoletos() {
        sistema1.mostrarEventos();
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa el número de evento que te interesa: ");
        try {
            int numeroEvento = num.nextInt();
            System.out.println("¿Cuántos boletos deseas?");
            System.out.println(
                    "Número de boletos disponibles: " + sistema1.eventos.get(numeroEvento).getBoletosDisponibles());
            int numeroBoletos = num.nextInt();
            Cliente cliente = crearCuenta();
            mostrarTarjetasCredito(cliente);
            System.out.println("Ingresa el número de la tarjeta con la que realizarás la compra: ");
            int numeroDeCuenta = num.nextInt();
            sistema1.comprarBoletos(numeroEvento, numeroBoletos);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un número válido.");
        }
    }

    // Función para crear una cuenta de cliente.
    public Cliente crearCuenta() {
        Scanner num = new Scanner(System.in);
        Scanner text = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = text.nextLine();
        System.out.println("Correo Electrónico: ");
        String correoElectronico = text.nextLine();

        ArrayList<TarjetaCredito> tarjetas = new ArrayList<TarjetaCredito>();
        tarjetas.add(agregarTarjeta());

        boolean verdad = true;
        boolean nuevaTarjeta = true;

        while (nuevaTarjeta == true) {
            while (verdad == true) {
                System.out.println("¿Deseas agregar otra tarjeta de Crédito?");
                System.out.println("1.- Si\n2.- No");
                System.out.println("Ingresa el número de tu preferencia: ");
                try {
                    int menu = num.nextInt();
                    if (menu > 0 && menu < 3) {
                        verdad = false;
                    } else {
                        System.out.println("Ingresa un número válido");
                    }
                    if (menu == 1) {
                        verdad = true;
                        tarjetas.add(agregarTarjeta());
                    } else {

                        nuevaTarjeta = false;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ingresa un número.");
                    num.nextLine();
                }
            }
        }

        Cliente cliente = sistema1.crearCuenta(nombre, correoElectronico, tarjetas);
        return cliente;
    }

    // Función para agregar una tarjeta de crédito.
    public TarjetaCredito agregarTarjeta() {
        Scanner num = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        boolean verdad = true;
        double numeroTarjeta = 0;

        System.out.println("Número de Tarjeta: ");
        while (verdad == true) {
            try {
                numeroTarjeta = num.nextDouble();
                if (numeroTarjeta >= 1000000000000000F && numeroTarjeta <= 9999999999999999F) {
                    verdad = false;
                } else {
                    System.out.println("Error: Ingresa los 16 números correspondientes");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                num.nextLine();
            }
        }

        System.out.println("Fecha de vencimiento: ");
        System.out.println("Año: ");
        int año = num.nextInt();
        System.out.println("Mes: ");
        int mes = num.nextInt();
        System.out.println("Día: ");
        int dia = num.nextInt();
        System.out.println("CVV: ");
        int cvv = num.nextInt();
        TarjetaCredito tarjetaCredito = sistema1.agregarTarjetas(numeroTarjeta, año, mes, dia, cvv);
        return tarjetaCredito;
    }

    // Función para el menú principal de la aplicación.
    public int menuPrincipal() {
        System.out.println("\n\nMenú principal:\n1.- Administrador\n2.- Cliente\n3.- Salir\n\n");
        int menu = 0;
        Scanner entrada = new Scanner(System.in);
        boolean Verdadero = true;

        while (Verdadero == true) {
            System.out.println("Ingresa el número de tu preferencia: ");
            try {
                menu = entrada.nextInt();
                if (menu > 0 && menu < 4) {
                    Verdadero = false;
                } else {
                    System.out.println("Ingresa un número válido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número valido");
                entrada.nextLine();
            }
        }

        return menu;
    }

    // Función principal que inicia la aplicación.
    public void ejecutar() {
        boolean Verdadero = true;

        while (Verdadero == true) {
            int menu = menuPrincipal();

            if (menu == 1) {
                usuarioAnministrador();
            } else if (menu == 2) {
                usuarioCliente();
            } else {
                System.out.println("Exit");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        AplicacionSistemaBoletos sistema = new AplicacionSistemaBoletos();
        sistema.ejecutar();
    }
}
