import java.util.List;

public interface StudentDao {
    Student findById(int id);
    void save(Student stud);
    void update(Student stud);
    void delete(Student stud);
    List<Student> findAll();
}

