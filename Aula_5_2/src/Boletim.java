public class Boletim {
  Double n1, n2, media;

  public Boletim(Double n1, Double n2) {
    this.n1 = n1;
    this.n2 = n2;
  }

  public void imprimiBoletim(){}
  public void calculaMedia(){
    media = (n1+n2)/2;
  }
  public String verificaConceito() {
    String conceito="";
    if (media >= 8 && media < 10){
      conceito = "A";
    }
    if (media >= 6 && media < 8){
      conceito = "B";
    }
    if (media >= 4 && media < 6){
      conceito = "C";
    }
    if (media < 4){
      conceito = "D";
    } 
    return(conceito);
  }
}