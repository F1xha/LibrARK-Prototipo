package LibrARK;

import java.util.ArrayList;

public class RegistroLibros {
    private ArrayList<Libro> lista = new ArrayList<>();
    
    public Libro buscar(int codigo) {
        for (Libro libro : lista)
            if(libro.codigo == codigo)
                return libro;
        return null;
    }
    public boolean agregar(Libro p) {
        if(buscar(p.codigo) == null)
            return lista.add(p);
        return false;
    }
    public boolean eliminar(int codigo) {
        return lista.remove(buscar(codigo));
    }
    public String listarTodosLibros() {
        String txt = "LISTADO DE Libro\n";
        txt += "--------------------\n";
        for (Libro libro : lista)
            txt += libro + "\n";
        txt += "Cantidad de Libro: " + lista.size() + "\n";
        return txt;

    }
}
