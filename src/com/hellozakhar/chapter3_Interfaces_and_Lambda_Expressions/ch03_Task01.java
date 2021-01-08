/* Provide an interface Measurable with a method double getMeasure()
 * that measures an object in some way.
 * Make Employee implement Measurable.
 * Provide a method double average(Measurable[] objects)
 * that computes the average measure.
 * Use it to compute the average salary of an array of employees. */

package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

public class ch03_Task01 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee(10000),
                new Employee(5000),
                new Employee(12500),
                new Employee(18000)
        };
        System.out.println("avg salary of emp's: " + Employee.average(employees));
    }
}