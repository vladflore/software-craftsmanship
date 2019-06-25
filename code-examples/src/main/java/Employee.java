import enums.Gender;
import enums.SeniorityLevel;

/**
 * The Employee class.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int age;


    /**
     * The gender of the employee
     */
    private Gender gender;


    private SeniorityLevel seniorityLevel;

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

    Employee setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    Employee setSeniorityLevel(SeniorityLevel seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
        return this;
    }

    SeniorityLevel getSeniorityLevel() {
        return this.seniorityLevel;
    }

    /**
     * Get gender.
     *
     * @return the Gender
     */
    Gender getGender() {
        return this.gender;
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


