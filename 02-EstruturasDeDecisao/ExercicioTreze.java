import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String diaSemana;

        System.out.print("Digite o dia da semana: ");
        numero = scanner.nextInt();

        switch (numero) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Valor Inválido.";
                break;
        }

        System.out.println("Dia da semana: " + diaSemana);

        scanner.close();
    }
}
