package prova;

import java.util.ArrayList;

public class SmartTV extends Televisao {
    private int polegadas;

    public SmartTV(ArrayList<Canal> canaisDisponiveis, int polegadas) {
        super(canaisDisponiveis);
        this.polegadas = polegadas;
        canalAtual = canaisCadastrados.get(0).getNumero();

    }

    public void cadastrarCanal(Canal canal) {
        for(int i=0; i < canaisDisponiveis.size(); i++) {
            canaisCadastrados.add(canal);
        }
    }

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }
}

    
