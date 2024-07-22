package com.inheritance;


/**
 * JAVA核心技术第五章：继承 编程笔记
 * @author  William
 * @version 1.1
 */
public class ManagerTest {
    /*
       主要内容：
      1. 子类超类(subclass and superclass)
      2. 构造器
      3. 方法的覆盖(inheritance)
      4. 构造方法继承
      5. 多态与动态绑定(polymorphism and dynamic binding)
     */
    public static void main(String[] args) {
        var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        for (Employee e : staff) {
            System.out.println("name: " + e.getName() + ", salary: " + e.getSalary());
        }

    }

}
