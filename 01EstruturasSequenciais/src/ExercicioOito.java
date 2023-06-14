
//8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioHora, horasTrabalhadas, salarioFinal;

        System.out.print("Informe o quanto ganha por hora: ");
        salarioHora = scanner.nextDouble();
        System.out.print("Quantas horas trabalha por mês? ");
        horasTrabalhadas = scanner.nextDouble();

        salarioFinal = salarioHora * horasTrabalhadas;
        System.out.printf("Salário final: R$ %.2f.", salarioFinal);
        scanner.close();
    }
}
