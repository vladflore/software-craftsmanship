public class Employee {
    private String firstName;
    private String lastName;
    private int age;

    public Employee firstName(String fn) {
        this.firstName = fn;
        return this;
    }

    public Employee lastName(String ln) {
        this.lastName = ln;
        return this;
    }

    public Employee age(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}


