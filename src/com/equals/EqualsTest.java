package com.equals;
import com.inheritance.Manager;
import com.inheritance.Employee;

public class EqualsTest {
    public static void main(String[] args) {
        /*
            1. 生成三个Employee，其中两个对象字段相同，另一个变量引用两个中的一个
            2. 分别比较equal函数和==
            3. 生成两个manager，比较两个的哈希和equals
         */

        var alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        var alice2 = alice1;
        var alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        var bob = new Employee("Bob Adams", 75000, 1987, 12, 15);

        System.out.println("alice1.equals(alice2): " + alice1.equals(alice2));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1 == alice2: " + (alice1 == alice2));


        System.out.println("alice1.equals(bob): " + alice1.equals(bob));
        System.out.println("bob.toString(): " + bob);

        var carl = new Manager("Carl Adams", 80000, 1987, 12, 15);
        var boss = new Manager("Carl Adams", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        System.out.println("boss.toString(): " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice2.hashCode(): " + alice2.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}
