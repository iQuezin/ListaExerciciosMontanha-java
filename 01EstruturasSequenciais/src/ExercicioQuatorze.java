
//14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
//Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
//deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e 
//calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. 
//Imprima os dados do programa com as mensagens adequadas.
import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, excesso, multa;

        System.out.print("Digite o peso total: ");
        peso = scanner.nextDouble();

        excesso = peso - 50;
        multa = excesso * 4;
        System.out.printf("Peso total: %.2fkg.", peso);
        System.out.printf("\nExcesso: %.2fkg.", excesso);
        System.out.printf("\nMulta a pagar: R$ %.2f.", multa);

        scanner.close();
    }
}
