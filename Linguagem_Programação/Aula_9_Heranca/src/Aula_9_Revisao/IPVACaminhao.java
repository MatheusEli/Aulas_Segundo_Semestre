package Aula_9_Revisao;
public class IPVACaminhao extends IPVA{
    
    private int qEixos;

    public IPVACaminhao() {
    
        super();
    }
    
    public IPVACaminhao(int qEixos, double valorBase, int qCavalos) {
        super(valorBase, qCavalos);
        this.qEixos = qEixos;
    }
    
    public int getqEixos() {
        return qEixos;
    }

    public void setqEixos(int qEixos) {
        this.qEixos = qEixos;
    }
    
    @Override
    public double calcularIPVA(){
    
        double ipva;
        ipva = super.calcularIPVA()*qEixos;
        return ipva;
    }
    
    @Override
    public String imprimir(){
    
        return super.imprimir()+" - Quantidade de Eixos: "+qEixos;
    }
    
}
