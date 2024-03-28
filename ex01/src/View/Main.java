package View;

import javax.swing.JOptionPane;

import Model.Circulo;

public class Main {
  public static void main(String[] args) {
    double r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo: "));
    Circulo c = new Circulo(r);
    JOptionPane.showMessageDialog(null, "Área: " + c.getArea() + "\nPerímetro: " + c.getPerimetro());
  }
}
