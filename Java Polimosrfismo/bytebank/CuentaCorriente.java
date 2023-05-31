package bytebank;

public class CuentaCorriente extends Cuenta implements Comision {
  public CuentaCorriente(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override // Significa que el metodo se está sobreescribiendo
  public void saca(double valor) throws InsuficienteSaldoException{
    super.saca(this.comision(valor));
    System.out.println("Sacación exitosa saldo: " + this.getSaldo());
  }

  @Override
  public void deposita(double valor) {
    this.saldo += valor;
  }

  @Override
  public double comision(double valor) {
      return valor + 0.2;
  }

}
