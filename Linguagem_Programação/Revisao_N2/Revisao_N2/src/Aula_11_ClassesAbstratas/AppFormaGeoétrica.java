package Aula_11_ClassesAbstratas;

import javax.swing.JOptionPane;

public class AppFormaGeoétrica {

    public static void main(String[] args) {
            
        FormaGeometrica f;
        boolean controle = false, controle2 = false;
        do{
            
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "=====MENU - FORMAS GEOMÉTRICAS=====\n1 - Cadastrar\n2 - Calcular Area Total"
                    + "\n3 - Listar\n4 - Sair"));
            
            switch(opcao){
            
                case 1:
                    do{
                    int opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null, "=====FORMAS=====\n1 - Quadrado\n2 - Círculo"
                    + "\n3 - Losango\n4 - Sair"));
                    
                    switch(opcao2){
                    
                        case 1:
                            int lado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do Lado do Quadrado: "));
                            f = new Quadrado(lado,"Quadrado");
                            Gerenciar.adicionarForma(f);
                            break;
                            
                        case 2:
                            double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do Raio do Círculo: "));
                            f = new Circulo(raio,"Circulo");
                            Gerenciar.adicionarForma(f);
                            break;
                            
                        case 3:
                            double diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Diagonal Maior do Losango: "));
                            double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Diagonal Menor do Losango: "));
                            f = new Losango(diagonalMaior, diagonalMenor, "Losango");
                            Gerenciar.adicionarForma(f);
                            break;
                            
                        case 4:
                            controle2 = true;
                            break;
                    }
                    break;
                    }while(controle2 == false);
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null,"Area Total: "+Gerenciar.calcularAreaTotal());
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,"=====FORMAS GEOMÉTRICAS CADASTRADAS=====\n"+Gerenciar.listar());
                    break;
                    
                case 4:
                    controle = true;
                    break;
            }
        
        }while(controle == false);
    }
}
