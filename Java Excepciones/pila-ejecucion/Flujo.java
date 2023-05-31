public class Flujo {

  public static void main(String[] args) {
    System.out.println("Inicio del main");
    metodo1();
    System.out.println("Fin del main");
  }

  private static void metodo1() {
    System.out.println("Inicio del metodo1");
    metodo2();
    System.out.println("Fin del metodo1");
  }

  private static void metodo2() {
    System.out.println("Inicio del metodo2");
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);

      try {
        // El try solo captura el primer error los demás los ignora deberian estar en otro try catch
        int num = 0;
        int result = 20 / num;
        System.out.println(result);

        String nombre = null;
        System.out.println(nombre.toString());
      }
      catch (ArithmeticException | NullPointerException exception) {
        System.out.println(exception.getMessage());
        exception.printStackTrace();
      }
      /*catch (NullPointerException exception) {
        System.out.println(exception.getMessage());
        exception.printStackTrace();
      }*/
      
    }
    System.out.println("Fin del metodo2");
  }

}