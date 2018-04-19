/** Реализация монтажника*/
public class Fitter extends Employer {
    public Fitter(String name, int salary, int year, int month, int day){
        super(name, salary, year, month, day);
        workable = new DoNothing();

    }
}
