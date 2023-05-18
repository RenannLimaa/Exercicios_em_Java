package prova;

import java.util.ArrayList;

public abstract class Televisao {
    protected String id;
    protected int volume;
    int canalAtual;
    protected ArrayList<Canal> canaisCadastrados;
    protected ArrayList<Canal> canaisDisponiveis;

    public Televisao(ArrayList<Canal> canaisDisponiveis) {
        canaisDisponiveis = new ArrayList<Canal>();
        volume = 5;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public void alterarVolume(String comando) {
        if(comando.equals("aumentar")) {
            if(volume < 10)
                volume++;
            else
            System.out.println("Volume maximo atingido");
        }

        else {
            if(volume > 0) 
                volume--;
            else 
                System.out.println("Volume minimo atingido");
        }
    }

    public abstract void cadastrarCanal(Canal canal);

    public boolean verificarCanalExistente(Canal canal) {
        if(canaisCadastrados.contains(canal)) {
            return true;
        }

        return false;
    }

    public void sintonizarCanal(int numeroCanal) {
        boolean check = false;
        for(Canal canal: canaisCadastrados) {
            if(numeroCanal == canal.getNumero())
                canal.setNumero(numeroCanal);
                check = true;    
        }

        if(check == false)  
            System.out.println("Canal nao encontrado");
    }

    public void alterarCanal(String comando) {
        Canal canalAtual = new Canal();

        if(comando.equals("proximo")) {
            if(canalAtual == canaisCadastrados.get(canaisCadastrados.size() - 1))
                canalAtual = canaisCadastrados.get(0);
            else {
                int indiceCanalAtual = canaisCadastrados.indexOf(canalAtual);
                canalAtual = canaisCadastrados.get(indiceCanalAtual+1);
            }  
        }

        else {
            if(canalAtual == canaisCadastrados.get(0)) 
                canalAtual = canaisCadastrados.get(canaisCadastrados.size() - 1);
            else {
                int indiceCanalAtual = canaisCadastrados.indexOf(canalAtual);
                canalAtual = canaisCadastrados.get(indiceCanalAtual+1);
            }
        }
    }

    public void mostrarGrade() {
        for(Canal canal: canaisDisponiveis) {
            System.out.printf("Nome: %s - Numero: %d - HD: %b\n", canal.getNome(), canal.getNumero(), canal.isHD());
        }
    }
}
