package Aula_9_Revisao;
public class AppIPVA {
    public static void main(String[] args) {
       
        IPVA ipva = new IPVA(4,116);
        IPVACaminhao ipvac = new IPVACaminhao(4,4,116);
        
        System.out.println(ipva.imprimir());
        System.out.println(ipvac.imprimir());
    }
    
}
