import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {

    // =====================================
    // REGISTRO INGENIERIA
    // =====================================

    public LinkedList<EstudianteInge> llenarListaIngenieria(LinkedList<EstudianteInge> l, Scanner sc) {

        EstudianteInge est = new EstudianteInge();

        System.out.println(" REGISTRO INGENIERIA ");

        System.out.print("Cedula: ");
        est.setCedula(sc.next());

        for (EstudianteInge e : l) {

            if (e.getCedula().equals(est.getCedula())) {

                System.out.println("El estudiante ya tiene un equipo asignado.");
                return l;
            }
        }

        System.out.print("Nombre: ");
        est.setNombre(sc.next());

        System.out.print("Telefono: ");
        est.setTelefono(sc.next());

        System.out.print("Numero de semestre: ");
        est.setNumSemestre(sc.nextInt());

        System.out.print("Promedio acumulado: ");
        est.setPromAcumulado(sc.nextFloat());

        System.out.print("Serial del equipo: ");
        est.setSerialEquipo(sc.next());

        l.add(est);

        System.out.println("Equipo registrado correctamente.");

        return l;
    }

    // =====================================
    // REGISTRO DISEÑO
    // =====================================

    public LinkedList<EstudianteDise> llenarListaDiseño(LinkedList<EstudianteDise> l, Scanner sc) {

        EstudianteDise est = new EstudianteDise();

        System.out.println(" REGISTRO DISEÑO ");

        System.out.print("Cedula: ");
        est.setCedulaD(sc.next());

        for (EstudianteDise e : l) {

            if (e.getCedulaD().equals(est.getCedulaD())) {

                System.out.println("El estudiante ya tiene una tablet asignada.");
                return l;
            }
        }

        System.out.print("Nombre: ");
        est.setNombreD(sc.next());

        System.out.print("Apellido: ");
        est.setApellidoD(sc.next());

        System.out.print("Telefono: ");
        est.setTelefonoD(sc.next());

        System.out.print("Modalidad de estudio: ");
        est.setModaliadEstudio(sc.next());

        System.out.print("Cantidad de asignaturas: ");
        est.setAsignaturas(sc.nextInt());

        System.out.print("Serial de la tablet: ");
        est.setSerialD(sc.nextInt());

        l.add(est);

        System.out.println("Tablet registrada correctamente.");

        return l;
    }

    // =====================================
    // MODIFICAR INGENIERIA
    // =====================================

    public LinkedList<EstudianteInge> modificarIngenieria(LinkedList<EstudianteInge> l, Scanner sc) {

        System.out.print("Ingrese cedula del estudiante: ");
        String cedula = sc.next();

        for (EstudianteInge e : l) {

            if (e.getCedula().equals(cedula)) {

                System.out.print("Nuevo nombre: ");
                e.setNombre(sc.next());

                System.out.print("Nuevo telefono: ");
                e.setTelefono(sc.next());

                System.out.print("Nuevo semestre: ");
                e.setNumSemestre(sc.nextInt());

                System.out.print("Nuevo promedio: ");
                e.setPromAcumulado(sc.nextFloat());

                System.out.println("Datos modificados correctamente.");

                return l;
            }
        }

        System.out.println("Estudiante no encontrado.");

        return l;
    }

    // =====================================
    // MODIFICAR DISEÑO
    // =====================================

    public LinkedList<EstudianteDise> modificarDiseno(LinkedList<EstudianteDise> l, Scanner sc) {

        System.out.print("Ingrese cedula del estudiante: ");
        String cedula = sc.next();

        for (EstudianteDise e : l) {

            if (e.getCedulaD().equals(cedula)) {

                System.out.print("Nuevo nombre: ");
                e.setNombreD(sc.next());

                System.out.print("Nuevo apellido: ");
                e.setApellidoD(sc.next());

                System.out.print("Nuevo telefono: ");
                e.setTelefonoD(sc.next());

                System.out.print("Nueva modalidad: ");
                e.setModaliadEstudio(sc.next());

                System.out.print("Nuevas asignaturas: ");
                e.setAsignaturas(sc.nextInt());

                System.out.println("Datos modificados correctamente.");

                return l;
            }
        }

        System.out.println("Estudiante no encontrado.");

        return l;
    }

    // =====================================
    // DEVOLVER EQUIPO INGENIERIA
    // =====================================

    public LinkedList<EstudianteInge> devolverEquipoIngenieria(LinkedList<EstudianteInge> l, Scanner sc) {

        System.out.print("Ingrese cedula del estudiante: ");
        String cedula = sc.next();

        for (EstudianteInge e : l) {

            if (e.getCedula().equals(cedula)) {

                l.remove(e);

                System.out.println("Equipo devuelto correctamente.");

                return l;
            }
        }

        System.out.println("Prestamo no encontrado.");

        return l;
    }

    // =====================================
    // DEVOLVER EQUIPO DISEÑO
    // =====================================

    public LinkedList<EstudianteDise> devolverEquipoDiseno(LinkedList<EstudianteDise> l, Scanner sc) {

        System.out.print("Ingrese cedula del estudiante: ");
        String cedula = sc.next();

        for (EstudianteDise e : l) {

            if (e.getCedulaD().equals(cedula)) {

                l.remove(e);

                System.out.println("Tablet devuelta correctamente.");

                return l;
            }
        }

        System.out.println("Prestamo no encontrado.");

        return l;
    }

    // =====================================
    // REGISTRAR COMPUTADOR PORTATIL
    // =====================================

    public LinkedList<CompuPortatil> llenarListaPortatil(LinkedList<CompuPortatil> l, Scanner sc) {

        CompuPortatil cp = new CompuPortatil();

        System.out.println("=== REGISTRO COMPUTADOR PORTATIL ===");

        System.out.print("Serial: ");
        cp.setSerial(sc.next());

        System.out.print("Marca: ");
        cp.setMarca(sc.next());

        System.out.print("Tamaño en pulgadas: ");
        cp.setTamaño(sc.nextFloat());

        System.out.print("Precio: ");
        cp.setPrecio(sc.nextFloat());

        int op;

        System.out.println("=== SISTEMA OPERATIVO ===");
        System.out.println("1. Windows 7");
        System.out.println("2. Windows 10");
        System.out.println("3. Windows 11");

        op = sc.nextInt();

        switch (op) {

            case 1:
                cp.setSitemOP("Windows 7");
                break;

            case 2:
                cp.setSitemOP("Windows 10");
                break;

            case 3:
                cp.setSitemOP("Windows 11");
                break;

            default:
                System.out.println("Opcion invalida");
        }

        //l.add(cp);

        System.out.println("=== PROCESADOR ===");
        System.out.println("1. AMD RYZEN");
        System.out.println("2. INTEL CORE I5");
        

        op = sc.nextInt();

        switch (op) {

            case 1:
                cp.setPreocesador("AMD RYZEN");
                break;

            case 2:
                cp.setPreocesador("INTEL CORE I5");
                break;

            default:
                System.out.println("Opcion invalida");
        }

        l.add(cp);

        System.out.println("Computador registrado correctamente.");

        return l;
    }

    // =====================================
    // REGISTRAR TABLETA
    // =====================================

    public LinkedList<TabletGrafica> llenarListaTablet(LinkedList<TabletGrafica> l, Scanner sc) {

        TabletGrafica tb = new TabletGrafica();

        System.out.println("=== REGISTRO TABLETA GRAFICA ===");

        System.out.print("Serial: ");
        tb.setSerial(sc.next());

        System.out.print("Marca: ");
        tb.setMarca(sc.next());

        System.out.print("Tamaño en pulgadas: ");
        tb.setTamaño(sc.nextFloat());

        System.out.print("Precio: ");
        tb.setPrecio(sc.nextFloat());

        int op;

        System.out.println("=== ALMACENAMIENTO ===");
        System.out.println("1. 256 GB");
        System.out.println("2. 512 GB");
        System.out.println("3. 1 TB");

        op = sc.nextInt();

        switch (op) {

            case 1:
                tb.setAlmacenamiento(256);
                break;

            case 2:
                tb.setAlmacenamiento(512);
                break;

            case 3:
                tb.setAlmacenamiento(1024);
                break;

            default:
                System.out.println("Opcion invalida");
        }

        System.out.print("Peso en kg: ");
        tb.setPeso(sc.nextFloat());

        l.add(tb);

        System.out.println("Tablet registrada correctamente.");

        return l;
    }

    // =====================================
    // BUSCAR EQUIPO INGENIERIA +
    // MOSTRAR PORTATIL
    // =====================================

    public void buscarEquipoIngenieria(LinkedList<EstudianteInge> lEst,
            LinkedList<CompuPortatil> lCompu,
            Scanner sc) {

        System.out.print("Ingrese el serial del equipo: ");
        String serial = sc.next();

        boolean encontrado = false;

        for (EstudianteInge e : lEst) {

            if (e.getSerialEquipo().equals(serial)) {

                for (CompuPortatil c : lCompu) {

                    if (c.getSerial().equals(serial)) {

                        System.out.println("================================");
                        System.out.println("EQUIPO ENCONTRADO");
                        System.out.println("================================");

                        System.out.println("Cedula: " + e.getCedula());
                        System.out.println("Nombre: " + e.getNombre());
                        System.out.println("Telefono: " + e.getTelefono());
                        System.out.println("Semestre: " + e.getNumSemestre());
                        System.out.println("Promedio: " + e.getPromAcumulado());

                        System.out.println("--------------------------------");

                        System.out.println("Serial: " + c.getSerial());
                        System.out.println("Marca: " + c.getMarca());
                        System.out.println("Tamaño: " + c.getTamaño());
                        System.out.println("Precio: " + c.getPrecio());
                        System.out.println("Sistema Operativo: " + c.getSitemOP());
                        System.out.println("Preocesador: " + c.getPreocesador());

                        encontrado = true;

                        return;
                    }
                }
            }
        }

        if (encontrado == false) {
            System.out.println("Equipo no encontrado.");
        }
    }

    // =====================================
    // BUSCAR EQUIPO DISEÑO +
    // MOSTRAR TABLET
    // =====================================

    public void buscarEquipoDiseno(LinkedList<EstudianteDise> lEst,
            LinkedList<TabletGrafica> lTablet,
            Scanner sc) {

        System.out.print("Ingrese el serial de la tablet: ");
        String serial = sc.next();

        boolean encontrado = false;

        for (EstudianteDise e : lEst) {

            if (String.valueOf(e.getSerialD()).equals(serial)) {

                for (TabletGrafica t : lTablet) {

                    if (t.getSerial().equals(serial)) {

                        System.out.println("================================");
                        System.out.println("TABLET ENCONTRADA");
                        System.out.println("================================");

                        System.out.println("Cedula: " + e.getCedulaD());
                        System.out.println("Nombre: " + e.getNombreD());
                        System.out.println("Apellido: " + e.getApellidoD());
                        System.out.println("Telefono: " + e.getTelefonoD());
                        System.out.println("Modalidad: " + e.getModaliadEstudio());
                        System.out.println("Asignaturas: " + e.getAsignaturas());

                        System.out.println("--------------------------------");

                        System.out.println("Serial: " + t.getSerial());
                        System.out.println("Marca: " + t.getMarca());
                        System.out.println("Tamaño: " + t.getTamaño());
                        System.out.println("Precio: " + t.getPrecio());
                        System.out.println("Almacenamiento: " + t.getAlmacenamiento() + " GB");
                        System.out.println("Peso: " + t.getPeso());

                        encontrado = true;

                        return;
                    }
                }
            }
        }

        if (encontrado == false) {
            System.out.println("Tablet no encontrada.");
        }
    }

}