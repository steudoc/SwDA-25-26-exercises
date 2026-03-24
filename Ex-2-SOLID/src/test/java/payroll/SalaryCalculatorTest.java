package payroll;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {

    private final SalaryCalculator salaryCalculator = new SalaryCalculator();

    @Test
    void testFullProfessorSalary() {
        FullProfessor fp = new FullProfessor(LocalDate.of(2005, 3, 1), "Subito", "Giovanni", 123);

        double grossSalary = salaryCalculator.calculateSalary(fp);
        double netSalary = fp.getSalaryAfterTax(grossSalary);

        assertEquals(6050.0, grossSalary, 0.01); //was 6000 exp.
        assertEquals(4098.5, netSalary, 0.01); // was 4033,33 exp.
    }

    @Test
    void testAssociateProfessorSalary() {
        AssociateProfessor ap = new AssociateProfessor(LocalDate.of(2015, 4, 1), "Trapani", "Chiara", 628);

        double grossSalary = salaryCalculator.calculateSalary(ap);
        double netSalary = ap.getSalaryAfterTax(grossSalary);

        assertEquals(3200.0, grossSalary, 0.01);
        assertEquals(2377.33, netSalary, 0.01); //was 3600 exp.
    }

    @Test
    void testHeadOfDepartmentSalary() {
        HeadOfDepartment hod = new HeadOfDepartment(LocalDate.of(1995, 2, 1), "Magno", "Alessandro", 64);

        double grossSalary = salaryCalculator.calculateSalary(hod);
        double netSalary = hod.getSalaryAfterTax(grossSalary);

        assertEquals(7350.0, grossSalary, 0.01);
        assertEquals(4839.5, netSalary, 0.01); //was 4774.33 expect.
    }
}
