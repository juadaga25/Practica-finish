import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class Importar1 {
    public LinkedList<EstudianteDise> ImportarArchivo() {
        String rutaArchivo = "EstudianteDiseno.txt";
        LinkedList<EstudianteDise> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            EstudianteDise obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Cedula:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new EstudianteDise();
                    obj.setCedulaD(linea.substring(8));
                } else if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        obj.setNombreD(linea.substring(8));
                    }
                } else if (linea.startsWith("Apellido:")) {
                    if (obj != null) {
                        obj.setApellidoD(linea.substring(10));
                    }
                } else if (linea.startsWith("Telefono:")) {
                    if (obj != null) {
                        obj.setTelefonoD(linea.substring(11));
                    }
                } else if (linea.startsWith("Modalidad Estudio:")) {
                    if (obj != null) {
                        obj.setModaliadEstudio((linea.substring(6)));
                    }
                } else if (linea.startsWith("Asiganturas:")) {
                    if (obj != null) {
                        obj.setAsignaturas(Integer.parseInt(linea.substring(8)));
                    }
                } else if (linea.startsWith("Correo:")) {
                    if (obj != null) {
                        obj.setSerialD((linea.substring(6)));
                        lista.add(obj);
                        obj = null;
                    }
                }
            }
            System.out.println("Archivo importado correcrtamente ");

        } catch (Exception e) {
        }
        return lista;
    }

    public LinkedList<TabletGrafica> ImportarArchivoD() {
        String rutaArchivo = "EstudianteDiseno.txt";
        LinkedList<TabletGrafica> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            TabletGrafica obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Serial:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new TabletGrafica();
                    obj.setSerial(linea.substring(8));
                } else if (linea.startsWith("Marca:")) {
                    if (obj != null) {
                        obj.setMarca(linea.substring(8));
                    }
                } else if (linea.startsWith("Tamaño:")) {
                    if (obj != null) {
                        obj.setTamaño(Integer.parseInt(linea.substring(8)));
                    }
                } else if (linea.startsWith("Precio:")) {
                    if (obj != null) {
                        obj.setPrecio(Integer.parseInt(linea.substring(9)));
                    }
                } else if (linea.startsWith("Almacenamiento:")) {
                    if (obj != null) {
                        obj.setAlmacenamiento(Integer.parseInt(linea.substring(16)));
                    }
                } else if (linea.startsWith("Peso:")) {
                    if (obj != null) {
                        obj.setPeso(Integer.parseInt(linea.substring(8)));
                    }
                } 
                
            }
            System.out.println("Archivo importado correcrtamente ");

        } catch (Exception e) {

        }
        return lista;
    }

}