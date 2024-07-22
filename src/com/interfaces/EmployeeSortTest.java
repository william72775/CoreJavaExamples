package com.interfaces;


import java.util.Arrays;
import static java.util.Arrays.sort;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("William Programmer", 100000, 1990, 3, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
        sort(staff);
        System.out.println(Arrays.toString(staff));
    }
}
