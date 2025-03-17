/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

public class ex11 {



    public static void main(String[] args) {
//Numero e o seu anterior
Scanner numero = new Scanner(System.in);
System.out.println("Coloque o seu numero: ");
float n1 = numero.nextFloat();
float valor = n1-1;


//Se numero é 0
if (n1==0){
    System.out.println("Este numero é zero");
    System.out.println("Este é o seu antecesor: " + valor);
}
//Se numero é negativo
if(n1<0){
    System.out.println("Este numero é negativo");
    System.out.println("Este é o seu antecesor: " + valor);
}
//numero positivo
else{
    System.out.println("Este numero é negativo");
    System.out.println("Este é o seu antecesor: " + valor);
}





       
       
        
    }
    
}
