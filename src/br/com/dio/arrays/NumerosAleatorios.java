package br.com.dio.arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] vetor = new int[20];

        int i;
        for (i = 0; i < vetor.length; i++) {
            int numerosAleatorios = random.nextInt();
            vetor[i] = numerosAleatorios;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : vetor) {
            System.out.println(numero + " ");
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for (int numero : vetor) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : vetor) {
            System.out.print((numero+1) + " ");
        }




    }

}
