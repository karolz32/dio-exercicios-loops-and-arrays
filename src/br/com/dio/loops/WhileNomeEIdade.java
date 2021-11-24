package br.com.dio.loops;

import java.util.Scanner;

public class WhileNomeEIdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0")){
                break;
            }

            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("O nome é " + nome + " e a idade é " + idade);
        }



    }
}
