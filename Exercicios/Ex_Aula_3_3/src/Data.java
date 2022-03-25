public class Data {

  int dia;
  int mes;
  int ano;

  public Data() {
  }

  public Data(int d, int m, int a) {
    this.dia = d;
    this.mes = m;
    this.ano = a;
  }

  void cadastraDados() {
    
  }
  
  void imprimeData() {
    System.out.println();
    System.out.println("----------------");
    System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    System.out.println("----------------");

  }

  

}

