package entidades;

public class SmartWatch extends SmartDevice {
  
  private String size;
  private String color;
  private String type;
  private Boolean pantallaColor;

  public SmartWatch() {
  }

  public SmartWatch(String marca, String modelo, String duracionBateria, String size, String color, String type,
      Boolean pantallaColor) {
    super(marca, modelo, duracionBateria);
    this.size = size;
    this.color = color;
    this.type = type;
    this.pantallaColor = pantallaColor;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Boolean getPantallaColor() {
    return pantallaColor;
  }

  public void setPantallaColor(Boolean pantallaColor) {
    this.pantallaColor = pantallaColor;
  }

  @Override
  public String toString() {
    return super.toString() + "SmartWatch [color=" + color + ", pantallaColor=" + pantallaColor + ", size=" + size + ", type=" + type
        + "]";
  }

  
}
