import java.util.Scanner;

public class DivisaoDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        try {
            int resultado = dividirNumeros(numero1, numero2);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro: divisão por zero não é permitida!");
        }
    }

    public static int dividirNumeros(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return numerador / denominador;
    }
}
