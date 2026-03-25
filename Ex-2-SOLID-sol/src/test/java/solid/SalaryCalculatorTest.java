package solid;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import payroll.*;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {

    private final SalaryCalculator salaryCalculator = new SalaryCalculator();

    static Stream<TestCase> employeeProvider() {
        return Stream.of(
                new TestCase(new FullProfessor(LocalDate.of(2005, 3, 1), "Subito", "Giovani", 123),
                        6050.0, 4098.50),
                new TestCase(new AssociateProfessor(LocalDate.of(2015, 4, 1), "Trapani", "Chiara", 628),
                        3200.0, 2377.33),
                new TestCase(new HeadOfDepartment(LocalDate.of(1995, 2, 1), "Magno", "Alessandro", 64),
                        7350.0, 4766.0), //with change of requirements, extra tax is applied
                        //adding Researcher:
                 new TestCase(new Researcher(LocalDate.of(2025, 2, 1), "Magno", "Alessandro", 64),
                        2015, 1551.55)       
        );
    }

    @ParameterizedTest
    @MethodSource("employeeProvider")
    void testEmployeePayroll(TestCase tc) {
        double grossSalary = salaryCalculator.calculateSalaryBeforeTax(tc.employee);
        double netSalary = salaryCalculator.calculateSalaryAfterTax(tc.employee);

        assertEquals(tc.expectedGross, grossSalary, 0.01,
                "Gross salary mismatch for " + tc.employee.getSurname());
        assertEquals(tc.expectedNet, netSalary, 0.01,
                "Net salary mismatch for " + tc.employee.getSurname());
    }

    private static class TestCase {
        final IEmployee employee;
        final double expectedGross;
        final double expectedNet;

        TestCase(IEmployee employee, double expectedGross, double expectedNet) {
            this.employee = employee;
            this.expectedGross = expectedGross;
            this.expectedNet = expectedNet;
        }
    }
}
