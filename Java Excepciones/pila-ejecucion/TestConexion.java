public class TestConexion {
  public static void main(String[] args) {
    try {
      try(Conexion conexion = new Conexion()) {
        conexion.leerDatos();
      } 
      catch (Exception e) {
        //e.printStackTrace();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    /* Conexion conexion = null;

    try {
      conexion = new Conexion();
      conexion.leerDatos();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(conexion != null) {
        conexion.cerrar();
      }
    } */

  }
}
