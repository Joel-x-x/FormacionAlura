import java.io.*;

public class ManejoArchivos {
  public static void main(String[] args) {
    try {
      BufferedReader lector = new BufferedReader(new FileReader("archivos.txt"));
      String linea;
      while ((linea = lector.readLine()) != null) {
        System.out.println(linea);
      }
      lector.close();
    } catch (IOException e) {
      System.out.println("Error al leer el archivo: " + e.getMessage());
    }
  }
}

