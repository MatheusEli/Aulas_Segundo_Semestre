package aula_8_lp;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AppProfessorDisciplina {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        
        Disciplina d;
        Professor pr = new Professor();
        boolean controle = false;
        
        do{
        
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"*OPÇÕES*\n1 - Cadastrar Professores e Disciplinas\n"
                    + "2 - Buscar Disciplina\n3 - Buscar Titulação\n4 - Mostrar Disciplinas de um professor\n5 - Sair"));
            
            
            switch(opcao){
            
                case 1:
                    d = new Disciplina();
                    
                    
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome da disciplina: ");
                    d.setNome(nome);
                    
                    int cargahoraria = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a carga horaria da Disciplina: "));
                    d.setCargahoraria(cargahoraria);
                    
                    String professor = JOptionPane.showInputDialog(null, "Digite o nome do Professor: ");
                    d.getProfessor().setNome(professor);
                    
                    int cargahorariaprofessor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a carga horaria do professor: "));
                    d.getProfessor().setCargahoraria(cargahorariaprofessor);
                    
                    String titulacao = JOptionPane.showInputDialog(null, "Digite a titulação do Professor: ");
                    d.getProfessor().setTitulacao(titulacao);
                    
                    Gerenciar.adicionarDisciplina(d);
                    break;
               
                case 2:
                    String disciplina = JOptionPane.showInputDialog(null, "Digite o nome da Disciplina: ");
                    JOptionPane.showMessageDialog(null,"Professor que Diministra esta Disciplina:\n"
                            + ""+Gerenciar.pesquisarDisciplina(disciplina));
                    break;
                
                case 3:
                    String titulacaoP = JOptionPane.showInputDialog(null, "Digite a titulação a pesquisar: ");
                    JOptionPane.showMessageDialog(null,"Professores com esta titulação: \n"
                            + ""+Gerenciar.pesquisarTitulacao(titulacaoP));
                    break;
                
                case 4:
                    String professorP = JOptionPane.showInputDialog(null, "Digite o nome do professor: ");
                    JOptionPane.showMessageDialog(null,"Disciplinas que este professor Leciona: \n"+Gerenciar.pesquisarProfessor(professorP));
                    break;
                
                case 5:
                    JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO!");
                    controle = true;
                    break;
            }
            
            
        }while(controle == false);
    }
    
}
