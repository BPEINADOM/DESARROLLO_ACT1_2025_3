public class Cubiculo {
    private int cubiculo_int;
    private String codigo;
    private String nombre;
    private int area;
    private String estado;

    public Cubiculo () {

    }

    public Cubiculo(int cubiculo_int, String codigo, String nombre, int area, String estado) {
        this.cubiculo_int = cubiculo_int;
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.estado = estado;
    }

    public int getCubiculo_int() {
        return cubiculo_int;
    }

    public void setCubiculo_int(int cubiculo_int) {
        this.cubiculo_int = cubiculo_int;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
