package bytebank;

public class CuentaAhorros extends Cuenta implements Comision {
  public CuentaAhorros(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
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
