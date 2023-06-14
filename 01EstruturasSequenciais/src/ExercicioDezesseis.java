
//16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados 
//da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados 
//e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades 
//de latas de tinta a serem compradas e o preço total.
import java.util.Scanner;

public class ExercicioDezesseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area, litros, latas, valorFinal;

        System.out.print("Informe a área a ser pintada(m²): ");
        area = scanner.nextDouble();

        litros = area / 3;
        latas = (litros + 17) / 18;
        valorFinal = latas * 80;

        System.out.printf("Serão necessárias %.1f latas.", latas);
        System.out.printf("\nPreço total: R$ %.2f.", valorFinal);
        scanner.close();
    }
}
