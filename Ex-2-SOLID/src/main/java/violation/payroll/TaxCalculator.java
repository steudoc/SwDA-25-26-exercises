package violation.payroll;

public class TaxCalculator implements ICalculate{

    // as it works in Italy 
    private static final double RATE_1 = 0.23; // Up to 28,000 €
    private static final double RATE_2 = 0.33; // From 28,001 € to 50,000 €
    private static final double RATE_3 = 0.43; // Over 50,000 €

    private static final double LIMIT_1 = 28000;
    private static final double LIMIT_2 = 50000;


     @Override
    public double calculateTax(double yearlyIncome) {
         double taxes = 0;

        if (yearlyIncome <= LIMIT_1) {
            taxes = yearlyIncome * RATE_1;
        } else if (yearlyIncome <= LIMIT_2) {
            taxes = (LIMIT_1 * RATE_1) + ((yearlyIncome - LIMIT_1) * RATE_2);
        } else {
            taxes = (LIMIT_1 * RATE_1) + ((LIMIT_2 - LIMIT_1) * RATE_2) + ((yearlyIncome - LIMIT_2) * RATE_3);
        }

        return taxes;
       
    }

    @Override
    public double calculateSalary(HeadOfDepartment employee) {
     
        throw new UnsupportedOperationException("Unimplemented method 'calculateSalary'");
    }

    @Override
    public double calculateSalary(FullProfessor employee) {
     
        throw new UnsupportedOperationException("Unimplemented method 'calculateSalary'");
    }

    @Override
    public double calculateSalary(AssociateProfessor employee) {
     
        throw new UnsupportedOperationException("Unimplemented method 'calculateSalary'");
    }

   


}
