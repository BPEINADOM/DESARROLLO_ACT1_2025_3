public class Cliente {
    private int client_id;
    private String nombre;
    private String apellido;
    private String correo;
    private String numero_telefono;

    public Cliente () {

    }

    public Cliente (int client_id, String nombre, String apellido) {
        this.client_id = client_id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente (String correo, String numero) {
        this.correo = correo;
        this.numero_telefono = numero;
    }


    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    
}
