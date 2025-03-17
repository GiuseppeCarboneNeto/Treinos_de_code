/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author CAMARGO
 */
public class Ex2 {

    
    public static void main(String[] args) {
               
float dist;
dist = 1000;

float gas;
gas = (float) 4.8;

float dist1 = dist/1000;
float comsumo = gas * dist1;


     
System.out.println("Carro usado:"+comsumo);
System.out.println("Distancia percorrida:"+dist+" M");
System.out.println("Gasolina gasta:"+gas+ " Litros");
    }
    
}
