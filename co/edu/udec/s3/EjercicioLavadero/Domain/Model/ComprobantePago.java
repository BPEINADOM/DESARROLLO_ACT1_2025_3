import java.util.Date;

public class ComprobantePago {
    private int comprobante_id;
    private Date fecha_pago;
    private Empresa empresa;
    private int valor_pagar;
    private String numero_cuenta;

    public ComprobantePago () {

    }

    public ComprobantePago (int comprobante_id, int valor_pagar, String numero_cuenta) {
        this.comprobante_id = comprobante_id;
        this.valor_pagar = valor_pagar;
        this.numero_cuenta = numero_cuenta;
    }


    public int getComprobante_id() {
        return comprobante_id;
    }

    public void setComprobante_id(int comprobante_id) {
        this.comprobante_id = comprobante_id;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getValor_pagar() {
        return valor_pagar;
    }

    public void setValor_pagar(int valor_pagar) {
        this.valor_pagar = valor_pagar;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

}
