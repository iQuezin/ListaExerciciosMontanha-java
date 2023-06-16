import java.util.Scanner;

public class ExercicioDezesseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, raizDelta, raizX1, raizX2;

        System.out.print("Informe (a): ");
        a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Esta não é uma equação de segundo grau.");
        } else {
            System.out.print("Informe (b): ");
            b = scanner.nextDouble();

            System.out.print("Informe (c): ");
            c = scanner.nextDouble();

            delta = (Math.pow(b, 2)) - (4 * a * c);
            raizDelta = Math.sqrt(delta);

            if (delta < 0) {
                System.out.println("A equação não possui raizes reais");
            } else if (delta == 0) {
                raizX1 = (-b + raizDelta) / (2 * a);
                System.out.println("Essa equação possui apenas uma raiz real:");
                System.out.println("Raiz: " + raizX1);
            } else {
                raizX1 = (-b + raizDelta) / (2 * a);
                raizX2 = (-b - raizDelta) / (2 * a);
                System.out.println("Raiz 1: " + raizX1);
                System.out.println("Raiz 2: " + raizX2);
            }
        }

        scanner.close();
    }
}
