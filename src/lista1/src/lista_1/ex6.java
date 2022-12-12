//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
package lista_1;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        double raio = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Raio do circulo: ");
        raio = sc1.nextDouble();
        double area = 2 * Math.PI * raio;
        System.out.println("A area do círculo é: " + area);
        sc1.close();
    }
}
