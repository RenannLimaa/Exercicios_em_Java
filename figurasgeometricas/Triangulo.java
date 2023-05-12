package figurasgeometricas;
public class Triangulo extends Figura {
    private double base, altura, lado1, lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return (base*altura)/2;
    }

    public double calcularPerimetro() {
        return lado1+lado2+base;
    }
}
