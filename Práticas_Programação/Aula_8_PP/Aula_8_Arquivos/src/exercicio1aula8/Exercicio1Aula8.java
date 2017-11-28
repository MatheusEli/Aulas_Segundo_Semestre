/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1aula8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author remar
 */
public class Exercicio1Aula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Amigo vetAmigos[] = new Amigo[2];
        Scanner entradaS = new Scanner(System.in);
        Scanner entradaN = new Scanner(System.in);

        for (int i = 0; i < vetAmigos.length; i++) {
            Amigo amigo = new Amigo();
            System.out.println("Nome:");
            amigo.setNome(entradaS.nextLine());
            System.out.println("Endereco:");
            amigo.setEndereco(entradaS.nextLine());
            System.out.println("RG:");
            amigo.setRG(entradaS.nextLine());
            System.out.println("Idade:");
            amigo.setIdade(entradaN.nextInt());
            vetAmigos[i] = amigo;
        }

        for (int i = 0; i < vetAmigos.length; i++) {
            try {
                writeDados(vetAmigos[i], "dados.txt");
            } catch (IOException ioex) {
                ioex.printStackTrace();
            }
        }
        
        try{
          readDados("dados.txt");
        
       } catch (IOException ioex) {
               ioex.printStackTrace();
          }

    }

    static void readDados(String filename) throws IOException {
        DataInputStream din = new DataInputStream(
                new FileInputStream(filename));
        byte dados[];
        int conteudo; 
        while((conteudo = din.read())!=-1 ){           
            System.out.print((char)conteudo);
          
            if(conteudo=='\n'){
                System.out.println();
            }
        }
        din.close();
    }

    static void writeDados(Amigo amigo, String filename)
            throws IOException {
        DataOutputStream dout = new DataOutputStream(
                new FileOutputStream(filename,true));
        String dados = amigo.getNome()+" "+amigo.getEndereco()+" "+amigo.getRG()+" "+amigo.getIdade()+"\n";
        dout.write(dados.getBytes());
        dout.close();
    }

}
