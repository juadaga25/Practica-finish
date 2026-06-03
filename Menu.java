import java.util.LinkedList;
import java.util.Scanner;

public class Menu {

    public void Mostrarmenu(Scanner sc) {

        Metodos m = new Metodos();

        // =====================================
        // VECTORES DINAMICOS
        // =====================================

        LinkedList<EstudianteInge> vector_ingenieros = new LinkedList<>();

        LinkedList<EstudianteDise> vector_disenadores = new LinkedList<>();

        LinkedList<CompuPortatil> vector_portatil = new LinkedList<>();

        LinkedList<TabletGrafica> vector_tableta = new LinkedList<>();

        boolean bandera = true;
        int opt = 0;

        while (bandera) {

            // =====================================
            // MENU PRINCIPAL
            // =====================================

            System.out.println("--------------- BIENVENIDOS AL MENU JUAN DE DIOS ----------------");
            System.out.println("1. Estudiante de Ingenieria");
            System.out.println("2. Estudiante de Diseño");
            System.out.println("3. Imprimir inventario total");
            System.out.println("4. Salir del programa");

            opt = sc.nextInt();

            switch (opt) {

                // =====================================
                // MENU INGENIERIA
                // =====================================

                case 1:

                    boolean bandera1 = true;

                    while (bandera1) {

                        System.out.println("--------------- MENU INGENIERIA ----------------");
                        System.out.println("1. Registrar Prestamo");
                        System.out.println("2. Modificar Prestamo");
                        System.out.println("3. Devolucion de equipo");
                        System.out.println("4. Buscar equipo");
                        System.out.println("5. Volver al menu principal");

                        opt = sc.nextInt();

                        switch (opt) {

                            case 1:

                                vector_ingenieros = m.llenarListaIngenieria(vector_ingenieros, sc);

                                vector_portatil = m.llenarListaPortatil(vector_portatil, sc);

                                break;

                            case 2:

                                vector_ingenieros = m.modificarIngenieria(vector_ingenieros, sc);

                                break;

                            case 3:

                                vector_ingenieros = m.devolverEquipoIngenieria(vector_ingenieros, sc);

                                break;

                            case 4:

                                m.buscarEquipoIngenieria(vector_ingenieros, vector_portatil, sc);

                                break;

                            case 5:

                                bandera1 = false;
                                break;

                            default:

                                System.out.println("Opcion invalida.");
                        }
                    }

                    break;

                // =====================================
                // MENU DISEÑO
                // =====================================

                case 2:

                    boolean bandera2 = true;

                    while (bandera2) {

                        System.out.println("--------------- MENU DISEÑO ----------------");
                        System.out.println("1. Registrar Prestamo");
                        System.out.println("2. Modificar Prestamo");
                        System.out.println("3. Devolucion de equipo");
                        System.out.println("4. Buscar equipo");
                        System.out.println("5. Volver al menu principal");

                        opt = sc.nextInt();

                        switch (opt) {

                            case 1:

                                vector_disenadores = m.llenarListaDiseño(vector_disenadores, sc);

                                vector_tableta = m.llenarListaTablet(vector_tableta, sc);

                                break;

                            case 2:

                                vector_disenadores = m.modificarDiseno(vector_disenadores, sc);

                                break;

                            case 3:

                                vector_disenadores = m.devolverEquipoDiseno(vector_disenadores, sc);

                                break;

                            case 4:

                                m.buscarEquipoDiseno(vector_disenadores, vector_tableta, sc);

                                break;

                            case 5:

                                bandera2 = false;
                                break;

                            default:

                                System.out.println("Opcion invalida.");
                        }
                    }

                    break;

                // =====================================
                // IMPRIMIR INVENTARIO
                // =====================================

                case 3:
                    boolean bandera3 = true;

                    while (bandera3) {
                        System.out.println("--------------- MENU DISEÑO ----------------");
                        System.out.println("1. Exportar Ingenieria");
                        System.out.println("2. Exportar Diseno");
                        System.out.println("3. Volver al menu");

                        opt = sc.nextInt();

                        switch (opt) {
                            case 1:
                                Exportar i = new Exportar();
                                i.exportarArchivo(vector_ingenieros, vector_portatil);
                                break;
                            case 2:
                                Exportar1 j = new Exportar1();
                                j.exportarArchivo(vector_disenadores, vector_tableta);
                                break;

                            case 3:
                                bandera3 = false;
                                break;
                            default:
                                System.out.println("opcion invalida");
                                break;
                        }

                    }

                    break;

                // =====================================
                // SALIR
                // =====================================

                case 4:

                    System.out.println("GRACIAS POR ESTAR EN JUAN DE DIOS");
                    bandera = false;

                    break;

                default:

                    System.out.println("Opcion invalida.");
            }
        }
    }
}