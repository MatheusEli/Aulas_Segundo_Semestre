package Aula_11_ClassesAbstratas;

public class Circulo extends FormaGeometrica{
    
    private double raio;

    public Circulo() {
        super();
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio, String nome) {
        super(nome);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
    
        double area;
        
        area  =  Math.PI * raio * raio;
        
        return area;
    }
    
    @Override
    public String imprimir(){
    
        return "Forma: "+super.getNome()+" - Área: "+calcularArea();
    }
}
