public class App {

// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente(20, "Juan", "123456789", 1000);
        System.out.println(cliente);
        

        Trabajador trabajador = new Trabajador(30, "Pedro", "987654321", 2000);
        System.out.println(trabajador);


    }
}
