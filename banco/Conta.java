

public class Conta {
    private String titular;
    private int numero;
    private double saldo;

    
    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public boolean sacar(double valor) {
        if(valor > saldo) 
            return false;
        else {
            saldo -= valor;
            return true;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean transferirParaConta(Conta c, double valor) {
        if(sacar(valor)) {
            c.depositar(valor);
            return true;
        }

        else    
            return false;
    }

    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    } 
}
