package bytebank;

public class Bonificacion {
  private double suma;

  public Bonificacion() {
    this.suma = 0;
  }

  public void controlBonificacion(Funcionario funcionario) {
    this.suma += funcionario.getBonificacion();
  }

  public double getSuma() {
    return suma;
  }
}
