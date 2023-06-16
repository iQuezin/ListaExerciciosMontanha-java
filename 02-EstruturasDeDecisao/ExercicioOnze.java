import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioColaborador, acrescimo, percentual, salarioFinal;

        System.out.print("Salario do colaborador: R$ ");
        salarioColaborador = scanner.nextDouble();

        if (salarioColaborador <= 280) {
            percentual = 0.2;
        } else if (salarioColaborador <= 700) {
            percentual = 0.15;
        } else if (salarioColaborador <= 1500) {
            percentual = 0.1;
        } else {
            percentual = 0.05;
        }

        acrescimo = salarioColaborador * percentual;
        salarioFinal = salarioColaborador + acrescimo;

        System.out.printf("\nSalário antes do reajuste: R$ %.2f;", salarioColaborador);
        System.out.println("\nPercentual aplicado: " + percentual + ";");
        System.out.printf("Total do acrescimo: R$ %.2f;", acrescimo);
        System.out.printf("\nSalário final: R$ %.2f.", salarioFinal);

        scanner.close();
    }
}
