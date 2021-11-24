package br.com.dio.loops;

/* Nota: Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Digite uma nota: ");
           float nota = Float.parseFloat(scan.next()); //nao entendi bem mas o scan.nextFloat nao funcionou e a ide
            // me recomendou essa solucao

            if(nota < 0 || nota > 10){
                System.out.println("Valor inválido");
                break;
            }
        }
    }
}
