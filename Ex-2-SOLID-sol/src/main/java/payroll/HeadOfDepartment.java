package payroll;

import java.time.LocalDate;

public class HeadOfDepartment implements IEmployee{

    private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;
   // private TaxCalculator taxCalculator;
    private final double baseSalary = 5800;
    private final double yearsMultiplier = 50;

    public HeadOfDepartment(LocalDate start, String surname, String name,int id){
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.employmentDate = start;
          //  this.taxCalculator = new TaxCalculator();
    }

      public LocalDate getDateEmployment() {
        return this.employmentDate;
    }

     public String getSurname() {
        return this.surname;
    }

    /*
     public double getSalaryAfterTax(double monthlySalary){

        double yearlyIncome = monthlySalary*12;
        double yearlyTax = taxCalculator.calculateTax(yearlyIncome);
        double monthlyTax = yearlyTax /12;
        return monthlySalary - monthlyTax;
        
    }*/

     @Override
     public double getBaseSalary() {
        return this.baseSalary;
     }

     @Override
     public double getYearsMultiplier() {
        return this.yearsMultiplier;
     }
    
}
