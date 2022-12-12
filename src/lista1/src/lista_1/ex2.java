// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
package lista_1;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite um número: ");
        System.out.println("O número informado foi " + sc1.next());
    }
}