import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FazendaDeBichinhos {
    private List<BichinhoVirtualPlus> bichinhos;

    public FazendaDeBichinhos() {
        bichinhos = new ArrayList<>();
    }

    public void adicionarBichinho(BichinhoVirtualPlus bichinho) {
        bichinhos.add(bichinho);
    }

    public void alimentarTodos(int quantidadeComida) {
        for (BichinhoVirtualPlus bichinho : bichinhos) {
            bichinho.alimentar(quantidadeComida);
        }
    }

    public void brincarComTodos(int tempoBrincadeira) {
        for (BichinhoVirtualPlus bichinho : bichinhos) {
            bichinho.brincar(tempoBrincadeira);
        }
    }

    public void ouvirTodos() {
        for (BichinhoVirtualPlus bichinho : bichinhos) {
            System.out.println("Bichinho: " + bichinho.retornarNome());
            System.out.println("Fome: " + bichinho.retornarFome());
            System.out.println("Saúde: " + bichinho.retornarSaude());
            System.out.println("Idade: " + bichinho.retornarIdade());
            System.out.println("Tédio: " + bichinho.retornarTedio());
            System.out.println("Humor: " + bichinho.retornarHumor());
            System.out.println();
        }
    }

    public void simularPassagemDeTempo() {
        for (BichinhoVirtualPlus bichinho : bichinhos) {
            bichinho.alterarFome(bichinho.retornarFome() + 1);
            bichinho.alterarTedio(bichinho.retornarTedio() + 1);
            bichinho.envelhecer();
        }
    }

    public static void main(String[] args) {
        FazendaDeBichinhos fazenda = new FazendaDeBichinhos();
        Random random = new Random();

        fazenda.adicionarBichinho(
                new BichinhoVirtualPlus("Bichinho 1", random.nextInt(10), random.nextInt(10), 0, random.nextInt(10)));
        fazenda.adicionarBichinho(
                new BichinhoVirtualPlus("Bichinho 2", random.nextInt(10), random.nextInt(10), 0, random.nextInt(10)));
        fazenda.adicionarBichinho(
                new BichinhoVirtualPlus("Bichinho 3", random.nextInt(10), random.nextInt(10), 0, random.nextInt(10)));

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Alimentar todos os bichinhos");
            System.out.println("2 - Brincar com todos os bichinhos");
            System.out.println("3 - Ouvir todos os bichinhos");
            System.out.println("4 - Simular passagem de tempo");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quantidade de comida:");
                    int quantidadeComida = scanner.nextInt();
                    fazenda.alimentarTodos(quantidadeComida);
                    break;
                case 2:
                    System.out.println("Tempo de brincadeira:");
                    int tempoBrincadeira = scanner.nextInt();
                    fazenda.brincarComTodos(tempoBrincadeira);
                    break;
                case 3:
                    fazenda.ouvirTodos();
                    break;
                case 4:
                    fazenda.simularPassagemDeTempo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
