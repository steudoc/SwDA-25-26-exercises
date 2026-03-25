package payroll;

import java.time.LocalDate;

public class Researcher implements IEmployee{

     private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;
    private final double baseSalary = 2000;
    private final double yearsMultiplier = 15;

    //private TaxCalculator taxCalculator;

    public Researcher(LocalDate employmentDate, String surname, String name, int id){
        this.employmentDate = employmentDate;
        this.surname = surname;
        this.name = name;
        this.id = id;
        //this.taxCalculator = new TaxCalculator();
    }

    @Override
    public LocalDate getDateEmployment() {
        return this.employmentDate;
    }

   /* 
    public double getSalaryAfterTax(double monthlySalary) {
        double yearlyIncome = monthlySalary*12;
        double yearlyTax = taxCalculator.calculateTax(yearlyIncome);
        double monthlyTax = yearlyTax /12;
        return monthlySalary -monthlyTax;
    }*/

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
