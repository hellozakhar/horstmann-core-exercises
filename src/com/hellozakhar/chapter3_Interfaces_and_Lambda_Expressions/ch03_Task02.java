/* Continue with the preceding exercise and provide
 * a method Measurable largest(Measurable[] objects).
 * Use it to find the name of the employee with the largest salary.
 * Why do you need a cast? */

package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

public class ch03_Task02 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee(10000, "Joe"),
                new Employee(5000, "Anastasia"),
                new Employee(12500, "Bob"),
                new Employee(18000, "Kevin")
        };
        System.out.println("emp with largest salary: " + Employee.largest(employees));
    }
}