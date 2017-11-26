package Aula_9_Revisao;
public class IPVA {

    private double valorBase;
    private int qCavalos;

    public IPVA() {
    }

    public IPVA(double valorBase, int qCavalos) {
        this.valorBase = valorBase;
        this.qCavalos = qCavalos;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public int getqCavalos() {
        return qCavalos;
    }

    public void setqCavalos(int qCavalos) {
        this.qCavalos = qCavalos;
    }
    
    public double calcularIPVA(){
    
        double ipva;
        ipva = (valorBase*qCavalos);
        
        return ipva;
    }
    
    public String imprimir(){
    
        return "Valor Base: "+valorBase+" - Quantidade de Cavalos: "+qCavalos+" - Valor IPVA: "+calcularIPVA();
    }
}
