/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

/**
 *
 * @author CAMARGO
 */
public class Ex7e8e9 {

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
        
        
        String nomecarro1 = "Uno";
float dist3;
dist3 = 1000;

float gas0;
gas0 = (float) 8.3;

float dist0 = dist3/1000;
float comsumo0 = (gas0 * dist0);

float valorgasto1 = (float)5.8976*(comsumo0);
     
System.out.println("Carro usado:"+nomecarro1);
System.out.println("Distancia percorrida:"+dist3+" M");
System.out.println("Gasolina gasta:"+comsumo0+ " Litros");
        System.out.println("Quantidade Gasta: "+valorgasto1);
    }
    
}
