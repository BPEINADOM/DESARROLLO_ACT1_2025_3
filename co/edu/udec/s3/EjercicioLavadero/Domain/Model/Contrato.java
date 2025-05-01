import java.util.Date;

public class Contrato {
    private int contrato_id;
    private Date fecha_inicio;
    private int sueldo_base;
    private String cargo;
    private String horario;

    public Contrato () {

    }

    public Contrato (int contrato_id, int sueldo_base) {
        this.contrato_id = contrato_id;
        this.sueldo_base = sueldo_base;
    }

    public Contrato (Date fecha_inicio, String cargo, String horario) {
        this.fecha_inicio = fecha_inicio;
        this.cargo = cargo;
        this.horario = horario;
    }

    public int getContrato_id() {
        return contrato_id;
    }

    public void setContrato_id(int contrato_id) {
        this.contrato_id = contrato_id;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
