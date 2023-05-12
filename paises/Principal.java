public class Principal {
    public static void main(String[] args) {
        
        Pais brasil = new Pais("Brasil", "Brasilia", 123);
        Pais argentina = new Pais("Argentina", "Buenos aires", 456);
        Pais uruguai = new Pais("Uruguai", "Montevideo", 777);
        Pais equador = new Pais("Equador", "Quito", 444);
        
        brasil.adicionarFronteira(uruguai);
        brasil.adicionarFronteira(argentina);
        argentina.adicionarFronteira(brasil);

        brasil.printDadosFronteira();
        if(brasil.equals(brasil)) {
            System.out.println("Paises iguais");
        }
        else {
            System.out.println("Paises diferentes");
        }

        if(brasil.fazFronteira(equador))
            System.out.println("Paises fazem fronteira");

        else
            System.out.println("Paises nao fazem fronteira");


    }
}
