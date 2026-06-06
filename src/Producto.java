public class Producto {
    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String marca;
    private double precio;

    // Constructor vacío (opcional)
    public Producto() {
    }

    // Constructor con parámetros
    public Producto(int id, String nombre, String marca, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    // Métodos Getters y Setters (acceso controlado)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para mostrar información del producto (opcional pero útil)
    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Marca: " + marca + " | Precio: $" + precio;
    }
}