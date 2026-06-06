import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        // Colección ArrayList para almacenar empleados
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        // Scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);

        // Variable para controlar si el usuario quiere continuar
        String continuar;
        int contadorId = 1;

        System.out.println("=== REGISTRO DE EMPLEADOS ===\n");

        // Bucle para registrar empleados hasta que el usuario decida detenerse
        do {
            System.out.println("--- Empleado #" + contadorId + " ---");

            Empleado empleado = new Empleado();
            empleado.setId(contadorId);

            System.out.print("Nombre: ");
            empleado.setNombre(sc.nextLine());

            System.out.print("Apellido: ");
            empleado.setApellido(sc.nextLine());

            System.out.print("Departamento: ");
            empleado.setDepartamento(sc.nextLine());

            System.out.print("Salario: ");
            empleado.setSalario(Double.parseDouble(sc.nextLine()));

            listaEmpleados.add(empleado);

            System.out.print("\n¿Desea registrar otro empleado? (s/n): ");
            continuar = sc.nextLine();
            System.out.println();

            contadorId++;

        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar empleados registrados usando Iterator
        System.out.println("\n=== LISTA DE EMPLEADOS REGISTRADOS ===");

        if (listaEmpleados.isEmpty()) {
            System.out.println("No se registró ningún empleado.");
        } else {
            Iterator<Empleado> iterador = listaEmpleados.iterator();

            while (iterador.hasNext()) {
                Empleado emp = iterador.next();
                System.out.println(emp.toString());
            }

            System.out.println("\nTotal de empleados registrados: " + listaEmpleados.size());
        }

        sc.close();
    }
}