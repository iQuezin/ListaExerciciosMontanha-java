//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        System.out.print("Digite uma letra: ");
        letra = scanner.next().charAt(0);

        if (Character.isLetter(letra)) {
            letra = Character.toLowerCase(letra);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("A letra digitada é uma vogal.");
            } else {
                System.out.println("A letra digitada é uma consoante.");
            }
        } else {
            System.out.println("Você não digitou uma letra válida.");
        }

        scanner.close();
    }
}
