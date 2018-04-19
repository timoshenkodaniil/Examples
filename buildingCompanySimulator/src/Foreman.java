/** Реализация прораба*/
public class Foreman extends Employer {
    public Foreman(String name, int salary, int year, int month, int day){
        super(name, salary, year, month, day);
        workable = new DoNothing();
    }
}
