package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

class Employee implements Measurable {

    private double salary;
    private String name;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public static double average(Measurable[] objects) {
        if (objects == null || objects.length == 0)
            return 0;

        double sum = 0;

        for (Measurable elem: objects) {
            sum += elem.getMeasure();
        }

        return sum / objects.length;
    }

    public static Measurable largest(Measurable[] objects) {
        if (objects == null || objects.length == 0)
            return null;

        double max = 0;
        Measurable emp = null;

        for (Measurable elem: objects) {
            if (max < elem.getMeasure()) {
                max = elem.getMeasure();
                emp = elem;
            }
        }

        return emp;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}