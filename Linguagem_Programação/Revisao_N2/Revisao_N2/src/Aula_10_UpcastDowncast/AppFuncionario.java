package Aula_10_UpcastDowncast;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class AppFuncionario {

    public static void main(String[] args) {
        
        boolean controle = false;
        Funcionario f;
        
        do{
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastrar Funcionario\n2 - Listar\n"
                + "3 - Listar Salarios\n4 - Total de Funcionários Sênior\n5 -   Funcionario com maior Bônus"
                + "\n6 - Listar por Faixa Salarial\n7 - Sair"));
        
        switch(opcao){
        
            case 1:
                
                String nomeFunc = JOptionPane.showInputDialog(null, "Digite o nome do Funcionario: ");
                
                int horastrabalhadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as horas trabalhadas do Funcionario: "));
                
                double valorhora = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor recebido por hora do Funcionario: "));
                
                
                String escolha = JOptionPane.showInputDialog(null,"É um funcionario sênior?");
                
                if (escolha.equalsIgnoreCase("sim")   ||   escolha.equalsIgnoreCase("s")) {
                    
                    double bonus = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do Bonus:"));
                    f = new FuncionarioSenior(nomeFunc, horastrabalhadas, valorhora, bonus);
                    Gerenciar.adicionarFuncionario(f);
                }else{
                    if (escolha.equalsIgnoreCase("não")   ||   escolha.equalsIgnoreCase("n")   ||   escolha.equalsIgnoreCase("nao")) {
                        
                        f = new Funcionario(nomeFunc, horastrabalhadas, valorhora);
                        Gerenciar.adicionarFuncionario(f);
                    }else{
                    
                        JOptionPane.showMessageDialog(null,"Cadastro","ENTRADA INVALIDA",WARNING_MESSAGE);
                    }
                }
                break;
                
                
            case 2:
                JOptionPane.showMessageDialog(null,"======LISTA FUNCIONARIOS======\n"+Gerenciar.listarFuncionario());
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null,"======LISTA SALARIOS======\n"+Gerenciar.listarSalarios());
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null,"Total de Funcionários Sênior: "+Gerenciar.totalFuncionarioSenior());
                break;
                
            case 5:
                JOptionPane.showMessageDialog(null,"Funcionario com maior bônus: "+Gerenciar.funcionarioComMaiorBonus());
                break;
                
            case 6:
                double faixainicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a faixa salarial inicial: "));
                double faixafinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a faixa salarial final: "));
                
                JOptionPane.showMessageDialog(null,"Funcionarios entre esta faixa: \n"+Gerenciar.listarPorFaixaSalarial(faixainicial, faixafinal));
                break;
                
            case 7:
                controle = true;
                break;
                
        }
        }while(controle == false);
    }
    
}
