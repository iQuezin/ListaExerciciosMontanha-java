import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUm, numeroDois, numeroTres;

        System.out.print("Digite o primeiro número: ");
        numeroUm = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numeroDois = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        numeroTres = scanner.nextInt();

        int maior = Math.max(Math.max(numeroUm, numeroDois), numeroTres);
        int menor = Math.min(Math.min(numeroUm, numeroDois), numeroTres);

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}
