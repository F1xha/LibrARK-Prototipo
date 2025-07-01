package LibrARK;

public  class Libro {
    protected int codigo;
    private String nombre;
    private String categoria;
    private String Autor;
    private double cantidad;
    private Usuario usuario;

    public Libro() {    }

    public Libro(int codigo, String nombre, String categoria, double cantidad, String autor, Usuario usuario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        Autor = autor;
        this.usuario = usuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", Autor='" + Autor + '\'' +
                ", cantidad=" + cantidad +
                ", usuario=" + usuario +
                '}';
    }
}
