public class Triangulo {
  float base, altura;

  public Triangulo() {
  }

  public Triangulo(float b, float a) {
    this.base = b;
    this.altura = a;
  }

  
  float calculaArea(){
    float area = (base * altura) /2;
  
    return area;
  }
  
  String imprimeDados() {
    String mensagem = "";
    mensagem += "A base é: " + base;
    mensagem += "\nA altura é: " + altura;

    return mensagem;
  }

}
