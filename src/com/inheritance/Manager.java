package com.inheritance;
import static java.util.Objects.*;

public class Manager extends Employee{

    private double bonus;
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        System.out.println("子类构造器开始");
        this.bonus = 0;
        System.out.println("子类构造器结束" + this.getName());
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + this.bonus + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }

        Manager otherManager = (Manager) otherObject;
        return this.bonus == otherManager.bonus;
    }

    @Override
    public int hashCode() {
        return hash(super.hashCode(), bonus);
    }

}
