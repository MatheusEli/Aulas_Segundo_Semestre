package aula_11;
public class Circulo extends FormaGeometrica{
    
    private float raio;
    
    public Circulo () { //default
        super();
    }
    
    public Circulo(float raio, String nome) {
        super(nome);
        this.raio = raio;
    }
    
    @Override
    public float calcularArea() {
        return (float) Math.PI * raio * raio;
    }
    
    @Override
    public String imprimir() {
        return super.imprimir() + " - Raio: " + raio;
    }
}
