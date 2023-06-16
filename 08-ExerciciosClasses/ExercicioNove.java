import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas x e y do ponto inicial do retângulo:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Ponto pontoInicial = new Ponto(x, y);

        System.out.println("Digite a largura do retângulo:");
        int largura = scanner.nextInt();

        System.out.println("Digite a altura do retângulo:");
        int altura = scanner.nextInt();

        RetanguloDois retangulo = new RetanguloDois(pontoInicial, largura, altura);

        boolean sair = false;

        while (!sair) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Alterar valores do retângulo");
            System.out.println("2. Imprimir centro do retângulo");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite as coordenadas x e y do novo ponto inicial:");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    pontoInicial = new Ponto(x, y);

                    System.out.println("Digite a nova largura:");
                    largura = scanner.nextInt();

                    System.out.println("Digite a nova altura:");
                    altura = scanner.nextInt();

                    retangulo.alterarRetangulo(pontoInicial, largura, altura);
                    System.out.println("Valores do retângulo alterados com sucesso.");
                    break;

                case 2:
                    Ponto centro = retangulo.getCentro();
                    System.out.println("Centro do retângulo: (" + centro.getX() + ", " + centro.getY() + ")");
                    break;

                case 3:
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
