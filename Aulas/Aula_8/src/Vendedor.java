public class Vendedor {
  private float venda, salario;
  private String nome;
  private int falta;
  
  // Metodo constructor
  
  public Vendedor() {}
  
  
  // Metodos de acesso


  public Vendedor(float v, float s, String n, int f){
    venda = v;
    salario = s;
    nome = n;
    falta  = f;
  }

  public float getVenda() {
    return venda;
  }
  public void setVenda(float venda) {
    this.venda = venda;
  }
  public float getSalario() {
    return salario;
  }
  public void setSalario(float salario) {
    this.salario = salario;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getFalta() {
    return falta;
  }
  public void setFalta(int falta) {
    this.falta = falta;
  }

  
  float calcularComissao() {
    float comissao =0;
    if(venda>= 1000 && venda < 2000){
      comissao = venda * 0.10f;

    }
    if(venda>=2000){
      comissao = venda * 0.15f;
    }
    return comissao;
  }

  float descontoFalta() {
    float desconto;
    desconto = (salario/30) * falta;
    return desconto;
  }

  void calcularSalario() {
    float comissao = calcularComissao();
    float desconto = descontoFalta();
    float s;
    s = salario + comissao - desconto;
    salario = s;
  }

  void imprimirDados(){
    String layout = " O fincionario: "+ nome+ "\n" + 
                    "Tem o salario: " + salario +"\n" + 
                    "A venda: " + venda + "\n" +
                    "A quantidade de faltas: " + falta;
    System.out.println(layout);
  }

}
