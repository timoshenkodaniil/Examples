import java.util.ArrayList;
import java.util.Arrays;

/** Тестируем работу Строительной компании */
public class BuildingCompanyTest {
    public static void main(String[] args){
        /** Создаем экземпляр биржи труда для найма работников */
        LabourExchange labourExchange = new LabourExchange();
        /** Директора мы не нанимаем */
        Employer director = new Director("Michael", 300000, 2010, 01, 01);

        /** Нанимаем работников используя фабричный метод hireEmployee из биржи труда */
        Employer fitterIvan = labourExchange.hireEmployee("fitter", "Ivan", 50000, 2013, 11, 11 );
        Employer fitterSerg = labourExchange.hireEmployee("fitter", "Serg", 48000, 2016, 04, 20);
        Employer foremanOleg = labourExchange.hireEmployee("foreman", "Oleg", 70000, 2011, 05, 01);
        Employer accountantIrina = labourExchange.hireEmployee("accountant", "Irina", 100000, 2015, 05, 01);
        Employer managerEgor = labourExchange.hireEmployee("manager", "Egor", 100000, 2011, 02, 12);
        Employer designerDaniel = labourExchange.hireEmployee("designer", "Daniel", 50000, 2014, 11, 11);

        /** Добавляем всех сотрудников в общий список */
        ArrayList<Employer> employers = new ArrayList<>();
        employers.add(fitterIvan);
        employers.add(fitterSerg);
        employers.add(foremanOleg);
        employers.add(accountantIrina);
        employers.add(managerEgor);
        employers.add(designerDaniel);

        /** Смотрим что умеет делать Иван и задаем ему задачу штробить стену */
        System.out.println(fitterIvan.getName());
        fitterIvan.performWork();
        fitterIvan.setWorkBehavior(new GrooveWall());
        fitterIvan.performWork();

        /** Принимаем на работу студента по знакомству и используя адаптер пытаемся заставить его работать*/
        Student studentEvgeny = new Student("Evgeny");
        System.out.println(studentEvgeny.getName());
        StudentAdapter studentEvgenyAdapter = new StudentAdapter(studentEvgeny);
        studentEvgenyAdapter.work();

        /** Отправляем всех сотрудников на обед */
        System.out.println();
        for (Employer e : employers){
            System.out.println(e.getName());
            e.setWorkBehavior(new GoToLunch());
            e.performWork();
        }


    }
}
