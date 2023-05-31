public class Libro {
  private String titulo;
  private String autor;
  private int isbn;
  
  public Libro(String titulo, String autor, int isbn) {
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
  }


  public void setAutor(String autor) {
    this.autor = autor;
  }
  public void setIsbn(int isbn) {
    this.isbn = isbn;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getAutor() {
    return autor;
  }
  public int getIsbn() {
    return isbn;
  }
  public String getTitulo() {
    return titulo;
  }

  @Override
  public String toString() {
    return "Libro [isbn=" + isbn + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Libro) {
      Libro other = (Libro) obj;

      if(this.isbn == other.isbn) {
        return true;
      }
      else {
        return false;
      }
    }
    else {
      return false;
    }


  }
}
