import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número inteiro:");
            int numero = scanner.nextInt();
            System.out.println("O número digitado é: " + numero);
        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
    }
}
