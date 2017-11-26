
package aula_8_lp;

import javax.swing.JOptionPane;

public class Aula_8_LP {

    public static void main(String[] args) {
        
        
        Animal a;
        
        
        boolean controle = false;
        
        
        do{
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "*CENTRAL DO ANIMAL*\n1 - Cadastrar Animal e Proprietário"
                    + "\n2 - Listar Animais cadastrados\n3 - Pesquisar raça\n4 - Sair"));
        
            switch(opcao){
            
            
                case 1:
                    
                    a = new Animal();
                    
                    String nome = JOptionPane.showInputDialog(null, "*DADOS ANIMAL*\nDigite o nome do Animal: ");
                    a.setNome(nome);
                    String raca = JOptionPane.showInputDialog(null, "*DADOS ANIMAL*\nDigite a raça do Animal: ");
                    a.setRaça(raca);
                    String cor = JOptionPane.showInputDialog(null, "*DADOS ANIMAL*\nDigite a cor do Animal: ");
                    a.setCor(cor);
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "*DADOS ANIMAL*\nDigite a idade do Animal: "));
                    a.setIdade(idade);
                    String nomeProprietario = JOptionPane.showInputDialog(null, "*DADOS ANIMAL*\nDigite o nome do Proprietário: ");
                    a.getProprietario().setNome(nomeProprietario);
                    String telefoneProprietario = JOptionPane.showInputDialog(null, "*DADOS ANIMAL*\nDigite o telefone do Proprietário: ");
                    a.getProprietario().setTelefone(telefoneProprietario);
                    
                    Gerenciador.adicionarAnimais(a);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "*LISTA*\n"+Gerenciador.listarAnimais());
                    break;
                case 3:
                    String racaPesquisa = JOptionPane.showInputDialog(null, "Digite a raça a pesquisar: ");
                    JOptionPane.showMessageDialog(null, "PROPRIETÁRIOS DE ANIMAIS COM ESSA RAÇA: \n"+Gerenciador.pesquisar(racaPesquisa));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "VOLTE SEMPRE!");
                    controle = true;
                    break;
            
            }
        
        }while(controle == false);
    }
    
}
