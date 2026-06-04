import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {

    Validaciones v = new Validaciones();

    public LinkedList<EstudianteInge> llenarListaIngenieria(LinkedList<EstudianteInge> l, Scanner sc) {

        EstudianteInge est = new EstudianteInge();

        System.out.println(" REGISTRO INGENIERIA ");

        System.out.print("Cedula: ");
        est.setCedula(v.validarCedula(sc));
        ;

        for (EstudianteInge e : l) {

            if (e.getCedula().equals(est.getCedula())) {

                System.out.println("El estudiante ya tiene un equipo asignado.");
                return l;
            }
        }

        System.out.print("Nombre: ");
        est.setNombre(v.ValidarCaracteres(sc));

        System.out.print("Apellido: ");
        est.setNombre(v.ValidarCaracteres(sc));

        System.out.print("Telefono (Inicia por el # 3): ");
        est.setTelefono(v.validarCelular(sc));

        System.out.print("Numero de semestre: ");
        est.setNumSemestre(v.ValidarEntero(sc));

        System.out.print("Promedio acumulado: ");
        est.setPromAcumulado(v.validarPromedio(sc));

        System.out.print("Serial del equipo: ");
        est.setSerialEquipo(v.validarSerial(sc));

        l.add(est);

        System.out.println("Equipo registrado correctamente.");

        return l;
    }


    public LinkedList<EstudianteDise> llenarListaDiseño(LinkedList<EstudianteDise> l, Scanner sc) {

        EstudianteDise est = new EstudianteDise();

        System.out.println(" REGISTRO DISEÑO ");

        System.out.print("Cedula: ");
        est.setCedulaD(v.validarCedula(sc));

        for (EstudianteDise e : l) {

            if (e.getCedulaD().equals(est.getCedulaD())) {

                System.out.println("El estudiante ya tiene una tablet asignada.");
                return l;
            }
        }

        System.out.print("Nombre: ");
        est.setNombreD(v.ValidarCaracteres(sc));

        System.out.print("Apellido: ");
        est.setApellidoD(v.ValidarCaracteres(sc));

        System.out.print("Telefono (Inicia por el # 3): ");
        est.setTelefonoD(v.validarCelular(sc));

        System.out.print("Modalidad de estudio: ");
        System.out.println("INGRESE POR TECLADO VIRTUAL O PRESENCIAL");
        est.setModaliadEstudio(v.validarModalidad(sc));

        System.out.print("Cantidad de asignaturas: ");
        est.setAsignaturas(v.ValidarEntero(sc));

        System.out.print("Serial de la tablet: ");
        est.setSerialD(v.validarSerial(sc));

        l.add(est);

        System.out.println("Tablet registrada correctamente.");

        return l;
    }


    public LinkedList<EstudianteInge> modificarIngenieria(LinkedList<EstudianteInge> l, Scanner sc) {

        System.out.print("Ingrese cedula del estudiante: ");
        String cedula = v.validarCedula(sc);

        for (EstudianteInge e : l) {

            if (e.getCedula().equals(cedula)) {

                System.out.print("Nuevo nombre: ");
                e.setNombre(v.ValidarCaracteres(sc));

                System.out.print("Nuevo telefono (Inicia por el # 3): ");
                e.setTelefono(v.validarCelular(sc));

                System.out.print("Nuevo semestre: ");
                e.setNumSemestre(v.ValidarEntero(sc));

                System.out.print("Nuevo promedio: ");
                e.setPromAcumulado(v.validarPromedio(sc));

                System.out.println("Datos modificados correctamente.");

                return l;
            }
        }

        System.out.println("Estudiante no encontrado.");

        return l;
    }


    public LinkedList<EstudianteDise> modificarDiseno(LinkedList<EstudianteDise> l, Scanner sc) {

        System.out.print("Ingrese cedula del estudiante: ");
        String cedula = v.validarCedula(sc);

        for (EstudianteDise e : l) {

            if (e.getCedulaD().equals(cedula)) {

                System.out.print("Nuevo nombre: ");
                e.setNombreD(v.ValidarCaracteres(sc));

                System.out.print("Nuevo apellido: ");
                e.setApellidoD(v.ValidarCaracteres(sc));

                System.out.print("Nuevo telefono (Inicia por el # 3): ");
                e.setTelefonoD(v.validarCelular(sc));

                System.out.print("Nueva modalidad: ");
                e.setModaliadEstudio(v.validarModalidad(sc));

                System.out.print("Nuevas asignaturas: ");
                e.setAsignaturas(v.ValidarEntero(sc));

                System.out.println("Datos modificados correctamente.");

                return l;
            }
        }

        System.out.println("Estudiante no encontrado.");

        return l;
    }


    public LinkedList<EstudianteInge> devolverEquipoIngenieria(LinkedList<EstudianteInge> l, Scanner sc) {

        System.out.print("Ingrese cedula del estudiante: ");
        String cedula = v.validarCedula(sc);

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


    public LinkedList<EstudianteDise> devolverEquipoDiseno(LinkedList<EstudianteDise> l, Scanner sc) {

        System.out.print("Ingrese cedula del estudiante: ");
        String cedula = v.validarCedula(sc);

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


    public LinkedList<CompuPortatil> llenarListaPortatil(LinkedList<CompuPortatil> l, Scanner sc,
            String serialEstudiante) {

        CompuPortatil cp = new CompuPortatil();

        System.out.println("=== REGISTRO COMPUTADOR PORTATIL ===");

        System.out.print("Serial: ");
        cp.setSerial(v.validarSerialCoincidente(sc, serialEstudiante));

        System.out.print("Marca: ");
        cp.setMarca(v.ValidarCaracteres(sc));

        System.out.print("Tamaño en pulgadas: ");
        cp.setTamaño(v.validarTamanoPulgadas(sc));

        System.out.print("Precio: ");
        cp.setPrecio(v.validarPrecio(sc));

        int op;

        System.out.println("=== SISTEMA OPERATIVO ===");
        System.out.println("1. Windows 7");
        System.out.println("2. Windows 10");
        System.out.println("3. Windows 11");

        op = v.ValidarEntero(sc);
        op = v.ValidarRango(1, 3, op, sc);

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


        System.out.println("=== PROCESADOR ===");
        System.out.println("1. AMD RYZEN");
        System.out.println("2. INTEL CORE I5");

        op = v.ValidarEntero(sc);
        op = v.ValidarRango(1, 2, op, sc);

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


    public LinkedList<TabletGrafica> llenarListaTablet(LinkedList<TabletGrafica> l, Scanner sc,
            String serialEstudiante) {

        TabletGrafica tb = new TabletGrafica();

        System.out.println("=== REGISTRO TABLETA GRAFICA ===");

        System.out.print("Serial: ");
        tb.setSerial(v.validarSerialCoincidente(sc, serialEstudiante));

        System.out.print("Marca: ");
        tb.setMarca(v.ValidarCaracteres(sc));

        System.out.print("Tamaño en pulgadas: ");
        tb.setTamaño(v.validarTamanoPulgadas(sc));

        System.out.print("Precio: ");
        tb.setPrecio(v.validarPrecio(sc));

        int op;

        System.out.println("=== ALMACENAMIENTO ===");
        System.out.println("1. 256 GB");
        System.out.println("2. 512 GB");
        System.out.println("3. 1 TB");

        op = v.ValidarEntero(sc);
        op = v.ValidarRango(1, 3, op, sc);

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
        tb.setPeso(v.validarPeso(sc));

        l.add(tb);

        System.out.println("Tablet registrada correctamente.");

        return l;
    }


    public void buscarEquipoIngenieria(LinkedList<EstudianteInge> lEst, LinkedList<CompuPortatil> lCompu,
            Scanner sc,String serialEstudiante) {

        System.out.print("Ingrese el serial del equipo: ");
        String serial = v.validarSerialCoincidente(sc, serialEstudiante);

        boolean encontrado = false;

        for (EstudianteInge e : lEst) {

            if (e.getSerialEquipo().equals(serial)) {

                for (CompuPortatil c : lCompu) {

                    if (c.getSerial().equals(serial)) {

                        System.out.println("=======EQUIPO ENCONTRADO==");

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


    public void buscarEquipoDiseno(LinkedList<EstudianteDise> lEst,LinkedList<TabletGrafica> lTablet,
            Scanner sc,String serialEstudiante) {

        System.out.print("Ingrese el serial de la tablet: ");
        String serial = v.validarSerialCoincidente(sc, serialEstudiante);

        boolean encontrado = false;

        for (EstudianteDise e : lEst) {

            if (String.valueOf(e.getSerialD()).equals(serial)) {

                for (TabletGrafica t : lTablet) {

                    if (t.getSerial().equals(serial)) {

                        System.out.println("======TABLET ENCONTRADA======");

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

    public void inventarioTotalinge(LinkedList<EstudianteInge> lEst, LinkedList<CompuPortatil> lCompu) {

        for (EstudianteInge e : lEst) {

            for (CompuPortatil c : lCompu) {
                if (c.getSerial().equals(e.getSerialEquipo())) {

                    System.out.println("======EQUIPO ENCONTRADO======");

                    System.out.println("Cedula: " + e.getCedula());
                    System.out.println("Nombre: " + e.getNombre());
                    System.out.println("Telefono: " + e.getTelefono());
                    System.out.println("Semestre: " + e.getNumSemestre());
                    System.out.println("Promedio: " + e.getPromAcumulado());

                    System.out.println("Serial: " + c.getSerial());
                    System.out.println("Marca: " + c.getMarca());
                    System.out.println("Tamaño: " + c.getTamaño());
                    System.out.println("Precio: " + c.getPrecio());
                    System.out.println("Sistema Operativo: " + c.getSitemOP());
                    System.out.println("Preocesador: " + c.getPreocesador());

                }
            }
            System.out.println("------------------------------------------------------");

        }

    }

    public void inventarioTotaldiseno(LinkedList<EstudianteDise> lEst, LinkedList<TabletGrafica> lTablet) {

        for (EstudianteDise e : lEst) {

            for (TabletGrafica t : lTablet) {
                if (t.getSerial().equals(e.getSerialD())) {

                    System.out.println("======EQUIPOS ENCONTRADO======");

                    System.out.println("Cedula: " + e.getCedulaD());
                    System.out.println("Nombre: " + e.getNombreD());
                    System.out.println("Apellido: " + e.getApellidoD());
                    System.out.println("Modalidad: " + e.getModaliadEstudio());
                    System.out.println("Asignaturas: " + e.getAsignaturas());

                    System.out.println("Serial: " + t.getSerial());
                    System.out.println("Marca: " + t.getMarca());
                    System.out.println("Tamaño: " + t.getTamaño());
                    System.out.println("Precio: " + t.getPrecio());
                    System.out.println("Almacenamiento: " + t.getAlmacenamiento());
                    System.out.println("Peso: " + t.getPeso());

                }
            }

        }

    }

}