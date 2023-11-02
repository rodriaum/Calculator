package com.github.rodriaum;

import com.github.rodriaum.util.Math;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("-----------------");

        System.out.println("Escolha o número correspondente ao método de calculo: ");
        int method = scanner.nextInt();

        boolean hasMore = true;

        while (hasMore) {
            System.out.println("Dígite os números para calculo: ");
            double values = scanner.nextDouble();

            double amount = 0;

            switch (method) {
                case 1:
                    amount = Math.addition(amount, values);
                    break;
                case 2:
                    amount = Math.subtraction(amount, values);
                    break;
                case 3:
                    amount =  Math.multiplication(amount, values);
                    break;
                case 4:
                    amount = Math.division(amount, values);
                    break;
                default:
                System.err.println("ERRO! Método de calculo ínvalido.");
                    break;
            }

            System.out.println("Deseja adicionar mais números? (true ou false):");
            hasMore = scanner.nextBoolean();

            if (hasMore == false) 
            System.out.println("Resultado: " + amount);

        }
        scanner.close();
    }
}