package Model;

public class ContaBancaria {
  int numeroConta;
  String nome;
  double saldo;

  public ContaBancaria() {
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void realizarDeposito(double valor) {
    saldo += valor;
  }

  public void realizarSaque(double valor) {
    saldo -= valor;
  }
}
