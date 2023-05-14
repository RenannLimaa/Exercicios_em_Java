import exception.SaldoInsuficienteException;

public class Conta {
    private String titular;
    private int numero;
    private double saldo;

    
    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public boolean sacar(double valor) throws SaldoInsuficienteException{
        if(valor > saldo) 
            throw new SaldoInsuficienteException();
        else {
            saldo -= valor;
            return true;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean transferirParaConta(Conta c, double valor) throws SaldoInsuficienteException{
        if(sacar(valor)) {
            c.depositar(valor);
            return true;
        }

        else    
            throw new SaldoInsuficienteException();
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
