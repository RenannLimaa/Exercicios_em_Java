//import java.util.Scanner;
public class Principal {
    public static void main (String[] args) {
        //Scanner ent = new Scanner(System.in);
        Banco lm = new Banco("LM");
        Conta c1 = new Conta("Renan", 001, 1000);
        Conta c2 = new Conta("Davi", 002, 100);
        
        boolean check;
        check = lm.adicionarConta(c1);
        if(check) {
            System.out.println("Conta adicionada!");
        }
        else  {     
            System.out.println("Conta nao adicionada!");
        }

        check = c2.sacar(99);
        if(check) {
            System.out.println("Saque realizado!\nSaldo atual: " +c2.getSaldo());
        }
        else {
            System.out.println("Saque nao realizado!");
        }

        check = c1.sacar(1001);
        if(check) {
            System.out.println("Saque realizado!\nSaldo atual: " +c2.getSaldo());
        }
        else {
            System.out.println("Saque nao realizado!");
        }

        check = c1.transferirParaConta(c2, 99);
        if(check) {
            System.out.println("Trasnferencia realizada!\nSaldo atual de: "+c2.getTitular() +c2.getSaldo());
        }
        else {
            System.out.println("Transferencia nao realizada!");
        }
       
    }
}
