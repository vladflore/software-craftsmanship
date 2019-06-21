import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Employee().firstName("Vlad").lastName("Flore").age(33),
                new Employee().firstName("Jonh").lastName("Doe").age(25),
                new Employee().firstName("Jane").lastName("Doe").age(30)));

        List<Employee> employeesOlderThanThiry = employees.stream().filter(e -> e.getAge > 30)
                .collect(Collectors.toList());
        System.out.println(employeesOlderThanThiry);
    }
}