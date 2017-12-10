package Aula_10_UpcastDowncast;

import java.util.ArrayList;

public class Gerenciar {
    
    private static ArrayList<Funcionario>listaFuncionarios = new ArrayList<>();

    public static ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        Gerenciar.listaFuncionarios = listaFuncionarios;
    }
    
    public static void adicionarFuncionario(Funcionario f){
    
        listaFuncionarios.add(f);
    }
    
    public static String listarFuncionario(){
    
        String saida = "";
        
        for (Funcionario f : listaFuncionarios) {
            
            saida += f.toString()+"\n";
        }
        
        return saida;
    }
    
    public static String listarSalarios(){
    
        String saida = "";
        
        
        for (Funcionario f : listaFuncionarios) {
            
            saida += "Nome: "+f.getNome()+" - Salario: "+f.calcularSalario()+"\n";
        }
        
        return saida;
    }
    
    public static int totalFuncionarioSenior(){
    
        int quantidade = 0;
        
        for (Funcionario f : listaFuncionarios) {
            
            if (f instanceof FuncionarioSenior) {
                
                quantidade ++;
            }
        }
        
        return quantidade;
    }
    
    public static String funcionarioComMaiorBonus(){
    
        double maior = 0;
        String funcionario = "";
        
        for (Funcionario f : listaFuncionarios) {
            
            if (f instanceof FuncionarioSenior) {
                
                if (((FuncionarioSenior) f).getBonus() > maior) {
                    
                    maior = ((FuncionarioSenior) f).getBonus();
                    funcionario = f.getNome();
                }
            }
        }
        
        return "Nome: "+funcionario+" - Bonus: "+maior+"R$";
        
    }
    
    public static String  listarPorFaixaSalarial(double faixainicial, double faixafinal){
    
        String saida = "";
        for (Funcionario f : listaFuncionarios) {
            
            if (f.calcularSalario() >= faixainicial    &&     f.calcularSalario() <= faixafinal) {
                
                saida += f.getNome()+" - "+f.calcularSalario()+"R$\n";
            }
        }
        
        return saida;
    }
}
