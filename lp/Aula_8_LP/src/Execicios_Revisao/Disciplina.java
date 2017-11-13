
package Execicios_Revisao;
public class Disciplina {
    
    private String nome;
    private int cargahoraria;
    private Professor professor;

    public Disciplina() {
    
        this.professor = new Professor();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String imprimir(){
    
        return "*DADOS DISCIPLINA*\nNome: "+nome+" - Carga Horária: "+cargahoraria+" - "+professor.imprimir();
    }
}
