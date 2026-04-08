package violation.payroll;

import java.time.LocalDate;

public class FullProfessor {

    private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;

    private TaxCalculator taxCalculator;
    
    public FullProfessor(LocalDate employmentDate, String surname, String name, int id) {
        this.employmentDate = employmentDate;
        this.surname = surname;
        this.name = name;
        this.id = id;

        this.taxCalculator = new TaxCalculator();
    }


    public LocalDate getDateEmployment() {
        return this.employmentDate;
    }

    public double getSalaryAfterTax(double monthlySalary){

        double yearlyIncome = monthlySalary*12;
        double yearlyTax = taxCalculator.calculateTax(yearlyIncome);
        double monthlyTax = yearlyTax /12;
        return monthlySalary -monthlyTax;
        
    }


    public String getSurname() {
        return this.surname;
    }
}
