//15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
//8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//a) salário bruto;
//b) quanto pagou ao INSS.
//c) quanto pagou ao sindicato.
//d) o salário líquido.
//e) calcule os descontos e o salário líquido, conforme a tabela:

import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioHora, horasTrabalhadas, salarioBruto, inss, impostoRenda, sindicato, salarioLiquido;

        System.out.print("Informe quanto ganha por hora: ");
        salarioHora = scanner.nextDouble();
        System.out.print("Informe quantas horas foram trabalhadas no mês: ");
        horasTrabalhadas = scanner.nextDouble();

        salarioBruto = salarioHora * horasTrabalhadas;
        inss = salarioBruto * 0.08;
        impostoRenda = salarioBruto * 0.11;
        sindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - inss - impostoRenda - sindicato;

        System.out.printf("\nSalário por hora: R$ %.2f.", salarioHora);
        System.out.printf("\nHoras Trabalhadas: %.1fh.", horasTrabalhadas);
        System.out.printf("\nSalário Bruto: R$ %.2f.", salarioBruto);
        System.out.printf("\nImposto de Renda: R$ %.2f.", impostoRenda);
        System.out.printf("\nINSS: R$ %.2f.", inss);
        System.out.printf("\nSindicato: R$ %.2f.", sindicato);
        System.out.printf("\nSalário Liquido: R$ %.2f.", salarioLiquido);

        scanner.close();
    }
}
