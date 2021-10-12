public class Produto {
  String marca;
  String fabricante;
  String cod_barras;
  float preco;
 
 
  public Produto() {
  }

  public Produto(String m, String f, String c, float p) {
    this.marca = m;
    this.fabricante = f;
    this.cod_barras = c;
    this.preco = p;
  }  
}