package aluno;
public class Aluno {
    // Todo aluno contém um nome e uma matrícula. Além disso, ele possui a nota das 2 provas que ele faz durante o semestre.
    private String nome;
    private int matricula;
    private double nota1, nota2;
    
    //Crie um construtor que inicialize esses valores.
    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    //Calcule média 
    public double calcularMedia(double nota1, double nota2) {
        double media;
        media = (nota1 + nota2)/2;
        return media;
    }
    //Crie getters and setters para todos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota1(){
        return nota1;
    }
    
    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
 }