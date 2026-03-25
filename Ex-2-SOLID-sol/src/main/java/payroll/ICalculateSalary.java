package payroll;

public interface ICalculateSalary {

   
    public double calculateSalaryBeforeTax(IEmployee employee);
    public double calculateSalaryAfterTax(IEmployee employee);

}
