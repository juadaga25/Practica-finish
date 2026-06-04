import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {

    public void exportarArchivo(LinkedList<EstudianteInge> lista, LinkedList<CompuPortatil> lista2) {

        if (lista.isEmpty()) {

            System.out.println("La lista esta vacia no se puede exportar.");
            return;
        }

        try (FileWriter e = new FileWriter("EstudiantesInge.txt")) {

            for (EstudianteInge est : lista) {


                e.write("=========== ESTUDIANTE ===========\n");

                e.write("Cedula: " + est.getCedula() + "\n");
                e.write("Nombre: " + est.getNombre() + "\n");
                e.write("Telefono: " + est.getTelefono() + "\n");
                e.write("Numero Semestre: " + est.getNumSemestre() + "\n");
                e.write("Promedio Acumulado: " + est.getPromAcumulado() + "\n");
                e.write("Serial Equipo: " + est.getSerialEquipo() + "\n");

                for (CompuPortatil pc : lista2) {

                    if (pc.getSerial().equals(est.getSerialEquipo())) {

                        e.write("\n=========== COMPUTADOR ===========\n");

                        e.write("Serial: " + pc.getSerial() + "\n");
                        e.write("Marca: " + pc.getMarca() + "\n");
                        e.write("Tamaño: " + pc.getTamaño() + "\n");
                        e.write("Precio: " + pc.getPrecio() + "\n");
                        e.write("Sistema Operativo: " + pc.getSitemOP() + "\n");
                        e.write("Procesador: " + pc.getPreocesador() + "\n");
                    }
                }

                e.write("\n--------------------------------------------\n\n");
            }

            System.out.println("Archivo exportado correctamente.");

        } catch (IOException ex) {

            ex.printStackTrace();
        }
    }
}