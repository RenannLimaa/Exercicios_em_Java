package prova;

import java.util.ArrayList;

public class ControleRemoto {
    private ArrayList<Televisao> listaDeTVS = new ArrayList<Televisao>();

    public boolean adicionarTV(Televisao televisao) {
        if(listaDeTVS.contains(televisao))
            return false;
        else {
            listaDeTVS.add(televisao);
            return true;
        }
    }
}
