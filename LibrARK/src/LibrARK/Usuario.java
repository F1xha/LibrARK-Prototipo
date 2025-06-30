package LibrARK;

public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    protected int numero;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String email, int edad, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
        this.numero = numero;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", numero=" + numero +
                '}';
    }
}
