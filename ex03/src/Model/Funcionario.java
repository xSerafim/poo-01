package Model;

public class Funcionario {
  static final double SALARIO_MINIMO = 1412.00;
  String nome;
  double salario;
  String cargo;

  public Funcionario() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public double getSalarioLiquido(double descontos, double beneficios) {
    double salarioLiquido = salario + beneficios - descontos;
    if (salarioLiquido < SALARIO_MINIMO) {
      salarioLiquido = SALARIO_MINIMO;
    }
    return salarioLiquido;
  }
}
