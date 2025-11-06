import modulos.*;
import interfaces.arregloInterface.ArreglosInterface;

public class Main {
    public static void main(String[] args) {
        ManejadorLista manejo = new ManejadorLista();
        Administrador admin = new Administrador("Admin Principal", "admin@gmail.com");
        
        Empleado[] empleados = {
            new Empleado("Juan Pérez", "juan@gmail.com"),
            new Empleado("María García", "maria@gmail.com"),
            new Empleado("Carlos López", "carlos@gmail.com")
        };
        
        System.out.println("=== DEMOSTRACIÓN DE MENÚS ===");
        admin.mostrarMenu();
        System.out.println();
        empleados[0].mostrarMenu();

        System.out.println("\n=== PRUEBA DE ARREGLOS INTERFACE ===\n");

        System.out.println("1. ARREGLO ORIGINAL:");
        imprimirArreglo(empleados);

        System.out.println("\n2. ARREGLO EN REVERSA:");
        Empleado[] reversa = manejo.regresarReversa(empleados);
        imprimirArreglo(reversa);

        System.out.println("\n3. AGREGAR ELEMENTO:");
        Empleado nuevoEmpleado = new Empleado("Ana Martínez", "ana@gmail.com");
        Empleado[] conNuevo = manejo.agregarElemento(empleados, nuevoEmpleado);
        imprimirArreglo(conNuevo);

        System.out.println("\n4. BUSCAR ELEMENTO:");
        Empleado encontrado = manejo.buscarElemento(empleados, 1);
        System.out.println("Empleado en posición 1: " + encontrado);

        System.out.println("\n5. ELIMINAR ELEMENTO:");
        Empleado[] sinElemento = manejo.eliminarElemento(empleados, 0);
        imprimirArreglo(sinElemento);

        System.out.println("\n6. PRUEBA DE EXCEPCIONES:");
        try {
            manejo.regresarReversa(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }

    private static void imprimirArreglo(Empleado[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("Arreglo vacío o nulo");
            return;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("  [" + i + "] " + arreglo[i]);
        }
        System.out.println("  Total elementos: " + arreglo.length);
    }
}
