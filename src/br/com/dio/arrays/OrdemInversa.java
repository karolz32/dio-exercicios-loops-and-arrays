package br.com.dio.arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {6, -8, 19, 25, 1, 65};

        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor: ");
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }

}

