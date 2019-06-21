import java.util.*;
import java.util.stream.Collectors;

public class Company {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee().setFirstName("Vlad").setLastName("Flore").setAge(33),
                new Employee().setFirstName("Jonh").setLastName("Doe").setAge(25),
                new Employee().setFirstName("Jane").setLastName("Doe").setAge(30)));

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
        new EmployeeAddress();

        new FindEmployeeAdress();

    }

    List<Employee> getAllEmployeesWhoseFirstNameBeginWithAConstant() {
        return Collections.emptyList();
    }

    List<Employee> getAllEmployeesWhoseLastNameBeginWithAConstant() {
        return Collections.emptyList();
    }

    void copyChars(char c1[], char c2[]) {
    }
}