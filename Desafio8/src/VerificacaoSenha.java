import java.util.Scanner;

public class VerificacaoSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        try {
            verificarSenha(senha);
            System.out.println("Senha válida. Acesso permitido!");
        } catch (SenhaInvalidaException e) {
            System.err.println("Senha inválida. Acesso negado!");
        }
    }

    public static void verificarSenha(String senha) throws SenhaInvalidaException {
        // Verifique aqui as condições da senha
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter no mínimo 8 caracteres.");
        }
        // Adicione outras regras de validação da senha, se necessário
    }
}

class SenhaInvalidaException extends Exception {
    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}

