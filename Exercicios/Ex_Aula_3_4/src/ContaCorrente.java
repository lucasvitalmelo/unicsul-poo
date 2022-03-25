public class ContaCorrente {
  String nome;
  float saldo;
  float limite;
  char tipo;
  
  public ContaCorrente(String n, float s, float l, char t) {
    this.nome = n;
    this.saldo = s;
    this.limite = l;
    this.tipo = t;
  }
  
  public ContaCorrente(String n, float s, char t) {
    this.nome = n;
    this.saldo = s;
    this.tipo = t;
  }
  
  public ContaCorrente() {
  }
  
  String imprimeDados() {
    String dados = "";

    String tipoDeConta = "";
    
    if(tipo == 'C' || tipo == 'c'){
      tipoDeConta = "Conta Corrente";
    }
    else if(tipo == 'P' || tipo == 'p'){
      tipoDeConta ="Conta Poupaça";
    }
    
    dados = "\nNome: " + nome + "\nSaldo: R$" + saldo + "\nLimite: R$" + limite + "\nTipo de conta: " + tipoDeConta;    
    return dados;
  }
  
  void cadastraDados() {

  }

  void depositar(float valor) {

    saldo = saldo + valor;

  }

  void sacar(float valor) {
    if (saldo < valor){

      System.out.println("\n***********************");
      System.out.println("* Saldo insuficiente! *");
      System.out.println("***********************");

    } else {
      saldo = saldo - valor;
    }
  }

  
}


