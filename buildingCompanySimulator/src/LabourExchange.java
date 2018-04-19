/** Реализация биржи труда представляющая собой простую фабрику*/
public class LabourExchange {
    public Employer hireEmployee(String profession, String name, int salary, int year, int month, int day){
        Employer employer = null;

        if (profession.equalsIgnoreCase("accountant")){
            employer = new Accountant(name, salary , year, month, day);
        } else if (profession.equalsIgnoreCase("designer")){
            employer = new Designer(name, salary , year, month, day);
        } else if (profession.equalsIgnoreCase("fitter")){
            employer = new Fitter(name, salary , year, month, day);
        } else if (profession.equalsIgnoreCase("foreman")){
            employer = new Foreman(name, salary , year, month, day);
        } else if (profession.equalsIgnoreCase("manager") ||
                profession.equalsIgnoreCase("project manager")){
            employer = new ProjectManager(name, salary , year, month, day);
        }
        return employer;
    }
}
