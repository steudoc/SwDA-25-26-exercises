package app;
import java.time.LocalDate;

import payroll.*;

public class PayrollManager {

    public static void main(String[] args) {
      

        SalaryCalculator salaryCalculator = new SalaryCalculator();
     

        IEmployee fp = new FullProfessor(LocalDate.of(2005, 03, 1),"Subito", "Giovani",123 );
        System.out.println("Gross monthly salary of " + fp.getSurname() + " : " + salaryCalculator.calculateSalaryBeforeTax(fp));  //print monthly gross salary
        System.out.println("Net monthly salary of " + fp.getSurname() + " : " + salaryCalculator.calculateSalaryAfterTax(fp)); //print monthly net salary
        

        IEmployee ap = new AssociateProfessor(LocalDate.of(2015,04,01 ), "Trapani", "Chiara", 628);
        System.out.println("Gross monthly salary of " + ap.getSurname() + " : " + salaryCalculator.calculateSalaryBeforeTax(ap) );
        System.out.println("Net monthly salary of " + ap.getSurname() + " : " + salaryCalculator.calculateSalaryAfterTax(ap));

        //with change of requirements, extra tax is applied
        IEmployee hod = new HeadOfDepartment(LocalDate.of(1995, 2, 1), "Magno", "Alessandro", 64);
        System.out.println("Gross monthly salary of " + hod.getSurname() + " : " + salaryCalculator.calculateSalaryBeforeTax(hod));
        System.out.println("Net monthly salary of " + hod.getSurname() + " : " + salaryCalculator.calculateSalaryAfterTax(hod));

        //adding researcher
        IEmployee res = new Researcher(LocalDate.of(2025, 2, 1), "Rossi", "Benedetto", 1039);
        System.out.println("Gross monthly salary of " + res.getSurname() + " : " + salaryCalculator.calculateSalaryBeforeTax(res));
        System.out.println("Net monthly salary of " + res.getSurname() + " : " + salaryCalculator.calculateSalaryAfterTax(res));


    }

}
