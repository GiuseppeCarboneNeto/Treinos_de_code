/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

/**
 *
 * @author CAMARGO
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nomecarro = "Opala";
float dist;
dist = 1000;

float gas;
gas = (float) 4.8;

float dist1 = dist/1000;
float comsumo = (gas * dist1);

float valorgasto = (float)5.8976*(comsumo);
     
System.out.println("Carro usado:"+nomecarro);
System.out.println("Distancia percorrida:"+dist+" M");
System.out.println("Gasolina gasta:"+comsumo+ " Litros");
        System.out.println("Quantidade Gasta: "+valorgasto);
    }
    
}
