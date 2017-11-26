package aula_10;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Aula_10 {

    public static void main(String[] args) {
        
        Media m;
        
        boolean controle = false;
        do{
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "==========CÁLCULO DE MÉDIAS==========\n1 - Média Aritmética"
                + "\n2 - Média Ponderada\n3 - Sair\nEscolha uma opção: "));
        
        switch(opcao){
        
            case 1:
                m = new Media();
                
                double opcao1  = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor: ","MÉDIA ARITMETICA",INFORMATION_MESSAGE));
                m.setValor1(opcao1);
                
                double opcao2  = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor valor: ","MÉDIA ARITMETICA",INFORMATION_MESSAGE));
                m.setValor2(opcao2);
                
                JOptionPane.showMessageDialog(null,"Média aritmetica: "+m.calcularMedia(),"MÉDIA ARITMETICA",INFORMATION_MESSAGE);
                break;
                
            case 2:
                double peso1 = 0,peso2 = 0;
                m = new Media();
                
                double opcao3  = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor: ","MÉDIA ARITMETICA",INFORMATION_MESSAGE));
                m.setValor1(opcao3);
                peso1++;
                
                double opcao4  = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor valor: ","MÉDIA ARITMETICA",INFORMATION_MESSAGE));
                m.setValor2(opcao4);
                peso2++;
                
               m = new MediaPonderada(peso1,peso2,m.getValor1(),m.getValor2());
                
                JOptionPane.showMessageDialog(null,"Média ponderada: "+m.calcularMedia(),"MÉDIA ARITMETICA",INFORMATION_MESSAGE);
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null,"PROGRAMA ENCERRADO!");
                controle = true;
                break;
                
        }
        }while(controle == false);
    }
    
}
