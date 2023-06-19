import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDao studDao = new StudentDaoImpl();

        // Exemplo de uso do DAO
        Student stud = new Student(1, "João");
        studDao.save(stud);

        stud = studDao.findById(1);
        if (stud != null) {
            stud.setName("João Silva");
            studDao.update(stud);
        }

        List<Student> studList = studDao.findAll();
        for (Student s : studList) {
            System.out.println(s.getName());
        }
    }
}