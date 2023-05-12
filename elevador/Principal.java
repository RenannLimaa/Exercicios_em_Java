package elevador;
public class Principal {
    public static void main(String[] args) {
        Elevador elev = new Elevador(7, 40);

        System.out.println("Pessoas Presentes: " + elev.getPessoasPresentes());
        elev.entrar(5);
        System.out.println("Pessoas Presentes: " + elev.getPessoasPresentes());
        //System.out.println("Andar Atual: " + elev.getAndarAtual());

        elev.setAndarAtual(39);
        System.out.println("Andar Atual: " + elev.getAndarAtual());
        elev.subir();
        System.out.println("Andar Atual: " + elev.getAndarAtual());

        elev.descerPara(25);
        System.out.println("Andar Atual: " + elev.getAndarAtual());

        elev.subirPara(37);
        System.out.println("Andar Atual: " + elev.getAndarAtual());
    }
}
