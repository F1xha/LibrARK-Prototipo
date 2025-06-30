package LibrARK;

public class LibrARK {

    public static void main(String[] args) {
        Usuario Juan = new Usuario("juan","Rodriges","tumorenitomasna@gmail.com",19,999999999);
        Usuario Kazumi = new Usuario("Kazumi","Rodriges","Nastergers@gmail.com",21,988888888);

        Libro l1 = new Libro(1,"Mototo","Ficcion",1,"Pedro Sanchez",Juan);
        Libro l2 = new Libro(2,"Gloria","Ficcion",2,"Rigoberta Hernandez",Kazumi);


        RegistroLibros reg = new RegistroLibros();
        RegistroCliente usu = new RegistroCliente();
        reg.agregar(l1);
        reg.agregar(l2);
        usu.agregar(Juan);
        usu.agregar(Kazumi);
        System.out.println(reg.listarTodosLibros());
        System.out.println(usu.listarTodosUsuario());

        
    }
    
}
