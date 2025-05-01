import java.util.List;

public class Producto {
    private int producto_id;
    private String codigo;
    private String precio;
    private String descripcion;
    private String imagen_representativa;
    private String estado_disponibilidad;
    private Categoria categoria;
    private String marca;
    private String stock;
    private List<Proveedor> listaDeProveedores;

    public Producto () {

    }

    public Producto(int producto_id, String codigo, String precio, String descripcion, String imagen_representativa) {
        this.producto_id = producto_id;
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.imagen_representativa = imagen_representativa;
    }

    public Producto(String estado_disponibilidad, String marca, String stock) {
        this.estado_disponibilidad = estado_disponibilidad;
        this.marca = marca;
        this.stock = stock;
    }

    public Producto(Categoria categoria, List<Proveedor> listaDeProveedores) {
        this.categoria = categoria;
        this.listaDeProveedores = listaDeProveedores;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen_representativa() {
        return imagen_representativa;
    }

    public void setImagen_representativa(String imagen_representativa) {
        this.imagen_representativa = imagen_representativa;
    }

    public String getEstado_disponibilidad() {
        return estado_disponibilidad;
    }

    public void setEstado_disponibilidad(String estado_disponibilidad) {
        this.estado_disponibilidad = estado_disponibilidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public List<Proveedor> getListaDeProveedores() {
        return listaDeProveedores;
    }

    public void setListaDeProveedores(List<Proveedor> listaDeProveedores) {
        this.listaDeProveedores = listaDeProveedores;
    }
    
}
