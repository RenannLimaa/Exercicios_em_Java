
import java.util.ArrayList;

public class Banco {
    private String nome;
    public String getNome() {
        return nome;
    }

    
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public boolean adicionarConta(Conta c) {
        if(contas.contains(c))
            return false;
        
        else    
            contas.add(c);
            return true;
    }

    public Conta procurarConta(int numeroDaConta) {
        for(Conta c: contas) {
            if(numeroDaConta == c.getNumero()) {
                return c;
            }
        }
        return null;
    }

    public void mostrarDados() {
        for(int i=0; i<contas.size(); i++) {
            System.out.println("("+ i + "). " + contas.get(i).getTitular());
        }
        // for(Conta c: contas) {
            //     int i = 0;
            //     System.out.println(i +" "+ c.getTitular());
            //     i++;
            // }
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
    }
