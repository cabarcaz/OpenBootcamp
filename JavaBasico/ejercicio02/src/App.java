import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        menu();
    }

    static double precioProducto(double precio, double iva) {
        double porcentaje = iva / 100;
        double calculoIva = precio * porcentaje;
        double total = precio + calculoIva;

        return total;
    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        String nombre = sc.next();
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();
        System.out.println("Ingrese el iva");
        double iva = sc.nextDouble();

        System.out.println("Por el producto " + nombre + ", el total a pagar es de: " + precioProducto(precio, iva));
    }

}
