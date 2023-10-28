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

  public static void Ex2(){
    /**
      2. Tem-se um conjunto de dados contendo a altura e o sexo              (masculino, feminino) de 10 pessoas. Fazer um algoritmo que            calcule e escreva:
    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres.
      **/

    int qtdFeminino = 0, qtdMasculino = 0;
    float menor= Integer.MAX_VALUE;
    float maior=Integer.MIN_VALUE;
    float alturaTotalMasc=0;

    Scanner ler = new Scanner(System.in);

    for(int i = 0; i < 10; i++){

      System.out.println("Digite a altura: ");
      float altura = ler.nextFloat();

      System.out.println("Digite o número do sexo: \n 1- Feminino; \n 2- Masculino");
      int sexo = ler.nextInt();

      /**
      if(sexo == 1){
        System.out.println("Digite a altura: ");
        double alturaFeminino = ler.nextDouble();

        System.out.println("A altura é: " + alturaFeminino);
        System.out.println("O sexo é: Feminino");

        qtdFeminino = qtdFeminino + 1;
        
      } else if(sexo == 2){

        System.out.println("Digite a altura: ");
        double alturaMasculino = ler.nextDouble();

        System.out.println("A altura é: " + alturaMasculino);
        System.out.println("O sexo é: Masculino");

        qtdMasculino = qtdMasculino + 1;

        alturaTotalMasc = alturaTotalMasc + alturaMasculino;
      } **/

      
      if(sexo == 1){
        
        System.out.println("A altura é: " + altura);
        System.out.println("O sexo é: Feminino");

        qtdFeminino++;
        
      } else if (sexo == 2){
        
        System.out.println("A altura é: " + altura);
        System.out.println("O sexo é: Masculino");

        qtdMasculino++;

        alturaTotalMasc += altura;
        
      }
      else{
        System.out.println("Número de sexo invalido. Digite o número 1 para feminino ou o número 2 para masculino.");
      }

      /**
      if (alturaFeminino > maior && alturaMasculino < maior) {
           maior = alturaFeminino;
      } else if (alturaFeminino < maior && alturaMasculino > maior){
        maior = alturaMasculino;
      }
      if (alturaFeminino > menor && alturaMasculino < menor) {
           menor = alturaFeminino;
      } else if (alturaFeminino < menor && alturaMasculino > menor){
        menor = alturaMasculino;
      } **/
      
      if (altura > maior) {
           maior = altura;
      } 
      if (altura < menor){
          menor = altura;
      }

      System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
      
    }

    if(qtdMasculino > 0){

      float mediaMasc = alturaTotalMasc / qtdMasculino;

      System.out.println("A maior altura do grupo é de " + maior + " m");
      System.out.println("A menor altura é de " + menor + " m");
      System.out.println("A média de altura dos homens é " + mediaMasc + " m");
      System.out.println("O número de mulheres é: " + qtdFeminino);
      
    } else{
      System.out.println("Não possui homens no grupo, ou seja, não é possivel calcular a media de altura dos homens");
      System.out.println("A maior altura do grupo é de " + maior + " m");
      System.out.println("A menor altura é de " + menor + " m");
      System.out.println("O número de mulheres é: " + qtdFeminino);
    }
    
    
  }
  
}