package calculadora;
public class Principal {
    public static void main (String[] args) {
        Calculadora calc = new Calculadora();
        calc.somar(5);
        System.out.println(calc.getValor());
        calc.subtrair(3);
        System.out.println(calc.getValor());
        // calc.subtrair(2);
        // System.out.println(calc.getValor());
        // calc.dividir(2);
        // System.out.println(calc.getValor());
    }
}
