package Exercicio_1;

public class Aluno {
    
    private String nome;
    private double notas[] = new double[4];
    private double media;

    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
    public String imprimir(){
    
        return "Nome do Aluno: "+nome+" - Média: "+media;
    }
    public double calcularMedia(){
    
        
        double somanotas = 0;
        
        
        for (int i = 0; i < notas.length; i++) {
            
            somanotas += notas[i];
        }
        
        double media = (somanotas/4);
        return media;
    }
}
