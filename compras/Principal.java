package compras;
//package compras;
import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
      Scanner ent = new Scanner(System.in);
      Compra carrinho = new Compra();
      ItemDeCompra mouse = new ItemDeCompra("Mouse", 123, 50, 1);
      ItemDeCompra fone = new ItemDeCompra("Fone", 124, 100, 2);
      int parcelas=0;

      carrinho.inserirItem(mouse);
      carrinho.inserirItem(fone);

      System.out.println("Em quantas vezes quer parcelar? (ate 3x)");
      parcelas = ent.nextInt();

      carrinho.gerarRelatorio(parcelas);
      ent.close();
   }
}
