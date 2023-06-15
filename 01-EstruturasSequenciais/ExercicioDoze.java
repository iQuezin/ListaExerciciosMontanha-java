//12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
//usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura, peso;

        System.out.print("Informe a sua altura(m): ");
        altura = scanner.nextDouble();

        peso = (72.7 * altura) - 58;
        System.out.printf("Seu peso ideal é %.1fkg.", peso);
        scanner.close();
    }
}
