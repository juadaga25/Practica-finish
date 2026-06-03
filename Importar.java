import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class Importar {
    public LinkedList<EstudianteInge> ImportarArchivo() {
        String rutaArchivo = "EstudianteInge.txt";
        LinkedList<EstudianteInge> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            EstudianteInge obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Cedula:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new EstudianteInge();
                    obj.setCedula(linea.substring(8));
                } else if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        obj.setNombre(linea.substring(8));
                    }
                } else if (linea.startsWith("Apellido:")) {
                    if (obj != null) {
                        obj.setApellido(linea.substring(10));
                    }
                } else if (linea.startsWith("Telefono:")) {
                    if (obj != null) {
                        obj.setTelefono(linea.substring(11));
                    }
                } else if (linea.startsWith("Numero de Semestre:")) {
                    if (obj != null) {
                        obj.setNumSemestre(Integer.parseInt(linea.substring(6)));
                    }
                } else if (linea.startsWith("Promedio Acumulado:")) {
                    if (obj != null) {
                        obj.setPromAcumulado(Integer.parseInt(linea.substring(6)));
                    }
                } else if (linea.startsWith("Serial :")) {
                    if (obj != null) {
                        obj.setSerialEquipo(linea.substring(11));
                        lista.add(obj);
                        obj = null;
                    }
                }
                
            }
            System.out.println("Archivo importado correcrtamente ");

        } catch (Exception e) {
            // TODO: handle exception
        }
        return lista;
    }

    public LinkedList<CompuPortatil> ImportarArchivoP() {
        String rutaArchivo = "EstudianteInge.txt";
        LinkedList<CompuPortatil> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            CompuPortatil obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Serial:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new CompuPortatil();
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
                } else if (linea.startsWith("Sistema Operativo:")) {
                    if (obj != null) {
                        obj.setSitemOP(linea.substring(15));
                    }
                } else if (linea.startsWith("Procesador:")) {
                    if (obj != null) {
                        obj.setPreocesador(linea.substring(8));
                    }
                } 
                
            }
            System.out.println("Archivo importado correcrtamente ");

        } catch (Exception e) {
            // TODO: handle exception
        }
        return lista;
    }

}