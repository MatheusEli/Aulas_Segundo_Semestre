package atividade1;

public class FacebookPost {
    
    private String nome;
    private String texto;
    private int curtidas = 0;
    
    public FacebookPost(String nome, String texto){ 
        this.nome = nome;
        this.texto = texto;
    }
    
    public void setFacebookText(String texto){
        this.texto = texto;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getTexto(){
        return this.texto;
    }
    
    public int getCurtidas(){
        return this.curtidas;
    }
    
    public void addCurtida()
    {
        this.curtidas++;
    }
}
