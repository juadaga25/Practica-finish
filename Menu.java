import java.util.LinkedList;
import java.util.Scanner;

public class Menu {

    public void Mostrarmenu(Scanner sc) {

        Metodos m = new Metodos();
        Validaciones v = new Validaciones();

        LinkedList<EstudianteInge> vector_ingenieros = new LinkedList<>();

        LinkedList<EstudianteDise> vector_disenadores = new LinkedList<>();

        LinkedList<CompuPortatil> vector_portatil = new LinkedList<>();

        LinkedList<TabletGrafica> vector_tableta = new LinkedList<>();

        boolean bandera = true;
        int opt = 0;

        while (bandera) {

            System.out.println("--------------- BIENVENIDOS AL MENU JUAN DE DIOS ----------------");
            System.out.println("1. Estudiante de Ingenieria");
            System.out.println("2. Estudiante de Diseño");
            System.out.println("3. Exportar Archivos");
            System.out.println("4. Imprimir inventario total");
            System.out.println("5. Salir del programa");

            opt = v.ValidarEntero(sc);
            opt = v.ValidarRango(1, 5, opt, sc);

            switch (opt) {

                case 1:

                    boolean bandera1 = true;

                    while (bandera1) {

                        System.out.println("--------------- MENU INGENIERIA ----------------");
                        System.out.println("1. Registrar Prestamo");
                        System.out.println("2. Modificar Prestamo");
                        System.out.println("3. Devolucion de equipo");
                        System.out.println("4. Buscar equipo");
                        System.out.println("5. Volver al menu principal");

                        opt = v.ValidarEntero(sc);
                        opt = v.ValidarRango(1, 5, opt, sc);

                        switch (opt) {

                            case 1:
                                vector_ingenieros = m.llenarListaIngenieria(vector_ingenieros, sc);

                                String serialEstudiante = vector_ingenieros.getLast().getSerialEquipo();

                                vector_portatil = m.llenarListaPortatil(vector_portatil, sc, serialEstudiante);

                                break;

                            case 2:

                                vector_ingenieros = m.modificarIngenieria(vector_ingenieros, sc);

                                break;

                            case 3:

                                vector_ingenieros = m.devolverEquipoIngenieria(vector_ingenieros, sc);

                                break;

                            case 4:
                                String serialEstudiante1 = vector_ingenieros.getLast().getSerialEquipo();
                                m.buscarEquipoIngenieria(vector_ingenieros, vector_portatil, sc, serialEstudiante1);;

                                break;

                            case 5:

                                bandera1 = false;
                                System.out.println("-----------HAS VUELTO AL MENU PRINCIPAL----------------\n");
                                break;

                            default:

                                System.out.println("OPCION INVALIDA INGRESE DE NUEVO.");
                        }
                    }

                    break;

                // =====================================
                // MENU DISEÑO
                // =====================================

                case 2:

                    boolean bandera2 = true;

                    while (bandera2) {

                        System.out.println("--------------- MENU DISEÑO -----------------------");
                        System.out.println("1. Registrar Prestamo");
                        System.out.println("2. Modificar Prestamo");
                        System.out.println("3. Devolucion de equipo");
                        System.out.println("4. Buscar equipo");
                        System.out.println("5. Volver al menu principal");

                        opt = v.ValidarEntero(sc);
                        opt = v.ValidarRango(1, 5, opt, sc);

                        switch (opt) {

                            case 1:

                                vector_disenadores = m.llenarListaDiseño(vector_disenadores, sc);

                                String serialEstudiante = vector_disenadores.getLast().getSerialD();

                                vector_tableta = m.llenarListaTablet(vector_tableta, sc, serialEstudiante);

                                break;

                            case 2:

                                vector_disenadores = m.modificarDiseno(vector_disenadores, sc);

                                break;

                            case 3:

                                vector_disenadores = m.devolverEquipoDiseno(vector_disenadores, sc);

                                break;

                            case 4:
                                String serialEstudiante2 = vector_disenadores.getLast().getSerialD();
                                m.buscarEquipoDiseno(vector_disenadores, vector_tableta, sc, serialEstudiante2);;

                                break;

                            case 5:

                                bandera2 = false;
                                System.out.println("-----------HAS VUELTO AL MENU PRINCIPAL----------------\n");
                                break;

                            default:

                                System.out.println("OPCION INVALIDA INGRESE DE NUEVO.");
                        }
                    }

                    break;

                case 3:
                    boolean bandera3 = true;

                    while (bandera3) {
                        System.out.println("--------------- MENU DISEÑO ----------------");
                        System.out.println("1. Exportar Ingenieria");
                        System.out.println("2. Exportar Diseno");
                        System.out.println("3. Volver al menu");

                        opt = v.ValidarEntero(sc);
                        opt = v.ValidarRango(1, 3, opt, sc);

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
                                System.out.println("-----------HAS VUELTO AL MENU PRINCIPAL----------------\n");
                                break;
                            default:

                                System.out.println("OPCION INVALIDA INGRESE DE NUEVO.");
                                break;
                        }

                    }

                    break;
                    
                case 4:

                    boolean bandera4 = true;

                    while (bandera4) {
                        System.out.println("--------------- INVENTARIO TOTAL ----------------");
                        System.out.println("1. Inventario total Ingenieria");
                        System.out.println("2. Inventario total Diseño");
                        System.out.println("3. Volver al menu");

                        opt = v.ValidarEntero(sc);
                        opt = v.ValidarRango(1, 3, opt, sc);

                        switch (opt) {
                            case 1:
                                m.inventarioTotalinge(vector_ingenieros, vector_portatil);
                                break;
                            case 2:
                                m.inventarioTotaldiseno(vector_disenadores, vector_tableta);
                                break;
                            case 3:
                                bandera4 = false;
                                break;
                            default:
                                System.out.println("opcion invalida");
                                break;
                        }
                    }


                    break;

                    case 5:

                    System.out.println("GRACIAS POR ESTAR EN JUAN DE DIOS");
                    bandera = false;

                    break;

                default:

                    System.out.println("OPCION INVALIDA INGRESE DE NUEVO.");
            }
        }
    }
}