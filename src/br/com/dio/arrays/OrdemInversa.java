package br.com.dio.arrays;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[5];


        int count = 0;
        while(count < (vetor.length)){

            System.out.println("Digite número: ");
            int numero = scan.nextInt();
            vetor[count] = numero;
            count++;
        }

        System.out.print("\nVetor invertido: ");
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }

}

