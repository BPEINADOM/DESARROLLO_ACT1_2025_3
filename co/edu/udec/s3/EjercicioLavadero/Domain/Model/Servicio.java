import java.util.Date;

public class Servicio {
    private int servicio_id;
    private String nombre;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_finalizacion;
    private String hora_inicio;
    private String hora_finalizacion;
    private String nombre_empleado;
    private int precio;
    private int porcentaje_iva;
    private int valor_iva;
    private int precio_iva;
    private int precio_iva_descuento;
    private int precio_total;

    public Servicio () {

    }

    public Servicio(int servicio_id, String nombre, String descripcion, String nombre_empleado) {
        this.servicio_id = servicio_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombre_empleado = nombre_empleado;
    }

    public Servicio(Date fecha_inicio, Date fecha_finalizacion, String hora_inicio, String hora_finalizacion) {
        this.fecha_inicio = fecha_inicio;
        this.fecha_finalizacion = fecha_finalizacion;
        this.hora_inicio = hora_inicio;
        this.hora_finalizacion = hora_finalizacion;
    }

    public Servicio(int precio, int porcentaje_iva, int valor_iva, int precio_iva, int precio_iva_descuento, int precio_total) {
        this.precio = precio;
        this.porcentaje_iva = porcentaje_iva;
        this.valor_iva = valor_iva;
        this.precio_iva = precio_iva;
        this.precio_iva_descuento = precio_iva_descuento;
        this.precio_total = precio_total;
    }

    public int getServicio_id() {
        return servicio_id;
    }

    public void setServicio_id(int servicio_id) {
        this.servicio_id = servicio_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(Date fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_finalizacion() {
        return hora_finalizacion;
    }

    public void setHora_finalizacion(String hora_finalizacion) {
        this.hora_finalizacion = hora_finalizacion;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPorcentaje_iva() {
        return porcentaje_iva;
    }

    public void setPorcentaje_iva(int porcentaje_iva) {
        this.porcentaje_iva = porcentaje_iva;
    }

    public int getValor_iva() {
        return valor_iva;
    }

    public void setValor_iva(int valor_iva) {
        this.valor_iva = valor_iva;
    }

    public int getPrecio_iva() {
        return precio_iva;
    }

    public void setPrecio_iva(int precio_iva) {
        this.precio_iva = precio_iva;
    }

    public int getPrecio_iva_descuento() {
        return precio_iva_descuento;
    }

    public void setPrecio_iva_descuento(int precio_iva_descuento) {
        this.precio_iva_descuento = precio_iva_descuento;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }
    
}
