import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar1 {
    public void exportarArchivo(LinkedList<EstudianteDise> lista, LinkedList<TabletGrafica> lista2 ) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("EstudianteDiseno.txt")) {
                for (EstudianteDise obj : lista) {
                    e.write("Cedula: " + obj.getCedulaD() + "\n");
                    e.write("Nombre: " + obj.getNombreD() + "\n");
                    e.write("Apellido: " + obj.getApellidoD() + "\n");
                    e.write("Telefono: " + obj.getTelefonoD() + "\n");
                    e.write("Modalidad de estudio: " + obj.getModaliadEstudio() + "\n");
                    e.write("Asignaturas: " + obj.getAsignaturas() + "\n");
                    e.write("SerialD: " + obj.getSerialD() + "\n");
                    e.write("------------------------------------------------------ \n");

                    for (TabletGrafica Tg : lista2) {

                    if (Tg.getSerial().equals(String.valueOf(obj.getSerialD()))) {

                        e.write("\n=========== TABLET ===========\n");

                        e.write("Serial: " + Tg.getSerial() + "\n");
                        e.write("Marca: " + Tg.getMarca() + "\n");
                        e.write("Tamaño: " + Tg.getTamaño() + "\n");
                        e.write("Precio: " + Tg.getPrecio() + "\n");
                        e.write("Almacenamiento: " + Tg.getAlmacenamiento() + "\n");
                        e.write("Precio: " + Tg.getPrecio() + "\n");
                    }
                }

                e.write("\n--------------------------------------------\n\n");

                }
                System.out.println("Archivo exportado correctamente ");

            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
