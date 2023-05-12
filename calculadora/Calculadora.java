package calculadora;

public class Calculadora {
    private double valor = 0;

    public double somar(double num) {
        return valor += num;
    }

    public double subtrair(double num) {
        return valor -= num;
    }

    public double multiplicar(double num) {
        return valor *= num;
    }

    public double dividir(double num) {
        return valor /= num; 
    }

    public double getValor() {
        return valor;
    }
}
