package bytebank;

public abstract class Funcionario {
  private String nombre;
  private String document;
  private double salario;

  public Funcionario() {

  }


/*   public double getBonificacion(double porcentajeBonificacion) {
    if(porcentajeBonificacion <= 0 && porcentajeBonificacion > 100) {
      System.out.println("El porcentaje de bonificación tiene que comprender los rangos entre 1 y 100");
      return 0;
    }
    porcentajeBonificacion = porcentajeBonificacion / 100; 
    return this.salario * porcentajeBonificacion;
  } */

  // Método Abstracto: Indica que las clases hijas obligatoriamente deben tener este método
  public abstract double getBonificacion();

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

}