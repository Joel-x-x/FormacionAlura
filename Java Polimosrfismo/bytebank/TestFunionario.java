package bytebank;

public class TestFunionario {
  public static void main(String[] args) {

    // Clase Funcionario
    Funcionario funcionario = new Contador();
    funcionario.setDocument("334444");
    funcionario.setNombre("Diego");
    funcionario.setSalario(2000);
    System.out.println(funcionario.getBonificacion());
  }
}
