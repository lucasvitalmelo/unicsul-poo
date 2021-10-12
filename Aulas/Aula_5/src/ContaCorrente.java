import javax.swing.*;
public class ContaCorrente {
  String name;
  float saldo, limite;
  char tipo;

  public ContaCorrente() {
  }

  public ContaCorrente(String name, float saldo, float limite, char tipo) {
    this.name = name;
    this.saldo = saldo;
    this.limite = limite;
    this.tipo = tipo;

  }

  public ContaCorrente(String name, float saldo, char tipo) {
    this.name = name;
    this.saldo = saldo;
    this.tipo = tipo;
  }

  public void cadastraDados (){
    // Falta revisão dos parametros
  }
  public String imprimiDados (){
    String tudo;
    tudo = "\t\t\t**Bem Vindo ao banco**\nCorrentista:"+name+"\nSeu Saldo é: "+saldo+"\nSeu limite é: "+limite+"";
    return(tudo);
  }
  public void depositar (float valor){
    saldo = saldo + valor;
  }
  public void sacar(float valor){
    if (saldo >= valor)
        saldo = saldo - valor;
    else
      JOptionPane.showMessageDialog(null,"Não foi poossivel realizar o saque!\nSaldo Insuficiente");
  }
  public float maiorSaldo(ContaCorrente c) {
    float retorno;
    if(c.saldo >= 0)
      retorno = c.saldo;
    else  
      retorno=0;
    return(retorno);
  }

  
}