package compliant.payroll;

import java.time.LocalDate;

public interface IEmployee {
    public LocalDate getDateEmployment();
    public String getSurname();
    public double getBaseSalary();
    public double getYearsMultiplier();
}
