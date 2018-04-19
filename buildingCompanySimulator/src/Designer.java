/** Реализация проектировщика*/
public class Designer extends Employer {
    public Designer(String name, int salary, int year, int month, int day){
        super(name, salary, year, month, day);
        workable = new DoNothing();
    }
}
