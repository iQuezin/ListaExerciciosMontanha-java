import java.util.Scanner;

public class TesteMacaco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro macaco: ");
        String nomeMacaco1 = scanner.nextLine();
        Macaco macaco1 = new Macaco(nomeMacaco1);

        System.out.print("Digite o nome do segundo macaco: ");
        String nomeMacaco2 = scanner.nextLine();
        Macaco macaco2 = new Macaco(nomeMacaco2);

        System.out.println();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Refeição " + i + ":");

            macaco1.comer();

            macaco2.comer();

            System.out.println();

            System.out.println("Estado do estômago de " + nomeMacaco1 + ":");
            macaco1.verBucho();
            System.out.println();

            System.out.println("Estado do estômago de " + nomeMacaco2 + ":");
            macaco2.verBucho();
            System.out.println();

            System.out.println("--------");
        }

        scanner.close();
    }
}