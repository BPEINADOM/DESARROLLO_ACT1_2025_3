import java.util.Date;

public class NotaCorreccionPedido {
    private int nota_id;
    private String codigo;
    private Date fecha_emision;
    private Date fecha_maxima_confirmacion;
    private Date fecha_maxima_entrega;
    private String codigo_pedido;
    private Proveedor proveedor;
    private Empresa empresa;

    public NotaCorreccionPedido () {

    }

    public NotaCorreccionPedido(int nota_id, String codigo, String codigo_pedido, Proveedor proveedor, Empresa empresa) {
        this.nota_id = nota_id;
        this.codigo = codigo;
        this.codigo_pedido = codigo_pedido;
        this.proveedor = proveedor;
        this.empresa = empresa;
    }

    public NotaCorreccionPedido(Date fecha_emision, Date fecha_maxima_confirmacion, Date fecha_maxima_entrega) {
        this.fecha_emision = fecha_emision;
        this.fecha_maxima_confirmacion = fecha_maxima_confirmacion;
        this.fecha_maxima_entrega = fecha_maxima_entrega;
    }

    public int getNota_id() {
        return nota_id;
    }

    public void setNota_id(int nota_id) {
        this.nota_id = nota_id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date getFecha_maxima_confirmacion() {
        return fecha_maxima_confirmacion;
    }

    public void setFecha_maxima_confirmacion(Date fecha_maxima_confirmacion) {
        this.fecha_maxima_confirmacion = fecha_maxima_confirmacion;
    }

    public Date getFecha_maxima_entrega() {
        return fecha_maxima_entrega;
    }

    public void setFecha_maxima_entrega(Date fecha_maxima_entrega) {
        this.fecha_maxima_entrega = fecha_maxima_entrega;
    }

    public String getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(String codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
}
