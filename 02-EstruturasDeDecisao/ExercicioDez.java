import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char turno;

        System.out.println("Em qual turno você estuda?");
        System.out.println("Digite: M - matutino / V - Vespertino / N - Noturno:");
        turno = scanner.next().toLowerCase().charAt(0);

        switch (turno) {
            case 'm':
                System.out.println("Bom dia!");
                break;

            case 'v':
                System.out.println("Boa tarde!");
                break;

            case 'n':
                System.out.println("Boa noite!");
                break;

            default:
                System.out.println("Digito inválido");
                break;
        }

        scanner.close();
    }
}
