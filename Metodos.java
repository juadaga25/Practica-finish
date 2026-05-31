import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {



    public LinkedList<EstudianteInge> llenarListaIngenieria(LinkedList<EstudianteInge> l, Scanner sc){

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



    public LinkedList<EstudianteDise> llenarListaDiseño(LinkedList<EstudianteDise> l, Scanner sc){

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




    public LinkedList<EstudianteInge> modificarIngenieria(LinkedList<EstudianteInge> l, Scanner sc){

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




    public LinkedList<EstudianteDise> modificarDiseno(LinkedList<EstudianteDise> l, Scanner sc){

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



    public LinkedList<EstudianteInge> devolverEquipoIngenieria(LinkedList<EstudianteInge> l, Scanner sc){

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



    public LinkedList<EstudianteDise> devolverEquipoDiseno(LinkedList<EstudianteDise> l, Scanner sc){

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

}
