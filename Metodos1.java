import java.util.LinkedList;
import java.util.Scanner;

public class Metodos1 {


    // =====================================
    // REGISTRAR COMPUTADOR PORTATIL
    // =====================================

    public LinkedList<CompuPortatil> llenarListaPortatil(LinkedList<CompuPortatil> l, Scanner sc){

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



        // SUBMENU SISTEMA OPERATIVO

        int op;

        System.out.println("=== SISTEMA OPERATIVO ===");
        System.out.println("1. Windows 7");
        System.out.println("2. Windows 10");
        System.out.println("3. Windows 11");

        op = sc.nextInt();

        switch(op){

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


        l.add(cp);

        System.out.println("Computador registrado correctamente.");

        return l;
    }



    // =====================================
    // REGISTRAR TABLETA GRAFICA
    // =====================================

    public LinkedList<TabletGrafica> llenarListaTablet(LinkedList<TabletGrafica> l, Scanner sc){

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



        // SUBMENU ALMACENAMIENTO

        int op;

        System.out.println("=== ALMACENAMIENTO ===");
        System.out.println("1. 256 GB");
        System.out.println("2. 512 GB");
        System.out.println("3. 1 TB");

        op = sc.nextInt();

        switch(op){

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
    // MOSTRAR COMPUTADORES
    // =====================================

    public void mostrarPortatiles(LinkedList<CompuPortatil> l){

        for (CompuPortatil c : l) {

            System.out.println("================================");
            System.out.println("Serial: " + c.getSerial());
            System.out.println("Marca: " + c.getMarca());
            System.out.println("Tamaño: " + c.getTamaño());
            System.out.println("Precio: " + c.getPrecio());
            System.out.println("Sistema Operativo: " + c.getSitemOP());
        }
    }



    // =====================================
    // MOSTRAR TABLETS
    // =====================================

    public void mostrarTablets(LinkedList<TabletGrafica> l){

        for (TabletGrafica t : l) {

            System.out.println("================================");
            System.out.println("Serial: " + t.getSerial());
            System.out.println("Marca: " + t.getMarca());
            System.out.println("Tamaño: " + t.getTamaño());
            System.out.println("Precio: " + t.getPrecio());
            System.out.println("Almacenamiento: " + t.getAlmacenamiento() + " GB");
            System.out.println("Peso: " + t.getPeso());
        }
    }



    // =====================================
    // BUSCAR COMPUTADOR
    // =====================================

    public void buscarPortatil(LinkedList<CompuPortatil> l, Scanner sc){

        System.out.print("Ingrese serial del computador: ");
        String serial = sc.next();

        boolean encontrado = false;

        for (CompuPortatil c : l) {

            if (c.getSerial().equals(serial)) {

                System.out.println("=== COMPUTADOR ENCONTRADO ===");
                System.out.println("Serial: " + c.getSerial());
                System.out.println("Marca: " + c.getMarca());
                System.out.println("Tamaño: " + c.getTamaño());
                System.out.println("Precio: " + c.getPrecio());
                System.out.println("Sistema Operativo: " + c.getSitemOP());

                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("Computador no encontrado.");
        }
    }



    // =====================================
    // BUSCAR TABLET
    // =====================================

    public void buscarTablet(LinkedList<TabletGrafica> l, Scanner sc){

        System.out.print("Ingrese serial de la tablet: ");
        String serial = sc.next();

        boolean encontrado = false;

        for (TabletGrafica t : l) {

            if (t.getSerial().equals(serial)) {

                System.out.println("=== TABLET ENCONTRADA ===");
                System.out.println("Serial: " + t.getSerial());
                System.out.println("Marca: " + t.getMarca());
                System.out.println("Tamaño: " + t.getTamaño());
                System.out.println("Precio: " + t.getPrecio());
                System.out.println("Almacenamiento: " + t.getAlmacenamiento() + " GB");
                System.out.println("Peso: " + t.getPeso());

                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("Tablet no encontrada.");
        }
    }

}
