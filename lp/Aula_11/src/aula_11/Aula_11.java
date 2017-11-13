package aula_11;

import javax.swing.JOptionPane;

public class Aula_11 {
    public static void main(String[] args) {
        
        boolean controle = false;
        boolean controle1 = false;
        FormaGeometrica forma;
        
        do{
        
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"===== MENU - FORMAS GEOMÉTRICAS =====\n1 - Cadastrar\n2 - Calcular Área Total"
                    + "\n3 - Listar\n4 - Sair"));
            
            switch(opcao){
            
                case 1:
                    
                    do{
                    int opcao1 = Integer.parseInt(JOptionPane.showInputDialog(null,"===== FORMAS =====\n1 - Quadrado"
                            + "\n2 - Círculo"
                    + "\n3 - Losango\n4 - Sair"));
                    
                    switch(opcao1){
                    
                        case 1:
                            
                            String nome = JOptionPane.showInputDialog(null,"Digite o nome da Forma: ");
                            float lado = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor do Lado do Quadrado: "));
                            forma = new Quadrado(lado,nome);
                            
                            Gerenciar.add(forma);
                            break;
                            
                            
                        case 2:
                            
                            String nome1 = JOptionPane.showInputDialog(null,"Digite o nome da Forma: ");
                            float raio = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor do raio do Círculo: "));
                            forma = new Circulo(raio,nome1);
                            
                            Gerenciar.add(forma);
                            break;
                            
                        case 3:
                            String nome2 = JOptionPane.showInputDialog(null,"Digite o nome da Forma: ");
                            int diagonalmenor = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor do lado menor:"));
                            int diagonalmaior = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor do lado maior:"));
                            forma = new Losango(diagonalmenor, diagonalmaior,nome2);
                            
                            Gerenciar.add(forma);
                            break;
                            
                        case 4:
                            JOptionPane.showMessageDialog(null,"CADASTRO ENCERRADO!");
                            controle1 = true;
                            break;
                    }
                    }while(controle1 == false);
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null, "ÁREA TOTAL: "+Gerenciar.calcularAreaTotal());
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "LISTA DE FORMAS: \n"+Gerenciar.listar());
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO!");
                    controle = true;
                    break;
            }
        }while(controle == false);
        
    }
    
}
