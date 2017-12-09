package Aula_8_AssociacaoDeClasses;

public class Professor {
    
    private String nome;
    private int cargahoraria;
    private String titulação;

    public Professor() {
    }

    public Professor(String nome, int cargahoraria, String titulação) {
        this.nome = nome;
        this.cargahoraria = cargahoraria;
        this.titulação = titulação;
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

    public String getTitulação() {
        return titulação;
    }

    public void setTitulação(String titulação) {
        this.titulação = titulação;
    }
    
    @Override
    public String toString(){
    
        return "Nome: "+nome+" - Titulação: "+titulação+" - Carga Horária: "+cargahoraria;
    }
}
