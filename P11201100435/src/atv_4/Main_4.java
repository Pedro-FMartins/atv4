/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv_4;
public class Main_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       
       Contribuinte c1 = new Contribuinte(1300.00, "Fernando Hugo Oliveira", "546.876.531-84");
       System.out.println("Nome: " + c1.nome + "\nCPF: " + c1.cpf + "\nSalário: " + c1.salario);
       System.out.println("Sua Alíquota será de " + c1.SetAliquota() + "%.");
       c1.SetCalc_IRPF();
       
       //Resposta Desafio: c1
       
       // Nome: Fernando Hugo Oliveira
       // CPF: 546.876.531-84
       // Salário: 1300.0
       // Sua Alíquota será de 0.0%.
       // Não haverá desconto no salário.
              
       System.out.println();
       System.out.println();
       
       Contribuinte c2 = new Contribuinte(2150.00, "Cleber Marcos da Silva", "915.918.726-31");
       System.out.println("Nome: " + c2.nome + "\nCPF: " + c2.cpf + "\nSalário: " + c2.salario);
       System.out.println("Sua Alíquota será de " + c2.SetAliquota() + "%.");
       c2.SetCalc_IRPF(); 
       
       //Resposta Desafio: c2
       
       // Nome: Cleber Marcos da Silva
       // CPF: 915.918.726-31
       // Salário: 2150.0
       // Sua Alíquota será de 7.5%.
       // O salário líquido será de: 1988.75 reais.
       
       System.out.println();
       System.out.println();
       
       Contribuinte c3 = new Contribuinte(3500.00, "Sandro Marques", "665.468.713-21");
       System.out.println("Nome: " + c3.nome + "\nCPF: " + c3.cpf + "\nSalário: " + c3.salario);
       System.out.println("Sua Alíquota será de " + c3.SetAliquota() + "%.");
       c3.SetCalc_IRPF();
       
       //Resposta Desafio: c3
       
       // Nome: Sandro Marques
       // CPF: 665.468.713-21
       // Salário: 3500.0
       // Sua Alíquota será de 15.0%.
       // O salário líquido será de: 2975.0 reais.
       
       System.out.println();
       System.out.println();
       
       Contribuinte c4 = new Contribuinte(5600.00, "Otávio Santos de Almeida", "654.968.765-16");
       System.out.println("Nome: " + c4.nome + "\nCPF: " + c4.cpf + "\nSalário: " + c4.salario);
       System.out.println("Sua Alíquota será de " + c4.SetAliquota() + "%.");
       c4.SetCalc_IRPF(); 
       
       //Resposta Desafio: c4
       
       // Nome: Otávio Santos de Almeida
       // CPF: 654.968.765-16
       // Salário: 5600.0
       // Sua Alíquota será de 27.5%.
       // O salário líquido será de: 4060.0 reais.
       
    }
    
}
