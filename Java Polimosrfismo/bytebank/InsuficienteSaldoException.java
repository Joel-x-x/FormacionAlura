package bytebank;

public class InsuficienteSaldoException extends Exception {
  public InsuficienteSaldoException(String message) {
    super(message); 
  }
}
