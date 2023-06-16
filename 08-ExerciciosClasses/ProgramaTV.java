import java.util.Scanner;

public class ProgramaTV {
    public static void main(String[] args) {
        TV tv = new TV();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("======= MENU =======");
            System.out.println("1. Alterar canal");
            System.out.println("2. Aumentar volume");
            System.out.println("3. Diminuir volume");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número do canal: ");
                    int canal = scanner.nextInt();
                    tv.setCanal(canal);
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}