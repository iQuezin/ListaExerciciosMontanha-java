// Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área
//a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é 
//vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//a. comprar apenas latas de 18 litros;
//b.comprar apenas galões de 3,6 litros;
//c. misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre 
//arredonde os valores para cima, isto é, considere latas cheias.

import java.util.Scanner;
import java.lang.Math;

public class ExercicioDezessete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        int areaASerPintada = scanner.nextInt();

        double quantidadeTinta = areaASerPintada / 6.0;
        quantidadeTinta = Math.ceil(quantidadeTinta);

        int quantidadeLatas18Litros = (int) Math.ceil(quantidadeTinta / 18);
        double precoLatas18Litros = quantidadeLatas18Litros * 80.0;

        int quantidadeGaloes3_6Litros = (int) Math.ceil(quantidadeTinta / 3.6);
        double precoGaloes3_6Litros = quantidadeGaloes3_6Litros * 25.0;

        int quantidadeLatas18LitrosMisturadas = (int) (quantidadeTinta / 18);
        int quantidadeGaloes3_6LitrosMisturados = (int) Math.ceil((quantidadeTinta % 18) / 3.6);
        double precoMisturado = (quantidadeLatas18LitrosMisturadas * 80.0)
                + (quantidadeGaloes3_6LitrosMisturados * 25.0);

        System.out.println("Quantidade de tinta a ser comprada:");
        System.out.println("\nApenas latas de 18 litros: " + quantidadeLatas18Litros + " latas");
        System.out.printf("Preço: R$ %.2f", precoLatas18Litros);
        System.out.println();
        System.out.println("\nApenas galões de 3,6 litros: " + quantidadeGaloes3_6Litros + " galões");
        System.out.printf("Preço: R$ %.2f", precoGaloes3_6Litros);
        System.out.println();
        System.out.println("\nMisturando latas e galões:");
        System.out.println("Latas de 18 litros: " + quantidadeLatas18LitrosMisturadas + " latas");
        System.out.println("Galões de 3,6 litros: " + quantidadeGaloes3_6LitrosMisturados + " galões");
        System.out.printf("Preço: R$ %.2f", precoMisturado);

        scanner.close();
    }
}
