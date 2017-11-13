
public class IPVACaminhao extends IPVA{
    
    private int qEixos;

    public IPVACaminhao() {
    
        super();
    }

    public IPVACaminhao(int qEixos) {
        this.qEixos = qEixos;
    }

    public IPVACaminhao(int qEixos, String nomeMotorista, double aliquota, double precoveiculo) {
        super(nomeMotorista, aliquota, precoveiculo);
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
    
        return super.imprimir()+"\nQuantidade de Eixos: "+qEixos;
    }
}
