package br.com.dio.arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6]; //cria o vetor com 6 espacos
        int quantConsoantes = 0; //variavel que vai guardar a quantidade de consoantes

        int count = 0; //contador do loop
        do {
            System.out.println("Letra: ");
            String letra = scan.next(); //variavel que receber a entrada

            if (!(letra.equalsIgnoreCase("a") |    //se a letra for diferente (!) de vogais entra no if
                    letra.equalsIgnoreCase("e") |  //equalsIgnoreCase faz uma comparacao pra ver se letra
                    letra.equalsIgnoreCase("i") |  //e igual a anotherString ignorando se esta maiuscula ou
                    letra.equalsIgnoreCase("o") |  //minuscula
                    letra.equalsIgnoreCase("u"))) {
                consoantes [count] = letra;   //o vetor recebe a letra se passa no teste do if
                quantConsoantes++;  //incrementa 1 a quantidade de consoantes
            }
            count++;  //incrementa o contador


        } while (count < consoantes.length);  //loop que ira ate o contador for menor que o tamanho do vetor

        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {    //foreach que varrera o vetor em busca dos null
            if ( consoante != null)    //se consoante for diferente de null (espacos onde entrariam vogais) ele ira pra saida
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantConsoantes);
    }
}
