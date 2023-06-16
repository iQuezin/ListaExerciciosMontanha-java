import java.util.Scanner;

public class ExercicioDezenove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        if (numero >= 1000) {
            System.out.println("Número inválido. Digite um número menor que 1000.");

        }

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;

        StringBuilder resultado = new StringBuilder();

        if (centenas > 0) {
            resultado.append(centenas).append(centenas > 1 ? " centenas" : " centena");
            if (dezenas > 0 || unidades > 0) {
                resultado.append(", ");
            }
        }

        if (dezenas > 0) {
            resultado.append(dezenas).append(dezenas > 1 ? " dezenas" : " dezena");
            if (unidades > 0) {
                resultado.append(" e ");
            }
        }

        if (unidades > 0 || numero == 0) {
            resultado.append(unidades).append(unidades > 1 ? " unidades" : " unidade");
        }

        System.out.println(resultado.toString());

        scanner.close();
    }
}
