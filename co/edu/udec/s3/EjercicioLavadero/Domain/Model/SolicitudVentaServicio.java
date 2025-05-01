public class SolicitudVentaServicio {
    private int solicitud_servicio_id;
    private String planta;
    private String marca;
    private String tipo;
    private String color;
    private String servicio;

    public SolicitudVentaServicio () {

    }

    public SolicitudVentaServicio(int solicitud_servicio_id, String planta, String marca, String tipo, String color, String servicio) {
        this.solicitud_servicio_id = solicitud_servicio_id;
        this.planta = planta;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.servicio = servicio;
    }
    
    public int getSolicitud_servicio_id() {
        return solicitud_servicio_id;
    }

    public void setSolicitud_servicio_id(int solicitud_servicio_id) {
        this.solicitud_servicio_id = solicitud_servicio_id;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
}
