
public class IPVA {
    
    private String nomeMotorista;
    private double aliquota;
    private double precoveiculo;

    public IPVA() {
    }

    public IPVA(String nomeMotorista, double aliquota, double precoveiculo) {
        this.nomeMotorista = nomeMotorista;
        this.aliquota = aliquota;
        this.precoveiculo = precoveiculo;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getPrecoveiculo() {
        return precoveiculo;
    }

    public void setPrecoveiculo(double precoveiculo) {
        this.precoveiculo = precoveiculo;
    }
    
    public double calcularIPVA(){
    
        double ipva;
        ipva = ((precoveiculo*aliquota)/100);
        
        return ipva;
    }
    
    public String imprimir(){
    
        return "Nome: "+nomeMotorista+"\nAlíquota: "+aliquota+"%\nPreço Veículo: "+precoveiculo+"\nIPVA TOTAL: "+calcularIPVA();
    }
}
