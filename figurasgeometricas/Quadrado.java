package figurasgeometricas;
public class Quadrado extends Figura {
    private int tamanhoLados;

    public Quadrado(int tamanhoLados) {
        this.tamanhoLados = tamanhoLados;
    }

    public double calcularArea() {
        return tamanhoLados*tamanhoLados;
    }

    public double calcularPerimetro() {
        return 4*tamanhoLados;
    }
}
