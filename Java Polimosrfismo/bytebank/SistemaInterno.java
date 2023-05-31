package bytebank;

public class SistemaInterno {

  private String clave = "1234";

  public boolean autenticar(Autenticable gerente) {
    boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
    if(puedeIniciarSesion) {
      System.out.println("Inicio sesión exitoso");
      return true;
    }
    else {
      System.out.println("No se pudo iniciar sesión");
      return false;
    }
  }
}
