//Faça um Programa que peça dois números e imprima a soma.
package lista_1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int soma = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        i = sc1.nextInt();
        j = sc1.nextInt();
        soma = i + j;
        System.out.println("O resultado da soma é " + soma);
    }
}
