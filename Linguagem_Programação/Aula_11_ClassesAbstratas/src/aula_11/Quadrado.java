package aula_11;
public class Quadrado extends FormaGeometrica{
    
    private float lado;
    
    public Quadrado() { 
    
        super();
    }
    
    public Quadrado(float lado, String nome) {
        super(nome);
        this.lado = lado;
    }
    
    @Override
    public float calcularArea() {
    return lado * lado;
    }
    
    @Override
    public String imprimir() {
    return super.imprimir() + "\nLado: " + lado;
}
}
