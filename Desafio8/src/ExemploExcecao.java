import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploExcecao {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("/test.txt"));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("O arquivo não foi encontrado. Por favor, verifique o caminho e o nome do arquivo.");
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao ler o arquivo.");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.err.println("Ocorreu um erro ao fechar o arquivo.");
            }
        }
    }
}

}
