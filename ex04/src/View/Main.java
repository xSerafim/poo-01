package View;

import javax.swing.JOptionPane;

import Model.Produto;

public class Main {
  public static void main(String[] args) {
    Produto p = new Produto();
    String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
    p.setNome(nome);

    float preco;
    do {
      preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto: "));
      if (preco <= 0) {
        JOptionPane.showMessageDialog(null, "Preço inválido. Digite um valor maior que 0.");
      }
    } while (preco <= 0);
    p.setPreco(preco);

    int qtdEstoque;
    do {
      qtdEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em estoque: "));
      if (qtdEstoque < 0) {
        JOptionPane.showMessageDialog(null, "Quantidade inválida. Digite um valor maior ou igual a 0.");
      }
    } while (qtdEstoque < 0);
    p.setQtdEstoque(qtdEstoque);

    int option;
    do {
      option = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
          new String[] { "Verificar disponibilidade", "Sair" }, null);
      switch (option) {
        case 0:
          String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
          if (p.verificaProdutoDisponivel(nomeProduto)) {
            JOptionPane.showMessageDialog(null, "Produto disponível.");
            JOptionPane.showMessageDialog(null, "Total em estoque: R$" + p.totalValorEstoque());
          } else {
            JOptionPane.showMessageDialog(null, "Produto indisponível.");
          }
          break;
        case 1:
          JOptionPane.showMessageDialog(null, "Saindo...");
          break;
      }
    } while (option != 1);
  }
}
