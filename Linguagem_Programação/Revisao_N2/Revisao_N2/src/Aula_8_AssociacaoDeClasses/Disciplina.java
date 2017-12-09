package Aula_8_AssociacaoDeClasses;

public class Disciplina {
    
    private String nome;
    private Professor professor;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Disciplina() {
        this.professor = new Professor();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    @Override
    public String toString() {
        return "Disciplina: "+nome+"\nProfessor{"+professor.toString()+"}\n"
                + "----------------------------------";
    }
    
    
    
}
