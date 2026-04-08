package compliant.payroll;

import java.time.LocalDate;

public class AssociateProfessor implements IEmployee {

    private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;
    private final double baseSalary = 3000;
    private final double yearsMultiplier = 20;

    public AssociateProfessor(LocalDate employmentDate, String surname, String name, int id) {
        this.employmentDate = employmentDate;
        this.surname = surname;
        this.name = name;
        this.id = id;
    }

    @Override
    public LocalDate getDateEmployment() {
        return this.employmentDate;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public double getBaseSalary() {
        return this.baseSalary;
    }

    @Override 
    public double getYearsMultiplier() {
        return this.yearsMultiplier;
    }

}
