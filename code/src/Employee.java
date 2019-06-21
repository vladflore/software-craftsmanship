public class Employee {
    private String firstName;
    private String lastName;
    private int age;

    Employee setFirstName(String fn) {
        this.firstName = fn;
        return this;
    }

    Employee setLastName(String ln) {
        this.lastName = ln;
        return this;
    }

    Employee setAge(int age) {
        this.age = age;
        return this;
    }

    int getAge() {
        return this.age;
    }

    boolean isOlderThanThirty() {
        return this.age > 30;
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


