package Aula_11_ClassesAbstratas;
    
public class Quadrado extends FormaGeometrica{
    
    private int lado;

    public Quadrado() {
        super();
    }

    public Quadrado(int lado, String nome) {
        super(nome);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
    
        double area;
        area = lado*lado;
        return area;
    }
    
    public String imprimir(){
    
        return "Forma: "+super.getNome()+" - Área: "+calcularArea();
    }
}
