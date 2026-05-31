import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int opt = 0;

        while (bandera) {
            // INICIA MENU PRINCIPAL
            System.out.println("----------------BIENVENIDOS AL MENU JUAN DE DIOS---------------------");
            System.out.println("Que accion desea realizar");
            System.out.println("1. Estudiante de Ingenieria");
            System.out.println("2. Estudiante de Diseño");
            System.out.println("3. Imprimir inventario total");
            System.out.println("4. Salir del programa");
            opt = sc.nextInt();
            // TERMINA MENU PRINCIPAL

            // ***INICO DE SUBMENUS
            switch (opt) {
                case 1:
                    boolean bandera1 = true;
                    while (bandera1) {
                        System.out.println("-------------------INGRESE LA OPCION QUE DESEA REALIZAR:--------------");
                        System.out.println("1. Registrar Prestamo");
                        System.out.println("2. Modificar Prestamo");
                        System.out.println("3. Devolucion de equipo");
                        System.out.println("4. Buscar equipo");
                        System.out.println("5. Volver al menu principal");
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                System.out.println("Pagina en mantemiento");
                                break;
                            case 2:
                                System.out.println("Pagina en mantemiento");
                                break;
                            case 3:
                                System.out.println("Pagina en mantemiento");
                                break;
                            case 4:
                                System.out.println("Pagina en mantemiento");
                                break;

                            default:
                                bandera1 = false;
                                break;
                        }
                    }

                    break;
                case 2:
                    boolean bandera2 = true;
                    while (bandera2) {
                        System.out.println("-------------------INGRESE LA OPCION QUE DESEA REALIZAR:--------------");
                        System.out.println("1. Registrar Prestamo");
                        System.out.println("2. Modificar Prestamo");
                        System.out.println("3. Devolucion de equipo");
                        System.out.println("4. Buscar equipo");
                        System.out.println("5. Volver al menu principal");
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                System.out.println("Pagina en mantemiento");
                                break;
                            case 2:
                                System.out.println("Pagina en mantemiento");
                                break;
                            case 3:
                                System.out.println("Pagina en mantemiento");
                                break;
                            case 4:
                                System.out.println("Pagina en mantemiento");
                                break;

                            default:
                                bandera2 = false;
                                break;
                        }
                    }
                    break;
                case 3:

                    break;

                default:
                    System.out.println("GRACIAS POR ESTAR EN JUAN DE DIOS");
                    bandera = false;
                    break;
            }
            /// +++ FIN DE SUBMENUS
        }
        //// ++++ FIN DEL PRINCIPAL
    }
}
