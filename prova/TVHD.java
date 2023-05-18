package prova;

import java.util.ArrayList;

public class TVHD extends Televisao {
    private String modelo;

    public TVHD(ArrayList<Canal> canaisDisponiveis, String modelo) {
        super(canaisDisponiveis);
        this.modelo = modelo;
        canalAtual = canaisCadastrados.get(canaisCadastrados.size() -1).getNumero();
    }

    public void cadastrarCanal(Canal canal) {
        for(int i=0; i<canaisDisponiveis.size(); i++) {
            if(canal.isHD() == true) 
                canaisCadastrados.add(canal);
        }
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
