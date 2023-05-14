//import java.util.Scanner;

import exception.ContaInexistenteException;
import exception.SaldoInsuficienteException;

public class Principal {
    public static void main (String[] args) {
        //Scanner ent = new Scanner(System.in);
        Banco lm = new Banco("LM");
        Conta c1 = new Conta("Renan", 001, 1000);
        Conta c2 = new Conta("Davi", 002, 100);
        Conta c3 = new Conta("Joaozinho", 003, 0);
        
        
        lm.adicionarConta(c1);
        lm.adicionarConta(c2);
        
        try {
            c2.sacar(101);
        } catch(SaldoInsuficienteException e) {
            System.out.println(e);
        }

        try {
            c1.transferirParaConta(c2, 99);
        } catch(SaldoInsuficienteException e) {
            System.out.println(e);
        }

        try {
            lm.procurarConta(003);
        } catch(ContaInexistenteException e) {
            System.out.println(e);
        }
        
        c3.depositar(100);
        System.out.printf("Saldo atual de %s: %f", c3.getTitular(), c3.getSaldo());
    }
}
