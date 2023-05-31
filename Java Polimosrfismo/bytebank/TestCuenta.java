package bytebank;

public class TestCuenta {
  public static void main(String[] args) {
    CuentaAhorros ca = new CuentaAhorros(1, 1);
    CuentaCorriente cc = new CuentaCorriente(2, 2);

    cc.deposita(2000);
    try {
      cc.transfiere(1000, ca);
    } catch (InsuficienteSaldoException e) {
      e.printStackTrace();
    }

    System.out.println(cc.getSaldo());
    System.out.println(ca.getSaldo());
  }
}
