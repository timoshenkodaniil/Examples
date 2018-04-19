/** Реализация менеджера проекта*/
public class ProjectManager extends Employer {
    public ProjectManager(String name, int salary, int year, int month, int day){
        super(name, salary, year, month, day);
        workable = new DoNothing();
    }
}
