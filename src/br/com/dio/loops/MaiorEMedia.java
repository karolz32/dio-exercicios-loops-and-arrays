package br.com.dio.loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt(); //ler numero e acrescentar um no contador
            count += 1;

            soma += numero; //soma vai receber sempre soma + numero digitado para guardar o total

            if(maior < numero) maior = numero; //enquanto maior for menor que o numero recebido, ele assumirá o valor de numero


        } while (count < 5); //contador de 5 loops

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));
    }

}
