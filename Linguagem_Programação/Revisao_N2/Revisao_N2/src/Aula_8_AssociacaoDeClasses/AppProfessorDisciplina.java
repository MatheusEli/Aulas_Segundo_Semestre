package Aula_8_AssociacaoDeClasses;

import java.util.Scanner;

public class AppProfessorDisciplina {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        Disciplina d;
        boolean controle = false;
        
        do{
        System.out.println("=======OPÇÕES=======\n1 - Cadastrar Professores e Disciplinas"
                + "\n2 - Buscar Professor pela Disciplina\n3 - Buscar Professores pela Titulação"
                + "\n4 - Mostrar Disciplinas que um Professor Leciona\n5 - Sair");
        int opcao = entrada.nextInt();
        
        switch(opcao){
        
            case 1:
                
                d = new Disciplina();
                System.out.println("Digite o nome do Professor: ");
                String professor = ler.nextLine();
                d.getProfessor().setNome(professor);
                
                System.out.println("Digite a titulação do Professor: ");
                String titulacao = ler.nextLine();
                d.getProfessor().setTitulação(titulacao);
                
                System.out.println("Digite a carga horária do Professor: ");
                int cargahoraria = entrada.nextInt();
                d.getProfessor().setCargahoraria(cargahoraria);
                
                System.out.println("Digite a disciplina que este professor Leciona: ");
                String disciplina = ler.nextLine();
                d.setNome(disciplina);
                Gerenciador.adicionarDisciplina(d);
                break;
                
            case 2:
                System.out.println("Digite o nome da Disciplina que este Professor Leciona:");
                String nomeDisciplina = ler.nextLine();
                System.out.println("Professor que ministra esta Disciplina: "
                        + ""+Gerenciador.buscarProfessor(nomeDisciplina));
                break;
                
            case 3:
                System.out.println("Digite a titulação: ");
                String nomeTitulacao = ler.nextLine();
                System.out.println("Professores com esta Titulação: "+Gerenciador.buscarProfessorTitulacao(nomeTitulacao));
                break;
                
            case 4:
                System.out.println("Digite o nome do Professor: ");
                String nomeProfessor = ler.nextLine();
                System.out.println("Disciplinas que este Professor leciona: "+Gerenciador.disciplinasProfessor(nomeProfessor));
                break;
                
            case 5:
                controle = true;
                break;
        }
        }while(controle == false);
    }
    
}
