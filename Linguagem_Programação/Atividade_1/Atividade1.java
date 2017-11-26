/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author googs
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ex1_2();
        ex3();
        ex4();
        ex5();
    }
    
    public static void ex1_2()
    {
        Data d = new Data();
        d.setData(20, 3, 1995);
        d.modo_1();
        d.modo_2();
        d.modo_3();
        
        Data d2 = new Data();
        d2.setData(30, 02, 1995);
        d2.modo_1();
        d2.modo_2();
        d2.modo_3();
    }
    
    public static void ex3() {
        Number n = new Number(100, 7);
        System.out.println(n.convertBase());
    }
    
    public static void ex4(){
    
        FacebookPost f = new FacebookPost("Autor", "AUDHAUDAHUHDUASHDUASHUDH");
        System.out.println("Autor: "+ f.getNome());
        System.out.println("Texto: "+ f.getTexto());
        System.out.println("Curtidas: "+ f.getCurtidas());
        
        f.setFacebookText("BLUBLUBLUBLUB");
        System.out.println("Novo texto: "+ f.getTexto());
        
        f.addCurtida();
        System.out.println("Curtidas: "+ f.getCurtidas());
        f.addCurtida();
        System.out.println("Curtidas: "+ f.getCurtidas());
        f.addCurtida();
        System.out.println("Curtidas: "+ f.getCurtidas());
        f.addCurtida();
        System.out.println("Curtidas: "+ f.getCurtidas());
    }
    
    public static void ex5() {
        Objeto o = new Objeto(30);
        System.out.println("Tamanho em Cm: "+o.getTamanho());
        System.out.println("Tamanho em Jarda: "+o.getJarda());
        System.out.println("Tamanho em Pes: "+o.getPes());
        System.out.println("Tamanho em Polegada: "+o.getPolegada());
    }
}
