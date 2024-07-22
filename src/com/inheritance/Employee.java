package com.inheritance;
import java.time.*;
import static java.util.Objects.*;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        System.out.println("父类构造器开始");
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
        System.out.println("父类构造器结束：" + this.name);
    }

    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        // 1. 检测地址是否相同
        if (this == otherObject ) {
            return true;
        }
        // 2. 检测是否为空
        if (otherObject == null) {
            return false;
        }
        // 3. 检测类名是否相同
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        // 4. 转换为目标类
        Employee other = (Employee) otherObject;
        // 5. 检测字段值是否相同
        return name.equals(other.name)
                && Double.compare(salary, other.salary) == 0
                && hireDay.equals(other.hireDay);
    }

    @Override
    public int hashCode() {
        return hash(name, salary, hireDay);
    }
}
