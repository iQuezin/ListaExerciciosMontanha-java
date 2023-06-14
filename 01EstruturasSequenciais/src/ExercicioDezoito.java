//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de 
//um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

import java.util.Scanner;

public class ExercicioDezoito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo em MB: ");
        double arquivoMB = scanner.nextDouble();

        System.out.print("Informe a velocidade da internet em Mbps: ");
        double velocidadeInternet = scanner.nextDouble();

        double velocidadeInternetMBps = velocidadeInternet / 8;
        double tempoAproximadoMin = (int) Math.ceil((arquivoMB / velocidadeInternetMBps) / 60);

        System.out.printf("O tempo estimado para a conclusão do download é de %.0f minutos.", tempoAproximadoMin);

        scanner.close();
    }
}
