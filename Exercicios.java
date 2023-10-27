import java.util.Scanner;

public class Exercicios{
  
  public static void Ex1(){
    /**
      1. Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: 
      F = C * 1.8 + 32; 
      K = C + 273.15; 
      Re = C * 0.8; 
      Ra = C * 1.8 + 32 + 459.67
    **/

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite a temperatura em graus Celsius: ");
    double cel = ler.nextDouble();


    double kel = cel + 273.15;
    double rea = cel * 0.8;
    double ran = cel * 1.8 + 32 + 459.67;
    double fah = cel * 1.8 + 32;
   

    System.out.println("A temperatura em Kelvin é: " + kel);
    System.out.println("A temperatura em Réaumur é: " + rea);
    System.out.println("A temperatura em Rankine é: " + ran);
    System.out.println("A temperatura em Fahrenheit é: " + fah);
  }
  
}