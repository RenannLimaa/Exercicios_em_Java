import java.util.ArrayList;

public class Pais {
    private String nome;
    private String capital;
    private double dimensao;
    private ArrayList<Pais> fronteiras = new ArrayList<Pais>();

    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    public boolean equals(Pais outro) {
       if(nome.equals(outro.getNome()) && capital.equals(outro.getCapital())){
            return true;
       }
       else {
           return false;
       }
    }
    
    public boolean fazFronteira(Pais p) {
        if(fronteiras.contains(p))
            return true;

         return false;
    }

    public void printDadosFronteira() {
        for(Pais p: fronteiras) {
            System.out.println(p.nome +", "+ p.capital);
            //System.out.println(p.capital);
        }
    }
    public void adicionarFronteira(Pais p) {
        fronteiras.add(p);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public double getDimensao() {
        return dimensao;
    }
    
}
