package compras;
//package compras;

public class ItemDeCompra {
    private String nome;
    private int codigo;
    private double precoUnit;
    private int qtdComprada;

    public ItemDeCompra(String nome, int codigo, double precoUnit, int qtdComprada) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoUnit = precoUnit;
        this.qtdComprada = qtdComprada;
    }

    public double calcularTotal(ItemDeCompra i) {
        return i.getPrecoUnit()*i.qtdComprada;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }
}