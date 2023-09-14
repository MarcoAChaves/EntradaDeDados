package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Criando entrada de dados de tipo Scanner
   // sc.next = string / sc.nextInt = inteiro / sc.nextDouble = flutuante / sc.next().charAt(0) = char

        Locale.setDefault(Locale.US);
    Scanner sc = new Scanner (System.in);
    String x;
    int y;
    double a;

    System.out.println("Digite seu nome: " );
    x = sc.next();
        System.out.println("Digite sua idade: " );
    y = sc.nextInt();
        System.out.println("Digite sua altura: " );
    a = sc.nextDouble();

    System.out.println("Vc se chama " + x +  ",tem " + y + " anos de idade" +  " e " + a + " altura, Correto?");


    sc.close();
    }
}
