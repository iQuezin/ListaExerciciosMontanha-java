import java.util.Scanner;

public class ExercicioVinteECinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorRespostasPositivas = 0;

        System.out.println("Responda 'sim' ou 'nao' para as perguntas a seguir:");

        System.out.print("Telefonou para a vítima? ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            contadorRespostasPositivas++;
        }

        System.out.print("Esteve no local do crime? ");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            contadorRespostasPositivas++;
        }

        System.out.print("Mora perto da vítima? ");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            contadorRespostasPositivas++;
        }

        System.out.print("Devia para a vítima? ");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            contadorRespostasPositivas++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            contadorRespostasPositivas++;
        }

        System.out.println("\nClassificação:");

        if (contadorRespostasPositivas == 5) {
            System.out.println("Assassino");
        } else if (contadorRespostasPositivas >= 3) {
            System.out.println("Cúmplice");
        } else if (contadorRespostasPositivas >= 2) {
            System.out.println("Suspeita");
        } else {
            System.out.println("Inocente");
        }

        scanner.close();
    }
}
