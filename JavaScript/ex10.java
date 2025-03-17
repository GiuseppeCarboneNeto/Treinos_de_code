/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

public class ex10 {



    public static void main(String[] args) {
//Distancia em km
Scanner numero = new Scanner(System.in);
System.out.println("Coloque a distancia em Km: ");
float dist = numero.nextFloat();


//Litros
Scanner L = new Scanner(System.in);
System.out.println("Coloque a Km por litro: ");
float litros = L.nextFloat();


//Preço do litro 
Scanner P = new Scanner(System.in);
System.out.println("Coloque o preço do litro: ");
float preço = P.nextFloat();


//Valor total 
float valor_total =preço*(dist/litros);
        System.out.println("Este é o valor total gasto: "+valor_total);


       
       
        
    }
    
}
