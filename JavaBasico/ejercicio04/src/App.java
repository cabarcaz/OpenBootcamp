import entidades.SmartPhone;
import entidades.SmartWatch;

public class App {
    public static void main(String[] args) throws Exception {

        SmartPhone phone = new SmartPhone();
        SmartWatch watch = new SmartWatch();

        // Telefono
        phone.setMarca("Apple");
        phone.setModelo("Iphone X");
        phone.setDuracionBateria("3 horas");
        phone.setCamera(true);
        phone.setFlash(true);
        phone.setChargeType("USB");
        phone.setColor("black");
        phone.setsO("iOS");

        // Reloj
        watch.setMarca("Apple");
        watch.setModelo("Watch");
        watch.setDuracionBateria("3 horas");
        watch.setSize("42mm");
        watch.setColor("black");
        watch.setType("smart");
        watch.setPantallaColor(true);

        System.out.println(phone);
        System.out.println(watch);

    }
}
