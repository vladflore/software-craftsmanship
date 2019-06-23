package replacecondwithpoly.professions;

import replacecondwithpoly.Employee;

public class Salesman extends EmployeeProfession {
    @Override
    public Profession getProfession() {
        return Profession.SALESMAN;
    }

    @Override
    public void pay(Employee employee) {
        System.out.println(String.format("Pay salesman with %d years experience", employee.getExperienceInYears()));
    }
}
