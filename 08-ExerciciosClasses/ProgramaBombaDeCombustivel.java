import java.util.Scanner;

public class ProgramaBombaDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma instância da classe BombaDeCombustivel
        BombaDeCombustivel bomba = new BombaDeCombustivel("Gasolina", 4.5, 1000);

        // Menu principal
        int opcao = 0;
        do {
            System.out.println("=== BOMBA DE COMBUSTÍVEL ===");
            System.out.println("1. Abastecer por valor");
            System.out.println("2. Abastecer por litro");
            System.out.println("3. Alterar valor do litro");
            System.out.println("4. Alterar tipo de combustível");
            System.out.println("5. Alterar quantidade de combustível");
            System.out.println("0. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser abastecido: ");
                    double valorAbastecido = scanner.nextDouble();
                    bomba.abastecerPorValor(valorAbastecido);
                    break;
                case 2:
                    System.out.print("Digite a quantidade em litros de combustível: ");
                    double litrosAbastecidos = scanner.nextDouble();
                    bomba.abastecerPorLitro(litrosAbastecidos);
                    break;
                case 3:
                    System.out.print("Digite o novo valor do litro: ");
                    double novoValor = scanner.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    System.out.print("Digite o novo tipo de combustível: ");
                    String novoCombustivel = scanner.next();
                    bomba.alterarCombustivel(novoCombustivel);
                    break;
                case 5:
                    System.out.print("Digite a nova quantidade de combustível: ");
                    double novaQuantidade = scanner.nextDouble();
                    bomba.alterarQuantidadeCombustivel(novaQuantidade);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
