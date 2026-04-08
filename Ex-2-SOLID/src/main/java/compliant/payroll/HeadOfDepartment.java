package compliant.payroll;

import java.time.LocalDate;

public class HeadOfDepartment implements IEmployee {

    private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;
    private final double baseSalary = 5800;
    private final double yearsMultiplier = 50;

    public HeadOfDepartment(LocalDate start, String surname, String name,int id){
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.employmentDate = start;
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
