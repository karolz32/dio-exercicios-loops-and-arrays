package br.com.dio.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        int i;
        for (i = numero; i > 0; i--){
            fatorial *= i;
        }

        System.out.println(numero + "! " + "= " + fatorial);
    }

}
