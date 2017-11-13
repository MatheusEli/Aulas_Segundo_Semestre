package Aula_9_Revisao;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class AppFuncionario {
    public static void main(String[] args) {
        
        Funcionario fun;
        FuncionariosSenior funcS;
        
        boolean controle = false;
        do{
        
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastrar Funcionario\n2 - Listar\n3 - Listar Salários\n"
                    + "4 - Total de Funcionarios Sênior\n5- Funcionário com maior Bônus\n6 - Listar por Faixa Salarial"
                    + "\n7 - Sair", "ENTRADA",QUESTION_MESSAGE));
            
            switch(opcao){
            
                case 1:
                    fun = new Funcionario();
                    
                    String nome = JOptionPane.showInputDialog(null,"Digite o nome do Funcionario: ","CADASTRAR",INFORMATION_MESSAGE);
                    fun.setNome(nome);
                    double horasTrab = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite as Horas Trabalhadas: ","CADASTRAR",INFORMATION_MESSAGE));
                    fun.setHorasTrab(horasTrab);
                    double valorHoras = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor por Horas Trabalhadas: ","CADASTRAR",INFORMATION_MESSAGE));
                    fun.setValorHoras(valorHoras);
                    char escolha = (JOptionPane.showInputDialog(null,"*Responder com s ou n!\nEle é um funcionário Sênior? ","CADASTRAR",QUESTION_MESSAGE)).charAt(0);
                    if (escolha == 's' ||  escolha == 'S') {
                        
                        int bonus = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Bonus por 10 horas trabalhadas: ","CADASTRAR",INFORMATION_MESSAGE));
                        funcS = new FuncionariosSenior(bonus,nome,horasTrab,valorHoras);
                        
                        Gerenciar.adicionarFuncionario(funcS);
                    }else{
                    
                        if (escolha =='n'  ||  escolha =='N') {
                            
                            Gerenciar.adicionarFuncionario(fun);
                        }else{
                        
                            JOptionPane.showMessageDialog(null,"Caractere Ínvalido");
                        }
                        
                    }
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null, ""+Gerenciar.listar(),"LISTA FUNCIONÁRIOS",INFORMATION_MESSAGE);
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, ""+Gerenciar.listarSalarios(),"LISTA SALÁRIOS",INFORMATION_MESSAGE);
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, ""
                            + "Total de Funcionários Sênior: \n"+Gerenciar.totalFuncionarioSenior(),"FUNCIONÁRIOS SÊNIOR",INFORMATION_MESSAGE);
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Funcionário Sênior com maior bônus: \n"+Gerenciar.funcionarioMaiorBonus()
                            ,"FUNCIONÁRIOS SÊNIOR",INFORMATION_MESSAGE);
                    break;
                    
                case 6:
                    
                    double faixainicial = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a menor faixa salarial: "
                            + "","LISTA SALARIAL",QUESTION_MESSAGE));
                    double faixafinal = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a maior faixa salarial: "
                            + "","LISTA SALARIAL",QUESTION_MESSAGE));
                    
                    JOptionPane.showMessageDialog(null, "Funcionários com essa Faixa Salarial: \n"+Gerenciar.listarPorFaixaSlarial(faixainicial, faixafinal)
                            ,"LISTA SALARIAL",INFORMATION_MESSAGE);
                    break;
                    
                case 7:
                    JOptionPane.showMessageDialog(null, "Programa Encerrado","SAÍDA",WARNING_MESSAGE);
                    controle = true;
                    break;
                    
            }
        }while(controle == false);
    }
    
}
