import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private Map<String, Producto> productos;


    public Inventario() {
        // Inicializamos el HashMap
        productos = new HashMap<>();
    }


    public Map<String, Producto> getProductos() {
        return productos;
    }

    public void setProductos(Map<String, Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "productos=" + productos +
                '}';
    }


    // Método para agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
        System.out.println("Producto agregado: " + producto);
    }

    // Método para eliminar un producto por su código
    public void eliminarProducto(String codigo) {
        Producto producto = productos.remove(codigo);
        if (producto != null) {
            System.out.println("Producto eliminado: " + producto);
        } else {
            System.out.println("Producto con código " + codigo + " no encontrado.");
        }
    }

    // Método para modificar un producto
    public void modificarProducto(String codigo, String nuevoNombre, double nuevoPrecio) {
        Producto producto = productos.get(codigo);
        if (producto != null) {
            producto.setNombre(nuevoNombre);
            producto.setPrecio(nuevoPrecio);
            System.out.println("Producto modificado: " + producto);
        } else {
            System.out.println("Producto con código " + codigo + " no encontrado.");
        }
    }

    // Método para ver un producto por su código
    public void verProducto(String codigo) {
        Producto producto = productos.get(codigo);
        if (producto != null) {
            System.out.println(producto);
        } else {
            System.out.println("Producto con código " + codigo + " no encontrado.");
        }
    }

    // Método para listar todos los productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (Producto producto : productos.values()) {
                System.out.println(producto);
            }
        }
    }


}
