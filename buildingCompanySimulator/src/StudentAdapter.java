
public class StudentAdapter implements Workable {
    Student student;

    public StudentAdapter(Student student){
        this.student = student;
    }

    public void work(){
        student.study();
    }
}
