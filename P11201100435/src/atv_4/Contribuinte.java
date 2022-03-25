/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv_4;

/**
 *
 * @author Pedro
 */
public class Contribuinte {
    
    public String nome;
    public String cpf;
    public double salario;
    public float desc_irpf;
    public double aliquota;
    public float Calc_IRPF;
    public float imposto;
    
    public Contribuinte(double salario, String nome, String cpf)
    {
        this.cpf = cpf;
        this.salario = salario; 
        this.nome = nome;
        this.aliquota = aliquota;
        this.salario = salario;
        desc_irpf = (float) ((aliquota * salario) - salario);
        
        
    }
    
    public String GetNome()
    {
        return nome;
    }
    
    public String GetCpf()
    {
        return cpf;
    }
    
    public double GetSalario()
    {
        return salario;
    }
    public double GetAliquota()
    {
        return aliquota;
    }
    
    public float GetDesc_IRPF()
    {
        return desc_irpf;
    }
    
    public double SetAliquota()
    {
        if(salario < 1903.98)
        {
            aliquota = 0;
        }
        
        else if(1903.99 < salario & salario < 2826.65)
        {
            aliquota = 7.5;
        }
        
        else if(2826.66 < salario & salario < 3751.05)
        {
            aliquota = 15;
        }
        
        else if(3751.06 < salario & salario < 4664.68)
        {
            aliquota = 22.5;
        }
        
        else
        {
            aliquota = 27.5;
        }
        return aliquota;
    }
    
    
    public float SetCalc_IRPF()
    {
        if(salario < 1903.98)
        {
            desc_irpf = 0;
            System.out.println("Não haverá desconto no salário.");
        }
        
        else if(1903.99 < salario & salario < 2826.65)
        {
            desc_irpf = (float) (salario - (salario * 0.075));
            System.out.println("O salário líquido será de: " + desc_irpf + " reais.");        
        }
        
        else if(2826.66 < salario & salario < 3751.05)
        {
            desc_irpf = (float) (salario - (salario*0.15));
            System.out.println("O salário líquido será de: " + desc_irpf + " reais.");
        }
        
        else if(3751.06 < salario & salario < 4664.68)
        {
            desc_irpf = (float) (salario - (salario * 0.225));
            System.out.println("O salário líquido será de: " + desc_irpf + " reais.");
        }
        
        else
        {
            desc_irpf = (float) (salario - (salario * 0.275));
            System.out.println("O salário líquido será de: " + desc_irpf + " reais.");
        }
        return desc_irpf;
        
        
    }  
}

    

