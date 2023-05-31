package bytebank;

public class TestBonificacion {
  public static void main(String[] args) {
    Bonificacion bonificacion = new Bonificacion();

    Gerente gerente = new Gerente();
    gerente.setSalario(5000);
    Funcionario funcionario = new Contador();
    funcionario.setSalario(2000);

    bonificacion.controlBonificacion(gerente);
    bonificacion.controlBonificacion(funcionario);

    System.out.println(bonificacion.getSuma());
  }
}
