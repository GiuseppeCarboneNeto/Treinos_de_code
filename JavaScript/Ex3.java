/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author CAMARGO
 */
public class Ex3 {

    
    public static void main(String[] args) {
               
String vendedor = "Rodrigo";
float salario = 1100;
int vendasefetuadas =20;
float comissao = (float)0.15;
float novosalario =salario+comissao*(20*vendasefetuadas);
        float valorproduto = 20;

        System.out.println("Salario: "+salario);
        System.out.println("Comissão: "+comissao);
        System.out.println("Vendas efetuadas: "+vendasefetuadas+". Produtos valor: "+valorproduto);
        System.out.println("Novo salario: "+novosalario);
        
        
        
    }
    
}
