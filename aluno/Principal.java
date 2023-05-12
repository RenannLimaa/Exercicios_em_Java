package aluno;
public class Principal {
    public static void main (String[] args) {
        Aluno a1 = new Aluno("Renan", 1652151);
        Aluno a2 = new Aluno("Davi", 1652152);
        Disciplina poo = new Disciplina("P.O.O.", 1000, 40);

        poo.matricularAluno(a1);
        poo.matricularAluno(a2);

        poo.mostrarAlunos();
        poo.atribuirNota(7, 7, 1652151);
        poo.atribuirNota(8, 8, 1652152);

        poo.gerarEstatisticas();
        
        poo.atribuirNota(10, 10, 1652151);
        poo.gerarEstatisticas();
    }
}
