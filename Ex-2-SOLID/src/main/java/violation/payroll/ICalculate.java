package violation.payroll;

public interface ICalculate{

    double calculateSalary(HeadOfDepartment employee);
    double calculateSalary(FullProfessor employee);
    double calculateSalary(AssociateProfessor employee);
    double calculateTax(double income);
}


