package elevador;
public class Elevador {
    /*A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio, excluindo o térreo, 
    capacidade do elevador, e quantas pessoas estão presentes nele.*/
    private int andarAtual = 0;
    private int totalDeAndares;
    private int capacidadeDoElevador;
    private int  pessoasPresentes = 0;

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    /*construtor: que deve receber como parâmetros a capacidade do elevador e o 
    total de andares no prédio (os elevadores sempre começam no térreo e vazio);*/
    public Elevador(int capacidadeDoElevador, int totalDeAndares) {
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.totalDeAndares = totalDeAndares;
    }

    //entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    public boolean entrar(int pessoasParaEntrar) {
        if(pessoasPresentes == capacidadeDoElevador) {
            return false;
        }

        else {
            pessoasPresentes += pessoasParaEntrar;
            return true;
        }
        
    }
    //sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    public boolean sair(int pessoasParaSair) {
        if(pessoasPresentes == 0) 
            return false;
        

        else {
            pessoasPresentes -= pessoasParaSair;
            return true;
        }
    }

    //sobe: para subir um andar (não deve subir se já estiver no último andar);
    public boolean subir() {
        if(andarAtual == totalDeAndares) 
            return false;
        else {
            andarAtual++;
            return true;
        }
    }
    //desce: para descer um andar (não deve descer se já estiver no térreo);
    public boolean descer() {
        if(andarAtual == 0) 
            return false;
        else {
            andarAtual--;
            return true;
        }
    }

    //sobe (andar): para subir até o andar passado por parâmetro (não deve subir se já estiver no último andar);
    public boolean subirPara(int andarDesejado) {
        if(andarAtual == totalDeAndares)
            return false;
        else {
            int andaresParasubir = andarDesejado - andarAtual;
            andarAtual += andaresParasubir;
            return true;
        }
    }

    //desce (andar): para descer até o andar especificado no parâmetro (não deve descer se já estiver no térreo);
    public boolean descerPara(int andarDesejado) {
        if(andarAtual == 0) 
            return false;
        else {
            int andaresParaDescer = andarAtual - andarDesejado;
            andarAtual -= andaresParaDescer;
            return true;
        }
    }

    public boolean podeEntrar() {
        if(pessoasPresentes == capacidadeDoElevador) {
            return false;
        }

        else 
            return true;
        
    }
    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setCapacidadeDoElevador(int capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public int getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
}

