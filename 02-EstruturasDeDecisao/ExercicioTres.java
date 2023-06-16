//Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sexo;

        System.out.print("Informe o seu sexo:");
        System.out.print("\nDigite F para feminimo e M para masculino: ");
        sexo = scanner.next().toUpperCase().charAt(0);

        switch (sexo) {
            case 'F':
                System.out.println("Sexo feminino.");
                break;
            case 'M':
                System.out.println("Sexo masculino.");
                break;
            default:
                System.out.println("Sexo invalido.");
                break;
        }

        scanner.close();
    }
}
