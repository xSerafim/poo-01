package View;

import javax.swing.JOptionPane;

import Model.Pessoa;

public class View {
  private static final int IDADE_MAXIMA = 150;

  static public void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    pessoa.setNome(JOptionPane.showInputDialog("Digite o nome: "));
    pessoa.setProfissao(JOptionPane.showInputDialog("Digite a profissão: "));

    int dia, mes, ano, idade;

    do {
      dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento: "));
      mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento: "));
      ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
      idade = pessoa.getIdade(dia, mes, ano);
      if (idade > IDADE_MAXIMA) {
        JOptionPane.showMessageDialog(null, "Idade inválida. Digite novamente.");
      }

      if (idade < 0) {
        JOptionPane.showMessageDialog(null, "Data inválida. Digite novamente.");
      }
    } while (idade < 0 || idade > IDADE_MAXIMA);

    pessoa.setDataNascimento(dia, mes, ano);

    JOptionPane.showMessageDialog(null,
        "Nome: " + pessoa.getNome() + "\nProfissão: " + pessoa.getProfissao() + "\nIdade: " + pessoa.getIdade());
  }
}
