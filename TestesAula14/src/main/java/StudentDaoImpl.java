
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private final List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<>();
    }

    @Override
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void save(Student stud) {
        students.add(stud);
    }
     @Override
    public void update(Student stud) {
        // Nothing to do here since the object is already updated in memory
    }

    @Override
    public void delete(Student stud) {
        students.remove(stud);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }
    
}
    