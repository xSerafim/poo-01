package View;

import javax.swing.JOptionPane;

import Model.Funcionario;

public class Main {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();

    funcionario.setNome(JOptionPane.showInputDialog("Qual o nome do funcionário: "));
    funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salário do funcionário: ")));
    funcionario.setCargo(JOptionPane.showInputDialog("Qual o cargo do funcionário: "));

    double descontos = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor dos descontos: "));
    double beneficios = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor dos benefícios: "));
    double salarioLiquido = funcionario.getSalarioLiquido(descontos, beneficios);
    JOptionPane.showMessageDialog(null,
        "O salário líquido do(a) funcionário(a) " + funcionario.getNome() + " é de R$ " + salarioLiquido);
  }
}
