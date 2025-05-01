public class Vehiculo {
    private int vehiculo_id;
    private String planta;
    private String marca;
    private String tipo;
    private String color;

    public Vehiculo() {

    }

    public Vehiculo(int vehiculo_id, String planta, String marca, String tipo, String color) {
        this.vehiculo_id = vehiculo_id;
        this.planta = planta;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
    }

    public int getVehiculo_id() {
        return vehiculo_id;
    }

    public void setVehiculo_id(int vehiculo_id) {
        this.vehiculo_id = vehiculo_id;
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

}
