package replacecondwithpoly;

import replacecondwithpoly.professions.EmployeeProfession;

public class Employee {

    private int experienceInYears;

    private EmployeeProfession profession;

    public EmployeeProfession getProfession() {
        return profession;
    }

    public void setProfession(EmployeeProfession profession) {
        this.profession = profession;
    }

    public void pay() {
        this.getProfession().pay(this);
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}
