package violation.payroll;

import java.time.LocalDate;

public class HeadOfDepartment {

    private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;
    private TaxCalculator taxCalculator;

    public HeadOfDepartment(LocalDate start, String surname, String name,int id){
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.employmentDate = start;
            this.taxCalculator = new TaxCalculator();
    }

      public LocalDate getDateEmployment() {
        return this.employmentDate;
    }

     public String getSurname() {
        return this.surname;
    }

     public double getSalaryAfterTax(double monthlySalary){

        double yearlyIncome = monthlySalary*12;
        double yearlyTax = taxCalculator.calculateTax(yearlyIncome);
        double monthlyTax = yearlyTax /12;
        return monthlySalary -monthlyTax;
        
    }
    
}
