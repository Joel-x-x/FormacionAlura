package bytebank;

public class TestGerente {
  public static void main(String[] args) {
    Gerente gerente = new Gerente();

    gerente.setSalario(3000);
    System.out.println(gerente.getBonificacion());

    gerente.setClave("1234");
    System.out.println(gerente.iniciarSesion("1234"));    
  }
}
