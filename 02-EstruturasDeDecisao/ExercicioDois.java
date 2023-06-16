//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("O valor digitado é positivo.");
        } else if (valor == 0) {
            System.out.println("O valor digitado é neutro.");
        } else {
            System.out.println("O valor digitado é negativo.");
        }

        scanner.close();
    }
}
