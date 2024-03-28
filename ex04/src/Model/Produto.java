package Model;

public class Produto {
  String nome;
  float preco;
  int qtdEstoque;

  public Produto() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public int getQtdEstoque() {
    return qtdEstoque;
  }

  public void setQtdEstoque(int qtdEstoque) {
    this.qtdEstoque = qtdEstoque;
  }

  public boolean verificaProdutoDisponivel(String nome) {
    return this.nome.equals(nome);
  }

  public float totalValorEstoque() {
    return preco * qtdEstoque;
  }
}
