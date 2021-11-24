package br.com.dio.loops;

import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros, numero;
        int pares = 0, impares = 0;

        System.out.println("Digite a quantidade de números: ");
        quantNumeros = scan.nextInt();


        int count = 0;
        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();
            count ++;

            if (numero % 2 == 0) pares++;
            else {
                impares++;
            }

        } while (count < quantNumeros);

        System.out.println("A quantidade de números pares é: " + pares);
        System.out.println("A quantidade de números ímpares é: " + impares);
    }
}
