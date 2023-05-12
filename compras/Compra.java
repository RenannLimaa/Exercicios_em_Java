package compras;
///package compras;
import java.util.ArrayList;

public class Compra {
    private ArrayList<ItemDeCompra> itens = new ArrayList<ItemDeCompra>();
   // double desconto;

    public void inserirItem(ItemDeCompra i) {
        if(itens.size() < 5)
            itens.add(i);
    }

    public double calcularTotalCompra() {
        double totalCompra = 0;
        for(ItemDeCompra item: itens) {
            totalCompra += item.calcularTotal(item);
        }
        return totalCompra;
    }

    public double darDesconto(double valor, double desconto) {
        double valorFinal;
        desconto /= 100;
        valorFinal = (valor*desconto);
        return valorFinal;
    }

    public double calcularTotalFinal(double desconto) {
        double total = calcularTotalCompra();
        double totalFinal = total - darDesconto(total, desconto);
        return totalFinal;
    }

    public void gerarRelatorio(int parcelas) {
        System.out.println("Itens comprados:");
        for(ItemDeCompra item: itens) {
            System.out.println(item.getNome() +", "+ item.getPrecoUnit());
        }

        System.out.println("Valor sem desconto: " +calcularTotalCompra());

        if (parcelas == 2) {
            System.out.println("Valor com desconto: " +calcularTotalFinal(5));
            System.out.println("Forma de pagamento: credito");
            System.out.println("Parcelado em  2x");
            System.out.println("Desconto: 5% " + "2 parcelas de "+calcularTotalFinal(5)/2);
        }

        else if (parcelas == 3) {
            System.out.println("Valor com desconto: " +calcularTotalFinal(5));
            System.out.println("Forma de pagamento: credito");
            System.out.println("Parcelado em  3x " + "2 parcelas de "+calcularTotalFinal(5)/3);
            System.out.println("Desconto: 5%");
        }

        else {
            System.out.println("Valor com desconto " +calcularTotalFinal(10));
            System.out.println("Forma de pagamento: a vista");
            System.out.println("Desconto: 10%");
        }


    }
}
