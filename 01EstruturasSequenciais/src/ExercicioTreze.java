
//13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//a) Para homens: (72.7*h) - 58;
//b) Para mulheres: (62.1*h) - 44.7
import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sexo;
        double altura, peso;

        System.out.print("Caso seja do sexo MASCULINO digite 1, se for do sexo FEMININO  digite 2: ");
        sexo = scanner.nextInt();

        if (sexo == 1) {
            System.out.print("Informe a sua altura(m): ");
            altura = scanner.nextDouble();
            peso = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é de %.1fkg.", peso);
        } else if (sexo == 2) {
            System.out.print("Informe a sua altura(m): ");
            altura = scanner.nextDouble();
            peso = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é de %.1fkg.", peso);
        } else {
            System.out.print("O número informado é inválido!");
        }

        scanner.close();
    }
}
