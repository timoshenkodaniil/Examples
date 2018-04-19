/** Реализация директора*/
public class Director extends Employer {
    public Director(String name, int salary, int year, int month, int day){
        super(name, salary, year, month, day);
        workable = new ManageCompany();
    }
}
