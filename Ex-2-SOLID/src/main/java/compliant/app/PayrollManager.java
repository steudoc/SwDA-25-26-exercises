package compliant.app;
import java.time.LocalDate;

import compliant.payroll.*;

public class PayrollManager {

    public static void main(String[] args) {
      

        SalaryCalculator salaryCalculator = new SalaryCalculator();


        IEmployee fp = new FullProfessor(LocalDate.of(2005, 03, 1),"Subito", "Giovanni",123 );
        System.out.println("Gross monthly salary of " + fp.getSurname() + " : " + salaryCalculator.calculateSalaryBeforeTaxes(fp) );  //print monthly gross salary
        System.out.println("Net monthly salary of " + fp.getSurname() + " : " + salaryCalculator.calculateSalaryAfterTaxes(fp)); //print monthly net salary
        

        IEmployee ap = new AssociateProfessor(LocalDate.of(2015,04,01 ), "Trapani", "Chiara", 628);
        System.out.println("Gross monthly salary of " + ap.getSurname() + " : " + salaryCalculator.calculateSalaryBeforeTaxes(fp) );  //print monthly gross salary
        System.out.println("Net monthly salary of " + ap.getSurname() + " : " + salaryCalculator.calculateSalaryAfterTaxes(fp)); //print monthly net salary

        HeadOfDepartment hod = new HeadOfDepartment(LocalDate.of(1995, 2, 1), "Magno", "Alessandro", 64);
        System.out.println("Gross monthly salary of " + hod.getSurname() + " : " + salaryCalculator.calculateSalaryBeforeTaxes(fp) );  //print monthly gross salary
        System.out.println("Net monthly salary of " + hod.getSurname() + " : " + salaryCalculator.calculateSalaryAfterTaxes(fp)); //print monthly net salary

    }

}
