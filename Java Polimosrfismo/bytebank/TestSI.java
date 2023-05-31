package bytebank;

public class TestSI {
  public static void main(String[] args) {
    SistemaInterno sistema = new SistemaInterno();
    Gerente gerente = new Gerente();
    Administrador admin = new Administrador();

    gerente.setClave("1234");
    admin.setClave("1233");

    sistema.autenticar(gerente);
    sistema.autenticar(admin);
  }
}
