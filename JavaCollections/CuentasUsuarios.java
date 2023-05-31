import java.util.HashSet;
import java.util.Set;

public class CuentasUsuarios {
  public static void main(String[] args) {
    Cliente cl1 = new Cliente("Antonio", "00001", 200000);
    Cliente cl2 = new Cliente("Rafael", "00002", 250000);
    Cliente cl3 = new Cliente("Sofia", "00003", 300000);
    Cliente cl4 = new Cliente("Julio", "00004", 1000000);

    Set<Cliente> clientesBanco = new HashSet<>();

    clientesBanco.add(cl1);
    clientesBanco.add(cl2);
    clientesBanco.add(cl3);
    clientesBanco.add(cl4);

    for (Cliente cliente : clientesBanco) {
      System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
    }

  }
}
