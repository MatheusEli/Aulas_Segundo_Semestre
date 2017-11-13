package Execicios_Revisao;

import java.util.Scanner;

public class AppDisciplinaProfessor {

    public static void main(String[] args) {
       
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        Disciplina d;
        
        boolean controle = false;
        
        do{
        
            System.out.println("*OPÇÕES*\n1 - Cadastrar Disciplinas e Professores\n2 - Buscar Professor de Disciplina\n"
                    + "3 - Buscar Titulação\n4 - Listar Disciplinas de um professor\n5 - Sair");
            int opcao = entradaInt.nextInt();
            
            switch(opcao){
            
                case 1:
                    d = new Disciplina();
                    
                    System.out.println("Digite o nome da Disciplina: ");
                    String nome = entradaString.nextLine();
                    d.setNome(nome);
                    
                    System.out.println("Digite a carga Horária da disciplina: ");
                    int cargahoraria = entradaInt.nextInt();
                    d.setCargahoraria(cargahoraria);
                    
                    System.out.println("Digite o nome do Professor da Disciplina: ");
                    String nomeprofessor = entradaString.nextLine();
                    d.getProfessor().setNome(nomeprofessor);
                    
                    System.out.println("Digite a titulação do Professor: ");
                    String titulacao = entradaString.nextLine();
                    d.getProfessor().setTitulacao(titulacao);
                    
                    GerenciarDisciplinas.adicionarDisciplina(d);
                    break;
                    
                case 2:
                    System.out.println("Digite o nome dessa disciplina: ");
                    String nomedisciplina = entradaString.nextLine();
                    
                    System.out.println("Professor que Ministra esta disciplina: "
                            + ""+GerenciarDisciplinas.pesquisarDisciplinas(nomedisciplina));
                    break;
                    
                case 3:
                    System.out.println("Digite a titulação a pesquisar: ");
                    String buscat = entradaString.nextLine();
                    
                    System.out.println("Professores com esta Titulação: "
                            + ""+GerenciarDisciplinas.buscarTitulacao(buscat));
                    break;
                    
                case 4:
                    System.out.println("Digite o nome do professor: ");
                    String professor = entradaString.nextLine();
                    
                    System.out.println("Disciplinas que este professor leciona: "
                            + ""+GerenciarDisciplinas.disciplinasProfessor(professor));
                    break;
                    
                case 5:
                    System.out.println("PROGRAMA ENCERRADO!");
                    controle = true;
                    break;
            }
        }while(controle == false);
    }
    
}
