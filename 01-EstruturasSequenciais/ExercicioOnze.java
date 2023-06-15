
//11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//a) o produto do dobro do primeiro com metade do segundo .
//b) a soma do triplo do primeiro com o terceiro.
//c) o terceiro elevado ao cubo.
import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUm, numeroDois, a;
        double numeroTres, b, c;

        System.out.print("Digite o primeiro número: ");
        numeroUm = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        numeroDois = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        numeroTres = scanner.nextDouble();

        a = (numeroUm * 2) * (numeroDois / 2);
        b = (numeroUm * 3) + numeroTres;
        c = Math.pow(numeroTres, 3);

        System.out.print("a) O produto do dobro do primeiro com metade do segundo = " + a + " .");
        System.out.print("\nb) A soma do triplo do primeiro com o terceiro = " + b + " .");
        System.out.print("\nc) O terceiro elevado ao cubo = " + c + " .");

        scanner.close();
    }
}
