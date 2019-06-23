package replacecondwithpoly;

import replacecondwithpoly.professions.Engineer;
import replacecondwithpoly.professions.Manager;
import replacecondwithpoly.professions.Salesman;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setProfession(new Salesman());
        employee.setExperienceInYears(2);
        employee.pay();

        employee = new Employee();
        employee.setProfession(new Manager());
        employee.setExperienceInYears(5);
        employee.pay();

        employee = new Employee();
        employee.setProfession(new Engineer());
        employee.setExperienceInYears(10);
        employee.pay();


    }
}
