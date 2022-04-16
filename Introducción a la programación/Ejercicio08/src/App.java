public class App {
    public static void main(String[] args) throws Exception {

        Persona p = new Persona();

        p.setEdad(20);
        p.setNombre("Juan");
        p.setTelefono("12345678");

        System.out.println("Mi nombre es " + p.getNombre() + " y tengo " + p.getEdad() + " años"+ " y mi telefono es " + p.getTelefono());
    }
}
