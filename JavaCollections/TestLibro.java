public class TestLibro {
  public static void main(String[] args) {
    Libro libro1 = new Libro("Pildoras", "Juanito", 25);
    Libro libro2 = new Libro("Pildoras", "Juanito", 25);

    if(libro1.equals(libro2)) 
      System.out.println("Iguales");
    else
      System.out.println("No son iguales");
  }
}
