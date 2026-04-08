package violation.payroll;

import java.time.LocalDate;
import java.time.Period;

public class SalaryCalculator implements ICalculate {

    private final double baseSalaryFP = 5000;
    private final double baseSalaryAP = 3000;
    private final double yearsMultiplierFP = 50;
    private final double yearsMultiplierAP = 20;
    private final double extraHoD = 800; 


    @Override
    public double calculateSalary(HeadOfDepartment employee) {
        LocalDate starDate = employee.getDateEmployment();
        Period period = Period.between(starDate, LocalDate.now());
        int years = period.getYears();
        double salary= baseSalaryFP+extraHoD;
        salary+=years*yearsMultiplierFP;
        return salary;
    }

    @Override
    public double calculateSalary(FullProfessor employee) {
        LocalDate starDate = employee.getDateEmployment();
        Period period = Period.between(starDate, LocalDate.now());
        int years = period.getYears();
        double salary= baseSalaryFP+ (years*yearsMultiplierFP);
        return salary;
    }

    @Override
    public double calculateSalary(AssociateProfessor employee) {
        LocalDate starDate = employee.getDateEmployment();
        Period period = Period.between(starDate, LocalDate.now());
        int years = period.getYears();
        double salary= baseSalaryAP+ (years*yearsMultiplierAP);
        return salary;
    }

    @Override
    public double calculateTax(double income) {
        throw new UnsupportedOperationException("Unimplemented method 'calculateTax'");
    }

}
