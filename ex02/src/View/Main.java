package View;

import javax.swing.JOptionPane;

import Model.ContaBancaria;

public class Main {
  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();
    conta.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
    conta.setNome(JOptionPane.showInputDialog("Digite o nome do titular da conta: "));

    while (true) {
      int option = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
          JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Saque", "Depósito", "Sair" }, null);
      if (option == 2) {
        break;
      }
      efetuarTransacao(conta, option);
    }
  }

  static void efetuarTransacao(ContaBancaria conta, int option) {
    if (option == 0) {
      conta.realizarSaque(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: ")));
      JOptionPane.showMessageDialog(null, "Saldo atual: " + conta.getSaldo());
    } else if (option == 1) {
      conta.realizarDeposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: ")));
      JOptionPane.showMessageDialog(null, "Saldo atual: " + conta.getSaldo());
    }
  }
}
