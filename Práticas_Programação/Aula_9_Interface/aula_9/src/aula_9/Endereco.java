package aula_9;
public class Endereco{
    
    private String rua;
    private int numerorua;
    private String complemento;

    public Endereco(String rua, int numerorua, String complemento) {
        this.rua = rua;
        this.numerorua = numerorua;
        this.complemento = complemento;
    }

    public Endereco() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumerorua() {
        return numerorua;
    }

    public void setNumerorua(int numerorua) {
        this.numerorua = numerorua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + " Número: " + numerorua + " Complemento: " + complemento;
    }
    
    
    
}