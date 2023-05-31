public class Cliente {

  private String nombre;
  private String n_cuenta;
  private double saldo;  
  
  public Cliente(String nombre, String n_cuenta, double saldo) {
    this.nombre = nombre;
    this.n_cuenta = n_cuenta;
    this.saldo = saldo;
  }


  public void setN_cuenta(String n_cuenta) {
    this.n_cuenta = n_cuenta;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  public String getN_cuenta() {
    return n_cuenta;
  }
  public String getNombre() {
    return nombre;
  }
  public double getSaldo() {
    return saldo;
  }

  
}
