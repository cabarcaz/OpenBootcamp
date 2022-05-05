package entidades;

public class SmartDevice {
  
  private String marca;
  private String modelo;
  private String duracionBateria;

  
  public SmartDevice() {
  }


  public SmartDevice(String marca, String modelo, String duracionBateria) {
    this.marca = marca;
    this.modelo = modelo;
    this.duracionBateria = duracionBateria;
  }


  public String getMarca() {
    return marca;
  }


  public void setMarca(String marca) {
    this.marca = marca;
  }


  public String getModelo() {
    return modelo;
  }


  public void setModelo(String modelo) {
    this.modelo = modelo;
  }


  public String getDuracionBateria() {
    return duracionBateria;
  }


  public void setDuracionBateria(String duracionBateria) {
    this.duracionBateria = duracionBateria;
  }


  @Override
  public String toString() {
    return "SmartDevice [duracionBateria=" + duracionBateria + ", marca=" + marca + ", modelo=" + modelo + "]";
  }

  

}
