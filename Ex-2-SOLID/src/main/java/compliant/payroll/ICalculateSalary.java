package compliant.payroll;

public interface ICalculateSalary{

    double calculateSalaryBeforeTaxes(IEmployee employee);
    double calculateSalaryAfterTaxes(IEmployee employee);
}


