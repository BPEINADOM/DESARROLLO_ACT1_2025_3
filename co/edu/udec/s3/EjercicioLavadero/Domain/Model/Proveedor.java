import java.util.List;

public class Proveedor {
    private int proveedor_id;
    private String tipo_documento;
    private String numero_documento;
    private String nombre;
    private String correo;
    private String numero_telefono;
    private String cuenta_bancaria;
    private List<Producto> listaDeProductos;

    public Proveedor () {

    }

    public Proveedor(int proveedor_id, String tipo_documento, String numero_documento, String nombre, String correo) {
        this.proveedor_id = proveedor_id;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Proveedor(String numero_telefono, String cuenta_Bancaria, List<Producto> listaDeProductos) {
        this.numero_telefono = numero_telefono;
        this.cuenta_bancaria = cuenta_Bancaria;
        this.listaDeProductos = listaDeProductos;
    }

    public int getProveedor_id() {
        return proveedor_id;
    }

    public void setProveedor_id(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getCuenta_bancaria() {
        return cuenta_bancaria;
    }

    public void setCuenta_bancaria(String cuenta_bancaria) {
        this.cuenta_bancaria = cuenta_bancaria;
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }
    
}
