package Exercicio_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Aluno a;
        char alfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t'
        ,'u','v','x','w','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V'
        ,'W','X','Y','Z'};
        
        double notasAlunos[];
        
        FileReader fr = new FileReader("Alunos.txt");
        BufferedReader bf = new BufferedReader(fr);
        String line, saida = "";
        
        
        while((line = bf.readLine()) != null){
        
            saida += line+"\n";
        }
        
        String tokens[] = saida.split("\n");
        
       
        for (int i = 0; i < tokens.length; i++) {
            
            for (int j = 0; j < alfabeto.length; j++) {
                
                if (tokens[i].charAt(0) == alfabeto[j]) {
                    
                    a = new Aluno();
                    notasAlunos = new double[4];
                    a.setNome(tokens[i]);
                    notasAlunos[0] = Double.parseDouble(tokens[i+1]);
                    notasAlunos[1] = Double.parseDouble(tokens[i+2]);
                    notasAlunos[2] = Double.parseDouble(tokens[i+3]);
                    notasAlunos[3] = Double.parseDouble(tokens[i+4]);
                    a.setNotas(notasAlunos);
                    a.setMedia(a.calcularMedia());


                    GerenciarAlunos.adicionarAlunos(a);

                            
                }
            }
        }
        
        FileWriter fw = new FileWriter("MediaAlunos.txt");
        fw.write(GerenciarAlunos.listar());
        fw.flush();
        bf.close();
    
    }
}
