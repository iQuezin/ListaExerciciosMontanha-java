import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ExercicioDezoito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate data = LocalDate.parse(dataString, formatter);
            System.out.println("A data " + data.format(formatter) + " é válida.");
        } catch (DateTimeParseException e) {
            System.out.println("A data " + dataString + " é inválida.");
        }

        scanner.close();
    }
}