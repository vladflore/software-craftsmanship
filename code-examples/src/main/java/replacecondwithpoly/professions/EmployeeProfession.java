package replacecondwithpoly.professions;

import replacecondwithpoly.Employee;

public abstract class EmployeeProfession {
    public abstract Profession getProfession();

    public abstract void pay(Employee employee);
}
