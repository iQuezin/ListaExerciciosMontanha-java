
//2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextDouble();
        System.out.print("O número informado é: " + numero);

        scanner.close();
    }
}
