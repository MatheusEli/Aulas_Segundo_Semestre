package aula_11;
public abstract class FormaGeometrica {
    
    private String nome;
    

    public FormaGeometrica() {
    
        
    }

    public FormaGeometrica(String nome) {
    
        this.nome = nome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract float calcularArea() ;
    
    public String imprimir(){

        return "--------\nForma: " + nome;
}
}