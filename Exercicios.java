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

      System.out.println(" ");

      System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

      System.out.println(" ");
      
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

  public static void Ex3(){
    /** 
    3. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
    **/

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite a quantidade de funcionarios: ");
    int qtdFuncionarios = ler.nextInt();

    double salarioTotal = 0;

    System.out.println(" ");

    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

    System.out.println(" ");

    for(int i = 1; i <= qtdFuncionarios; i++){
      
      System.out.println("Digite o nome do " + i + "° funcionario: ");
      String nomeFuncionario = ler.next();

      System.out.println(" ");
      
      System.out.println("Digite o salrio do " + i + "° funcionario: ");
      double salario = ler.nextDouble();

      System.out.println(" ");

      System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

      System.out.println(" ");

      salarioTotal += salario;
      
    }
    
    double mediaSalario = salarioTotal / qtdFuncionarios;

    System.out.println("A media salarial é de: " + mediaSalario);
    
  }

  public static void Ex4(){
    /**
    4. Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
    **/

    Scanner ler = new Scanner(System.in);

    System.out.println("Utlize medidas iguais para todas as dimensões");

    System.out.println(" ");

    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

    System.out.println(" ");

    System.out.println("Digite a altura da parede: ");
    double hp = ler.nextDouble();

    System.out.println("Digite a largura da parede: ");
    double lp = ler.nextDouble();
    

    System.out.println(" ");

    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

    System.out.println(" ");
    

    System.out.println("Digite a altura do azulejo:");
    double ha = ler.nextDouble();

    System.out.println("Digite a largura do azulejo: ");
    double la = ler.nextDouble();

    System.out.println(" ");

    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

    System.out.println(" ");
    

    double areaParede = hp * lp;

    System.out.println("A area da parede é: " + areaParede);

    double areaAzulejo = ha * la;

    System.out.println("A area do azulejo é: " + areaAzulejo);


    System.out.println(" ");

    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

    System.out.println(" ");

    
    double qtdAzulejos = areaParede / areaAzulejo;

    System.out.println("A quantidade de azulejos necessarios para cobrir a parede é de: " + qtdAzulejos);
  }

  public static void Ex5(){
    /** 
      5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
    Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado.
    **/

    Scanner ler = new Scanner(System.in);

    System.out.println("Utlize medidas iguais para todas as dimensões");
    

    System.out.println(" ");

    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

    System.out.println(" ");
    

    System.out.println("Digite o raio da lata: ");
    double raio = ler.nextDouble();
    

    System.out.println(" ");

    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

    System.out.println(" ");
    

    System.out.println("Digite a altura da lata: ");
    double altura = ler.nextDouble();
    

    System.out.println(" ");

    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

    System.out.println(" ");
    

    double volume = 3.14159 * raio * raio * altura;

    System.out.println("O volume da lata de óleo é: " + volume);
    
  }
  
}