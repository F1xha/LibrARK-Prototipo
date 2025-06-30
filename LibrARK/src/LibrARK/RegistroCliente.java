package LibrARK;

import java.util.ArrayList;

public class RegistroCliente {
    private ArrayList<Usuario> lista = new ArrayList<>();

    public Usuario buscar(int numero) {
        for (Usuario usuario : lista)
            if(usuario.numero == numero)
                return usuario;
        return null;
    }
    public boolean agregar(Usuario p) {
        if(buscar(p.numero) == null)
            return lista.add(p);
        return false;
    }
    public boolean eliminar(int codigo) {
        return lista.remove(buscar(codigo));
    }
    public String listarTodosUsuario() {
        String txt = "LISTADO DE usuario\n";
        txt += "--------------------\n";
        for (Usuario usuario : lista)
            txt += usuario + "\n";
        txt += "Cantidad de usuario: " + lista.size() + "\n";
        return txt;
    }

}
