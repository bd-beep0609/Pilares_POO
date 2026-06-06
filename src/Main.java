import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // Variable para controlar si el usuario quiere continuar
        String continuar;
        int contadorId = 1;  // Para asignar IDs automáticos

        System.out.println("=== REGISTRO DE PRODUCTOS ===\n");

        // Ejercicio 2: Solicitar datos hasta que el usuario decida detenerse
        do {
            System.out.println("--- Producto #" + contadorId + " ---");

            Producto producto = new Producto();

            producto.setId(contadorId);

            System.out.print("Nombre del producto: ");
            producto.setNombre(sc.nextLine());

            System.out.print("Marca del producto: ");
            producto.setMarca(sc.nextLine());

            System.out.print("Precio del producto: ");
            producto.setPrecio(Double.parseDouble(sc.nextLine()));

            listaProductos.add(producto);

            System.out.print("\n¿Desea registrar otro producto? (s/n): ");
            continuar = sc.nextLine();
            System.out.println();

            contadorId++;

        } while (continuar.equalsIgnoreCase("s"));

        // Ejercicio 3: Mostrar los productos registrados usando Iterator
        System.out.println("\n=== LISTA DE PRODUCTOS REGISTRADOS ===");

        if (listaProductos.isEmpty()) {
            System.out.println("No se registró ningún producto.");
        } else {

            Iterator<Producto> iterador = listaProductos.iterator();

            while (iterador.hasNext()) {
                Producto prod = iterador.next();
                System.out.println(prod.toString());
            }

            System.out.println("\nTotal de productos registrados: " + listaProductos.size());
        }

        sc.close();
    }
}