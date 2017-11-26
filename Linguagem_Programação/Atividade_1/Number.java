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
public class Number {
    
    private int numero;
    private int base;
    
    private int resto;
    private int aux;
    
    public Number(int n, int base) {
        this.numero = n;
        this.base = base;
    }
    
    public String convertBase()   
    {
        this.aux = this.numero;
        
        String out = "";
        
        while(getNextBase())
            out = this.resto+out;
        
        return out;
    }
    
    /*
     * Return boolean
     * verifica se existe proxima divisão
     */
    private boolean getNextBase()
    {
        if(this.aux <= 0)
            return false;

        this.resto = this.aux%this.base;
        this.aux = this.aux/this.base;

        return true;
    }
        
}
        
