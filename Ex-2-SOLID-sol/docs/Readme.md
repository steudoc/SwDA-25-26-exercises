# SOLID - Exercise 2 - Payroll Management System - SOLUTION

## Implications for additional requirements

The introduction of the additional requirements will implies several changes:

- Add another class for the Researcher employee.
- Add another method in ICalculate interface and SalaryCalculator class for the new type of employee. 
- Add logic to check whether the salary is more than 75000 in TaxCalculator.

These scattered changes are a symptom of bad design, and a consequence of the following violations of SOLID principles.

## Goal 1: Identify SOLID Violations

**Violation of SRP**  - Employees classes (HoD,FP, AP) contains functionalities used by different actors in method getSalaryAfterTax, i.e. salary computation and taxes computation. Employees objects should not be responsible to calculate the taxes on their salary.

**Violation of OCP** - SalaryCalculator class should not be concerned about the type of employee, otherwise it will be affected by any modification on the employee types. Also ICalculate interface has to be changed for modifications of employee types (addition, removal).

**Violation of LSP** - SalaryCalculator and TaxCalculator both implement ICalculate, but neither an object of SalaryCalculator can replace an object of TaxCalculator nor viceversa: behavioral subtyping was not implemented, thus it is not possible to use derived class object to a base class reference. 
 
**Violation of ISP** - The ICalculate interface contains the different contractual API in a single interface. Instead, the calculation of salary and tax should be segregated in different contracts.

**Violation of DIP** - The Employee classes are tightly coupled with TaxCalculator dependency since all employee classes are creating a new instance of TaxCalculator class. Thus any property change in TaxCalculator class requires a change in all classes where the dependency has been tightly coupled. In addition, SalaryCalculator is tightly coupled with the specific employees types.

## Goal 2: Refactoring

**Single Responsibility Principle**  - Employees are no longer responsible for calculating taxes, which is done by TaxCalculator. SalaryCalculator class is only responsible for salary calculation without being concerned about the type of employee.

**Open-Closed Principle** - The addition of a new employee type (Researcher) does not require any changes in SalaryCalculator class except for the addition of a new class of IEmployee type.
The addition of the extra tax requires to change only one class, instead of changing all classes of employees.

**Liskov Substitution Principle** - In the refactored version it is possible to use the same SalaryCalculator logic for any other type of employees: the current base class can be used as a pointer to the derived classes as it is not dependent on the type of Employee. Employees should only be of IEmployee interface type.

**Interface Segregation Principle** - The interface ICalculate has been segregated into ICalculateSalary and ICalculateTax, according to the different responsibilites, giving a clear meaning to the contracts.

**Dependency Inversion Principle** - The dependency of employees classes with TaxCalculator is removed, SalaryCalculator uses a single instance of TaxCalculator. Salary calculator now uses interface IEmployee instead of the specific employee types, thus inverting the dependency.

## TESTS ##
Refactoring the code according to SOLID principles enabled us to change the structure of the tests, avoiding duplicate code and reducing the effort required to add new tests for additional requirements. In the new version, JUnit parameterised tests are used to test multiple professors with one test, eliminating the need for repeated code. This makes it easier and quicker to add more employee types in future.