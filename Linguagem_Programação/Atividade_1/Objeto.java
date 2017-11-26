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
public class Objeto {
    private int tamanho;
    
    public Objeto(int cm)
    {
        this.tamanho = cm;
    }
    
    public int getTamanho()
    {
        return this.tamanho;
    }
    
    public double getJarda()
    {
        return tamanho*0.010936;
    }
    
    public double getPolegada()
    {
        return tamanho*0.39370;
    }
    
    public double getPes()
    {
        return tamanho*0.032808;
    }
}
