import java.util.ArrayList;
import java.util.List;

public class ExemploAPI {

    public static void main(String[] args) {
        List< String> alunos = new ArrayList<>();
        alunos.add(" Maria ");
        alunos.add(" Joao ");
        System.out.println("1. aluno : " + alunos.get(0));
        alunos.remove(1);
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
