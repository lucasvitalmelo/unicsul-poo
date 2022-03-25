import java.util.ArrayList;

public class Sorvete {
  private int id;
  private String nome;
  private String descricaoIngr;
  private String dataFab;
  private String dataVal;
  private int quantidade;
  private String tipo;
  private ArrayList<String>alergicos;
  
  public Sorvete() {
  }

  public void imprimir() {
    System.out.println("\n\nId: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("Ingredientes: " + descricaoIngr);
    System.out.println("Data de fabricação: " + dataFab);
    System.out.println("Data de validade: " + dataVal);
    System.out.println("Quantidade:" + quantidade);
    System.out.println("Tipo: " + tipo);
  }

  public void  atualizarQuantidade(String tipo, int quantidade){
    if(tipo.equals("bola")){
      this.quantidade -= quantidade * 50;
    } else if(tipo.equals("palito") || tipo.equals("pote")) {
      this.quantidade -= quantidade;
    }
  }

  public boolean vencimento(String dataVal){
    if(dataVal.equals(this.dataVal)){
      return true;
    } else {
      return false;
    }
  }

  public void listaAlergicos () {
    System.out.println("Alergicos: ");
    for(String alergico : alergicos){
      System.out.println(alergico);
    }
  }
  
  public Sorvete(int id, String nome, String descricaoIngr, String dataFab, String dataVal, int quantidade, String tipo,
      ArrayList<String> alergicos) {
    this.id = id;
    this.nome = nome;
    this.descricaoIngr = descricaoIngr;
    this.dataFab = dataFab;
    this.dataVal = dataVal;
    this.quantidade = quantidade;
    this.tipo = tipo;
    this.alergicos = alergicos;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricaoIngr() {
    return descricaoIngr;
  }

  public void setDescricaoIngr(String descricaoIngr) {
    this.descricaoIngr = descricaoIngr;
  }

  public String getDataFab() {
    return dataFab;
  }

  public void setDataFab(String dataFab) {
    this.dataFab = dataFab;
  }

  public String getDataVal() {
    return dataVal;
  }

  public void setDataVal(String dataVal) {
    this.dataVal = dataVal;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public ArrayList<String> getAlergicos() {
    return alergicos;
  }

  public void setAlergicos(ArrayList<String> alergicos) {
    this.alergicos = alergicos;
  }
}