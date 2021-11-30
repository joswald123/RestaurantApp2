package usa.sesion1.reto2;

public class Producto {

    private String nombre;
    private int precio;
    private int id;
    private int imagen;

    public Producto(int id, String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }

    public Producto(int id, String nombre, int precio, int imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
