import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorHora, horasTrabalhadasMes, salarioBruto, descontoIR;
        double INSS, FGTS, salarioLiquido, totalDescontos;

        System.out.print("Digite o valor da hora: R$ ");
        valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadasMes = scanner.nextDouble();

        salarioBruto = valorHora * horasTrabalhadasMes;

        if (salarioBruto <= 900) {
            descontoIR = 0;
            INSS = salarioBruto * 0.1;
            FGTS = salarioBruto * 0.11;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
            INSS = salarioBruto * 0.1;
            FGTS = salarioBruto * 0.11;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.05;
            INSS = salarioBruto * 0.1;
            FGTS = salarioBruto * 0.11;
        } else {
            descontoIR = salarioBruto * 0.05;
            INSS = salarioBruto * 0.1;
            FGTS = salarioBruto * 0.11;
        }

        totalDescontos = descontoIR + INSS;
        salarioLiquido = salarioBruto - descontoIR - INSS;

        System.out.printf("\nSalário Bruto: R$ %.2f.", salarioBruto);
        System.out.printf("\nImposto de Renda: R$ %.2f.", descontoIR);
        System.out.printf("\nINSS: R$ %.2f.", INSS);
        System.out.printf("\nFGTS: R$ %.2f.", FGTS);
        System.out.printf("\nTotal de descontos: R$ %.2f.", totalDescontos);
        System.out.printf("\nSalário Liquido: R$ %.2f.", salarioLiquido);

        scanner.close();
    }
}
