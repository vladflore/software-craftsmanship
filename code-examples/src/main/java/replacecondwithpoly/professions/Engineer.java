package replacecondwithpoly.professions;

import replacecondwithpoly.Employee;

public class Engineer extends EmployeeProfession {
    @Override
    public Profession getProfession() {
        return Profession.ENGINEER;
    }

    @Override
    public void pay(Employee employee) {
        System.out.println(String.format("Pay engineer with %d years experience.", employee.getExperienceInYears()));
    }
}
