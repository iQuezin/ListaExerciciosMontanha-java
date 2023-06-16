//Faça um Programa que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numeroUm = scanner.nextDouble();

        System.out.print("Digite outro número: ");
        double numeroDois = scanner.nextDouble();

        if (numeroUm > numeroDois) {
            System.out.print("Maior número: " + numeroUm);
        } else {
            System.out.print("Maior número: " + numeroDois);
        }

        scanner.close();
    }
}
