package Exercicio_2;

import java.util.ArrayList;

public class GerenciarContasEnergia {
    
    private static ArrayList<ContaEnergia>listaContasEnergia = new ArrayList<>();

    public static ArrayList<ContaEnergia> getListaContasEnergia() {
        return listaContasEnergia;
    }

    public static void setListaContasEnergia(ArrayList<ContaEnergia> listaContasEnergia) {
        GerenciarContasEnergia.listaContasEnergia = listaContasEnergia;
    }
    
    public static void adicionarContaEnergia(ContaEnergia conta){
    
        listaContasEnergia.add(conta);
    }
    
    public static ContaEnergia buscarConta(String numeroConta){
    
        for(ContaEnergia contas:listaContasEnergia){
        
            if (contas.getNumeroConta().equalsIgnoreCase(numeroConta)) {
                
                return contas;
            }
        }
        return null;
    }
    
    public static String listarTodas(){
    
        String saida = "";
        
        if (listaContasEnergia.isEmpty()) 
            return "Não a Contas Cadastradas!";
        else
            for(ContaEnergia contas:listaContasEnergia){
            saida += contas.imprimir()+"\r\n";
        }
        
        return saida;
    }
}
