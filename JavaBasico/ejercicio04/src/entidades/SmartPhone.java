package entidades;

public class SmartPhone extends SmartDevice{

  private Boolean camera;
  private Boolean flash;
  private String chargeType;
  private String color;
  private String sO;
  
  public SmartPhone() {
  }
  
  public SmartPhone(String marca, String modelo, String duracionBateria, Boolean camera, Boolean flash,
      String chargeType, String color, String sO) {
    super(marca, modelo, duracionBateria);
    this.camera = camera;
    this.flash = flash;
    this.chargeType = chargeType;
    this.color = color;
    this.sO = sO;
  }
  public Boolean getCamera() {
    return camera;
  }
  public void setCamera(Boolean camera) {
    this.camera = camera;
  }
  public Boolean getFlash() {
    return flash;
  }
  public void setFlash(Boolean flash) {
    this.flash = flash;
  }
  public String getChargeType() {
    return chargeType;
  }
  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public String getsO() {
    return sO;
  }
  public void setsO(String sO) {
    this.sO = sO;
  }

  @Override
  public String toString() {
    return super.toString() +"SmartPhone [camera=" + camera + ", chargeType=" + chargeType + ", color=" + color + ", flash=" + flash
        + ", sO=" + sO + "]";
  }




}
