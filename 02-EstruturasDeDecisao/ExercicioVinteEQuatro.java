import java.util.Scanner;

public class ExercicioVinteEQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operacoes, raiz;
        double numeroUm, numeroDois, resultado, resto;
        String parImpar, positivoNegativo, inteiroDecimal;

        System.out.println("Qual opreação deseja fazer?");
        System.out.print("+ | - | * | / | r(raiz) | ^(potências): ");
        operacoes = scanner.next().charAt(0);

        boolean verdadeiro = (operacoes == '+' || operacoes == '-' || operacoes == '*' || operacoes == '/'
                || operacoes == 'r' || operacoes == '^');
        resultado = 0;

        if (verdadeiro == true) {
            switch (operacoes) {
                case '+':
                    System.out.print("Digite o primeiro número: ");
                    numeroUm = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numeroDois = scanner.nextDouble();

                    resultado = numeroUm + numeroDois;
                    break;

                case '-':
                    System.out.print("Digite o primeiro número: ");
                    numeroUm = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numeroDois = scanner.nextDouble();

                    resultado = numeroUm - numeroDois;
                    break;

                case '*':
                    System.out.print("Digite o primeiro número: ");
                    numeroUm = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numeroDois = scanner.nextDouble();

                    resultado = numeroUm * numeroDois;
                    break;

                case '/':
                    System.out.print("Digite o primeiro número: ");
                    numeroUm = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numeroDois = scanner.nextDouble();

                    resultado = numeroUm / numeroDois;
                    break;

                case 'r':
                    System.out.println("Qual raiz deseja fazer?");
                    System.out.print("Quadrada (2) / Cúbica (3): ");
                    raiz = scanner.next().charAt(0);
                    if (raiz == '2') {
                        System.out.print("Digite o número: ");
                        numeroUm = scanner.nextDouble();
                        resultado = Math.sqrt(numeroUm);
                    } else if (raiz == '3') {
                        System.out.print("Digite o número: ");
                        numeroUm = scanner.nextDouble();
                        resultado = Math.cbrt(numeroUm);
                    }
                    break;

                case '^':
                    System.out.print("Digite o número: ");
                    numeroUm = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    numeroDois = scanner.nextDouble();

                    resultado = Math.pow(numeroUm, numeroDois);
                    break;

                default:
                    System.out.println("O operador digitado é inválido.");
            }

            resto = resultado % 2;

            if (resto == 0) {
                parImpar = "par";
            } else {
                parImpar = "ímpar";
            }

            if (resultado >= 0) {
                positivoNegativo = "positivo";
            } else {
                positivoNegativo = "negativo";
            }

            if (ehInteiro(resultado)) {
                inteiroDecimal = "inteiro.";
            } else {
                inteiroDecimal = "decimal.";
            }

            System.out.println("Resultado: " + resultado);
            System.out.println("O número é: " + parImpar + ", " + positivoNegativo + " e " + inteiroDecimal);

        } else {
            System.out.println("Tente novamente mais tarde.");
        }

        scanner.close();
    }

    public static boolean ehInteiro(double resultado) {
        return resultado == Math.round(resultado);
    }

}
