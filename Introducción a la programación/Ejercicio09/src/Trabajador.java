public class Trabajador extends Persona {
  private int salario;

  public Trabajador() {
    super();
  }

  public Trabajador(int edad, String nombre, String telefono, int salario) {
    super(edad, nombre, telefono);
    this.salario = salario;
  }

  public int getSalario() {
    return salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "Trabajador [salario=" + salario + ", edad=" + getEdad() + ", nombre=" + getNombre() + ", telefono=" + getTelefono() + "]";
  }
}