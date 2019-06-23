import enums.Gender;
import enums.SeniorityLevel;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Company {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee().setFirstName("Vlad").setLastName("Flore").setAge(33).setGender(Gender.MALE).setSeniorityLevel(SeniorityLevel.SENIOR),
                new Employee().setFirstName("Jonh").setLastName("Doe").setAge(25).setGender(Gender.MALE).setSeniorityLevel(SeniorityLevel.JUNIOR),
                new Employee().setFirstName("Jane").setLastName("Doe").setAge(30).setGender(Gender.FEMALE).setSeniorityLevel(SeniorityLevel.SENIOR)));

        List<Employee> employeesOlderThanThirty = employees
                .stream()
                .filter(Employee::isOlderThanThirty)
                .collect(Collectors.toList());

        System.out.println(employeesOlderThanThirty);

        employeesOlderThanThirty = employees
                .stream()
                .filter(employee -> employee.getAge() > 30)
                .collect(Collectors.toList());

        System.out.println(employeesOlderThanThirty);

        Set<Employee> employeeSet = new HashSet<>();

        new Employee();
        new EmployeeData();
        new EmployeeInfo();

        Shape square = new Square();
        IShape square1 = new Square();

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        List<Employee> allEmployees = employeeDao.fetchAllEmployess();

        new Square();

        new FindEmployeeAdress();

        new EmployeeAddress();
        new JuniorEmployee();
        new AssociateEmployee();
        new AdvancedEmployee();
        new SeniorEmployee();
        new PrincipalEmployee();
        new SeniorPrincipalEmployee();

        new EmployeeAccountVisitor();

    }

    List<Employee> getAllEmployeesWhoseFirstNameBeginWithAConstant() {
        return Collections.emptyList();
    }

    List<Employee> getAllEmployeesWhoseLastNameBeginWithAConstant() {
        return Collections.emptyList();
    }

    void copyChars(char c1[], char c2[]) {
    }

    public List<Employee> findSeniorEmployeesAndCalculateAverageSeniority() {
        List<Employee> seniorEmployees = new ArrayList<>();

        return seniorEmployees;
    }

    public List<Employee> findSeniorFemaleEmployees(List<Employee> employees) {
        Assert.notEmpty(employees, "There are no employees.");
        return employees.stream().filter(this::isSenior).filter(this::isFemale)
                .collect(Collectors.toList());
    }

    public boolean isSenior(Employee employee) {
        Assert.notNull(employee, "Employee does not exist.");
        return employee.getSeniorityLevel() == SeniorityLevel.SENIOR;
    }

    public boolean isFemale(Employee employee) {
        Assert.notNull(employee, "Employee does not exist.");
        return employee.getGender() == Gender.FEMALE;
    }

    public void throwExceptionIfNoEmployees(List<Employee> employees) {
        if (CollectionUtils.isEmpty(employees)) {
            throw new NoEmployeesException("There are no employees");
        }
    }

    public boolean isSeniorFemaleEmployee(Employee employee) {
        Assert.notNull(employee, "Employee does not exist.");
        return employee.getSeniorityLevel() == SeniorityLevel.SENIOR && employee.getGender() == Gender.FEMALE;
    }
}


