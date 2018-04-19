/** Реализация студента пытающегося найти работу*/
public class Student {
    String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void study(){
        System.out.println("I'm studying. I don't want to work!");
    }
}
