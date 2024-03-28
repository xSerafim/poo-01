package Model;

public class Circulo {
  Double raio;

  public Circulo(Double raio) {
    this.raio = raio;
  }

  public Double getArea() {
    return Math.PI * Math.pow(this.raio, 2);
  }

  public Double getPerimetro() {
    return 2 * Math.PI * this.raio;
  }
}
