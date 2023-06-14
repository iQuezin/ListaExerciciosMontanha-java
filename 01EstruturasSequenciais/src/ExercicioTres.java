
//30. Faça um Programa que peça dois números e imprima a soma.
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroUm, numeroDois, soma;

        System.out.print("Digite o primeiro número: ");
        numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        numeroDois = scanner.nextDouble();

        soma = numeroUm + numeroDois;
        System.out.print("A soma dos números é: " + soma);
        scanner.close();
    }
}
