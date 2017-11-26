package Execicios_Revisao;

import java.util.Scanner;

public class AppAnimalProprietario {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        Animal a;
        boolean controle = false;
        
        
        do{
        System.out.println("*OPÇÕES*\n1 - Cadastrar animal e proprietario\n2 - Listar todos os animais\n3 - Pequisar raças"
                + "\n4 - Sair");
        int opcao = entrada.nextInt();
        
        switch(opcao){
        
            case 1:
                
                a = new Animal();
                System.out.println("Digite o nome do animal: ");
                String nome  = entradaString.nextLine();
                a.setNome(nome);
                
                System.out.println("Digite a raça do animal: ");
                String raca = entradaString.nextLine();
                a.setRaca(raca);
                
                System.out.println("Digite a cor do animal: ");
                String cor = entradaString.nextLine();
                a.setCor(cor);
                
                System.out.println("Digite a data de nascimento do animal: ");
                int anonascimento = entrada.nextInt();
                a.setAnonascimento(anonascimento);
                
                System.out.println("Digite o nome de seu Proprietário: ");
                String nomeproprietario = entradaString.nextLine();
                a.getProprietario().setNome(nomeproprietario);
                
                System.out.println("Digite o telefone do Proprietário: ");
                String telefone = entradaString.nextLine();
                a.getProprietario().setTelefone(telefone);
                
                Gerenciar.adicionarAnimal(a);
                break;
                
            case 2:
                System.out.println("*LISTA*\n"+Gerenciar.listarAnimais());
                break;
                
            case 3:
                System.out.println("Digite a raça a pesquisar: ");
                String racapesquisa = entradaString.nextLine();
                
                System.out.println("Nome dos proprietarios dos animais dessa raça: \n"
                        + ""+Gerenciar.pesquisarRaca(racapesquisa));
                break;
                
            case 4:
                System.out.println("PROGRAMA ENCERRADO!");
                controle = true;
                break;
        }
        }while(controle == false);
    }
    
}
