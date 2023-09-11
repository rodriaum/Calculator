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

        System.out.print("Escolha o número correspondente ao método de calculo: ");
        int method = scanner.nextInt();

        System.out.print("Dígite o primeiro número do calculo: ");
        double num1 = scanner.nextDouble();

        System.out.print("Dígite o segundo número do calculo: ");
        double num2 = scanner.nextDouble();
        
        switch (method) {
            case 1:
                System.out.println("Resultado: " + Math.addition(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + Math.subtraction(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + Math.multiplication(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + Math.division(num1, num2));
                break;
            default:
                break;
        }
    }
}