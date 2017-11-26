/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;


    public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    private boolean error = false;
    
    public Data() {}
    
    private void Error(String error)
    {
        System.out.println(error);
        this.error = true;
    }
    
    public void setData(int dia, int mes, int ano){
    
        if(ano > 0){
            this.ano = ano;
        } else {
            this.Error("Ano invalido");
            return;
        }
        
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        } else {
            this.Error("Mes invalido");
            return;
        }
        
        switch(mes)
        {
            case 2:
                if(dia >=1     &&   dia <= 28)
                    this.dia = dia;
                else
                    this.Error("Dia invalido");
                
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if(dia >= 1   &&   dia <= 30)
                    this.dia = dia;
                else
                    this.Error("Dia invalido");
                break;

            default:
                if(dia >= 1    &&   dia <= 31)
                    this.dia = dia;
                else
                    this.Error("Dia invalido");
        }      
    }
    
    private String getData(int modo)
    {
        if(this.error)
            return "Data incorreta";

        switch (modo) {
            case 1:
                return +dia+"/"+mes+"/"+ano;
            case 2:
                return ano+"/"+mes+"/"+dia;
            case 3:
                return dia+"/"+mes+"/"+ano;
            default:
                 return "";
        }
    }
    
    public void modo_1()
    {
        System.out.println(this.getData(1));
    }
    public void modo_2()
    {
        System.out.println(this.getData(2));
    }
    public void modo_3()
    {
        System.out.println(this.getData(3));
    }
}
