import java.util.Scanner;

public class CalculadoraPisosRodapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as medidas do local:");
        System.out.print("Comprimento: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Largura: ");
        double largura = scanner.nextDouble();

        Retangulo local = new Retangulo();
        local.setLados(comprimento, largura);

        double area = local.calcularArea();
        double perimetro = local.calcularPerimetro();

        double areaPiso = 0.5 * 0.5;
        int quantidadePisos = (int) Math.ceil(area / areaPiso);

        double comprimentoRodape = perimetro;
        int quantidadeRodapes = (int) Math.ceil(comprimentoRodape);

        System.out.println("\nQuantidade de pisos necessários: " + quantidadePisos);
        System.out.println("Quantidade de rodapés necessários: " + quantidadeRodapes);

        scanner.close();
    }
}