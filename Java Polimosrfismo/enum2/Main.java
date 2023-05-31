package enum2;

public class Main {
  // Enum forma más fácil de declarar varias constantes
  public static final String DIA_LUNES = "Lunes";

  public static void main(String[] args) {
    for(DiaEnum dia: DiaEnum.values()) {
      System.out.println(dia);
    }
  }
}
