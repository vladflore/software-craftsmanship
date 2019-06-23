package replacecondwithpoly.professions;

import replacecondwithpoly.Employee;

public class Manager extends EmployeeProfession {
    @Override
    public Profession getProfession() {
        return Profession.MANAGER;
    }

    @Override
    public void pay(Employee employee) {
        System.out.println(String.format("Pay manager with %d years experience.", employee.getExperienceInYears()));
    }
}
