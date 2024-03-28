package Model;

import java.time.LocalDate;

public class Pessoa {
  String nome;
  LocalDate dataNascimento;
  String profissao;

  public Pessoa() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(int dia, int mes, int ano) {
    this.dataNascimento = LocalDate.of(ano, mes, dia);
  }

  public String getProfissao() {
    return profissao;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  public int getIdade() {
    LocalDate hoje = LocalDate.now();
    int years = hoje.getYear() - dataNascimento.getYear();
    if (hoje.getMonthValue() < dataNascimento.getMonthValue() ||
        (hoje.getMonthValue() == dataNascimento.getMonthValue() &&
            hoje.getDayOfMonth() < dataNascimento.getDayOfMonth())) {
      years--;
    }

    return years;
  }

  public int getIdade(int dia, int mes, int ano) {
    LocalDate hoje = LocalDate.now();
    int years = hoje.getYear() - ano;
    if (hoje.getMonthValue() < mes ||
        (hoje.getMonthValue() == mes &&
            hoje.getDayOfMonth() < dia)) {
      years--;
    }

    return years;
  }
}
