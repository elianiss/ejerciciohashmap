import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Eliana Camila Guevara Cubillos
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Ver producto");
            System.out.println("5. Listar todos los productos");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            op = scanner.nextInt();
            scanner.nextLine();


            switch (op) {
                case 1:

                    System.out.print("Introduce el código del producto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Introduce el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el precio del producto: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();
                    Producto producto = new Producto(codigo, nombre, precio);
                    inventario.agregarProducto(producto);
                    break;
                case 2:

                    System.out.print("Introduce el código del producto a eliminar: ");
                    String codigoEliminar = scanner.nextLine();
                    inventario.eliminarProducto(codigoEliminar);
                    break;
                case 3:

                    System.out.print("Introduce el código del producto a modificar: ");
                    String codigoModificar = scanner.nextLine();
                    System.out.print("Introduce el nuevo nombre del producto: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Introduce el nuevo precio del producto: ");
                    double nuevoPrecio = scanner.nextDouble();
                    scanner.nextLine();
                    inventario.modificarProducto(codigoModificar, nuevoNombre, nuevoPrecio);
                    break;
                case 4:

                    System.out.print("Introduce el código del producto a ver: ");
                    String codigoVer = scanner.nextLine();
                    inventario.verProducto(codigoVer);
                    break;
                case 5:

                    inventario.listarProductos();
                    break;
                case 6:

                    System.out.println("Saliendo del sistema de inventario...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (op != 6);

        scanner.close();
    }


}