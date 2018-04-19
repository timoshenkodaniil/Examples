import java.time.LocalDate;

/** Абстрактный класс реализующий работника*/
public abstract class Employer {
    Workable workable;
    /** поле хранящее значение зарплаты */
    int salary;
    /** поле хранящее имя */
    String name;
    /** поле хранящее дату приема на работу */
    LocalDate hireDate;
    /** конструктор класса Employer */
    public Employer(String name, int salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    /** метод позволяющий объекту Employer делегировть поведение объекту
     *  на который ссылается переменная workable*/
    public void performWork(){
        workable.work();
    }
    /** метод возвращающий имя работника*/
    public String getName(){
        return name;
    }
    /** метод возвращающий величину зарплаты*/
    public int getSalary(){
        return salary;
    }
    /** метод позволяющий динамически изменять поведение объекта Employer*/
    public void setWorkBehavior(Workable workBehavior){
        workable = workBehavior;
    }
}
