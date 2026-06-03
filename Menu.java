import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    public void Mostrarmenu(Scanner sc) {
        Metodos m = new Metodos();
        Metodos1 m1 = new Metodos1();
        LinkedList<EstudianteInge> l = new LinkedList<>();
        LinkedList<EstudianteDise> l1 = new LinkedList<>();
        LinkedList<CompuPortatil> l2 = new LinkedList<>();

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

                                l = m.llenarListaIngenieria(l, sc);
                                l2 = m1.llenarListaPortatil(l2, sc);
                                break;
                            case 2:
                                l = m.modificarIngenieria(l, sc);
                                break;
                            case 3:
                                l = m.devolverEquipoIngenieria(l, sc);
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

                                l1 = m.llenarListaDiseño(l1, sc);
                                break;
                            case 2:
                                l1 = m.modificarDiseno(l1, sc);
                                break;
                            case 3:
                                l1 = m.devolverEquipoDiseno(l1, sc);
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
                    System.out.println("mantenimiento");
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
