package bytebank;

public class TestCuentaSaldoInsuficiente {
  public static void main(String[] args) {
    CuentaAhorros ca = new CuentaAhorros(123, 4);

    ca.deposita(200);
    try {
      ca.saca(199);
    } catch (InsuficienteSaldoException e) {
      e.printStackTrace();
    }
  }
}
