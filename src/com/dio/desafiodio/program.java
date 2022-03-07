package com.dio.desafiodio;

import java.util.Scanner;
 public class program{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         double nota1, nota2, media;

         System.out.println("Primeira nota: ");
         nota1 = sc.nextDouble();
         System.out.println("Segunda nota: ");
         nota2 = sc.nextDouble();

         //TODO: Complete os espaços em branco com as respectivas variáveis para o calculo da média.
         media = (nota1 * 3.5 + nota2 * 7.5)/11;

         //TODO: Complete com a variável que representa o resultado da média.
         System.out.printf("MÉDIA = %.5f", media );
         System.out.println();

     }
 }
