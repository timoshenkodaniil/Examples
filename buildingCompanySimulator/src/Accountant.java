/** Реализация бухгалтера*/
public class Accountant extends Employer {
    public Accountant(String name, int salary, int year, int month, int day){
        super(name, salary, year, month, day);
        workable = new DoNothing();
    }
}
