package br.com.dio.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        int numero;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número no qual você quer a tabuada: ");
        numero = scan.nextInt();
        if (numero > 0 && numero <= 10){
            int i;
            System.out.println("Tabuada de " + numero);
            for(i = 0; i <= 10; i++){
                System.out.println(numero + " X " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("Numero invalido");
        }
    }
}
