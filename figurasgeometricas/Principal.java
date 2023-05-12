package figurasgeometricas;
import java.util.ArrayList;

public class Principal {
    public static void main (String[] args) {
        Figura f1 = new Quadrado(4);
        Figura f2 = new Triangulo(5, 10, 5, 5);
        ArrayList<Figura> figuras = new ArrayList<Figura>();

        figuras.add(f1);
        figuras.add(f2);

        for(Figura f: figuras) {
            if(f instanceof Quadrado) {
                Figura q = (Quadrado) f;
                System.out.println("Figura: quadrado");
                System.out.println("Area do quadrado: " +q.calcularArea());
                System.out.println("Perimetro do quadrado: " +q.calcularPerimetro());
            }

            else {
                Figura t = (Triangulo) f;
                System.out.println("Figura: triangulo");
                System.out.println("Area do triangulo: " +t.calcularArea());
                System.out.println("Perimetro do triangulo: " + t.calcularPerimetro());
            }
        }
    }
}
