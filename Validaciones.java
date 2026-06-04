
import java.util.Scanner;

public class Validaciones {
    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese una opcion valida");
            sc.nextLine();

        }
        return sc.nextInt();
    }

    public int ValidarRango(int n1, int n2, int numero, Scanner sc) {
        Validaciones V = new Validaciones();

        while (numero < n1 || numero > n2) {

            System.out.println("Ingrese un rango de: " + n1 + " hasta " + n2);
            numero = V.ValidarEntero(sc);

        }
        return numero;

    }

    public String validarCedula(Scanner sc) {
        String cedula = sc.next();
        sc.nextLine();
        while (!cedula.matches("^[0-9]{6,10}$")) {
            System.out.println("Error: la cédula debe tener entre 6 y 10 números:");
            cedula = sc.next();
        }

        return cedula;
    }

    public String ValidarCaracteres(Scanner sc) {
        String texto = sc.next();

        while (!texto.matches("[a-zA-Z ]+")) {
            System.out.println("Error: solo se permiten letras. Intenta de nuevo:");
            texto = sc.next();
        }

        return texto;
    }

    public String validarCelular(Scanner sc) {
        String cel = sc.next();
        sc.nextLine();

        while (!cel.matches("^3[0-9]{9}$")) {
            System.out.println("Número inválido. Debe tener 10 dígitos y empezar por 3:");
            cel = sc.next();
        }

        return cel;
    }

    public float validarPromedio(Scanner sc) {
        float promedio = -1;

        while (promedio < 0 || promedio > 5) {
            System.out.println("Ingresa el promedio (0.0 a 5.0):");

            if (sc.hasNextFloat()) {
                promedio = sc.nextFloat();
                sc.nextLine();
            } else {
                System.out.println("Error: ingresa un número válido.");
                sc.next(); 
            }
        }

        return promedio;
    }

    public String validarSerial(Scanner sc) {
    String serial = sc.next();
    sc.nextLine();

    while (!serial.matches("[A-Za-z0-9]+")) {
        System.out.println("Error: el serial solo puede tener letras y números:");
        serial = sc.nextLine();
    }

    return serial;
}

    public String validarSerialCoincidente(Scanner sc, String serialEstudiante) {

    System.out.print(" El Serial (debe coincidir con el del estudiante): ");
    String serialIngresado = sc.nextLine();

    while (!serialIngresado.equals(serialEstudiante)) {
        System.out.println("Error: el serial no coincide. Intenta de nuevo:");
        serialIngresado = sc.nextLine();
    }

    return serialIngresado;
}

public String validarModalidad(Scanner sc) {
    String modalidad = sc.nextLine().trim().toUpperCase();

    while (!modalidad.equals("VIRTUAL") && !modalidad.equals("PRESENCIAL")) {
        System.out.println("Error: solo se permite VIRTUAL o PRESENCIAL.");
        System.out.print("Ingrese nuevamente la modalidad: ");
        modalidad = sc.nextLine().trim().toUpperCase();
    }

    return modalidad;
}

public float validarTamanoPulgadas(Scanner sc) {

    while (!sc.hasNextFloat()) {
        System.out.println("Error: ingrese un número válido (puede tener decimales).");
        sc.next(); 
    }

    float tam = sc.nextFloat();
    sc.nextLine(); 
    return tam;
}

public float validarPrecio(Scanner sc) {

    while (!sc.hasNextFloat()) {
        System.out.println("Error: ingrese un precio válido (puede tener decimales).");
        sc.next(); 
    }

    float precio = sc.nextFloat();
    sc.nextLine(); 
    return precio;
}

public float validarPeso(Scanner sc) {

    while (!sc.hasNextFloat()) {
        System.out.println("Error: ingrese un peso válido (puede tener decimales).");
        sc.next(); 
    }

    float peso = sc.nextFloat();
    sc.nextLine(); 
    return peso;
}





}
