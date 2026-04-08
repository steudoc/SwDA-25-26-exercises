package violation.app;
import java.time.LocalDate;

import violation.payroll.*;

public class PayrollManager {

    public static void main(String[] args) {
      

        SalaryCalculator salaryCalculator = new SalaryCalculator();
         double monthlySalaryTemp = 0; 

        FullProfessor fp = new FullProfessor(LocalDate.of(2005, 03, 1),"Subito", "Giovanni",123 );
        monthlySalaryTemp = salaryCalculator.calculateSalary(fp); //compute monthly gross salary 
        System.out.println("Gross monthly salary of " + fp.getSurname() + " : " + monthlySalaryTemp );  //print monthly gross salary
        System.out.println("Net monthly salary of " + fp.getSurname() + " : " + fp.getSalaryAfterTax(monthlySalaryTemp)); //print monthly net salary
        

        AssociateProfessor ap = new AssociateProfessor(LocalDate.of(2015,04,01 ), "Trapani", "Chiara", 628);
        monthlySalaryTemp = salaryCalculator.calculateSalary(ap);
        System.out.println("Gross monthly salary of " + ap.getSurname() + " : " + monthlySalaryTemp );
        System.out.println("Net monthly salary of " + ap.getSurname() + " : " + ap.getSalaryAfterTax(monthlySalaryTemp));

        HeadOfDepartment hod = new HeadOfDepartment(LocalDate.of(1995, 2, 1), "Magno", "Alessandro", 64);
        monthlySalaryTemp = salaryCalculator.calculateSalary(hod);
        System.out.println("Gross monthly salary of " + hod.getSurname() + " : " + monthlySalaryTemp );
        System.out.println("Net monthly salary of " + hod.getSurname() + " : " + hod.getSalaryAfterTax(monthlySalaryTemp));

    }

}
