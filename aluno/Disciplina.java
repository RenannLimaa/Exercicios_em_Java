package aluno;
import java.util.ArrayList;

public class Disciplina {
    //Toda disciplina possui um código, um nome, a quantidade máxima de alunos matriculados e a lista de alunos matriculados.
    private String nome;
    private int codigo;
    
    private int qtdMax;
    private ArrayList<Aluno> listaDeAlunos;
    
    public Disciplina(String nome, int codigo, int qtdMax) {
        this.nome = nome;
        this.codigo = codigo;
        this.qtdMax = 40;
        listaDeAlunos = new ArrayList<Aluno>();
    }

    //Matricular aluno: não permitir a matrícula se a turma já está cheia
    public boolean matricularAluno(Aluno a) {
        if(listaDeAlunos.size()<qtdMax) {
            listaDeAlunos.add(a);
            return true;
        }
        
        return false;
    }

    public void mostrarAlunos() {
        for(int i=0; i<listaDeAlunos.size(); i++) {
            System.out.printf("(%d) " +listaDeAlunos.get(i).getNome() + "\n", i);
        }
    }
    
    //atribuir notas
    public void atribuirNota(double nota1, double nota2, int matricula) {
        for(Aluno a: listaDeAlunos) {
            if(a.getMatricula() == matricula) {
                a.setNota1(nota1);
                a.setNota2(nota2);
            }
        }
        
    }
    
    /*mostra as seguintes informações: o aluno que tirou maior média, quantos alunos passaram por média (>=7) e quantos não passaram, 
    a média geral da turma*/
    public void gerarEstatisticas() {
        double media = 0;
        double mediaGeral = 0;
        int qtdDeNotas = 0;
        int i = 0;

        for(Aluno a: listaDeAlunos) {
            if(a.calcularMedia(a.getNota1(), a.getNota2()) > media) {
                media = a.calcularMedia(a.getNota1(), a.getNota2());
                i = listaDeAlunos.indexOf(a);
            }
        }

        System.out.println("Aluno com maior media: " +listaDeAlunos.get(i).getNome() + ", " + media);

        System.out.println("Lista de alunos que foram aprovados com media >= 7 e alunos que foram reprovados");
        for(Aluno a: listaDeAlunos) {
                if(a.calcularMedia(a.getNota1(), a.getNota2()) >= 7) {
                    System.out.println(a.getNome() +"- aprovado");
                }

                else {
                    System.out.println(a.getNome() +"- reprovado");
                }
            }
            
            for(Aluno a: listaDeAlunos) {
                mediaGeral += a.getNota1() + a.getNota2();
                qtdDeNotas += 2;
            }
            mediaGeral /= qtdDeNotas; 
            
            System.out.println("Media geral da turma: " + mediaGeral);
        }
        
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public int getCodigo() {
            return codigo;
        }
    
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
    }
    