package com.reflection;
import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args)
            throws ReflectiveOperationException, ClassNotFoundException {

        // 获取输入并转换成class
        String name;
        if (args.length != 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter a class name: ");
            name = in.next();
        }

        // 类的打印
        Class cl = Class.forName(name);

        // 修饰符
        int mod = cl.getModifiers();
        String modifiers = Modifier.toString(mod);
        if (!modifiers.isEmpty()) {
            System.out.print(modifiers + " class");
        }

        // 类名
        System.out.print(" " + name);



        // 是否存在父类
        Class superclass = cl.getSuperclass();
        if (superclass != null && superclass != Object.class) {
            System.out.print(" extends " + superclass.getName());
        }
        System.out.println("{ \n");

        // 打印类里面的所有构造器
        System.out.println("=".repeat(150));
        System.out.println("Constructors");
        System.out.println("=".repeat(150));
        ReflectionTest.printConstructors(cl);

        // 打印类里面的所有方法
        System.out.println("=".repeat(150));
        System.out.println("Methods");
        System.out.println("=".repeat(150));
        ReflectionTest.printMethods(cl);

        // 打印类里面的所有字段
        System.out.println("=".repeat(150));
        System.out.println("Fields");
        System.out.println("=".repeat(150));
        ReflectionTest.printFields(cl);


        System.out.println("}");




    }

    public static void printConstructors(Class cl) {
        Constructor[] cons = cl.getDeclaredConstructors();
        for (Constructor c : cons) {
            String name = c.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (!modifiers.isEmpty()) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            Class[] params = c.getParameterTypes();
            for (int i = 0; i < params.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(params[i].getName());
            }
            System.out.println(");");

        }
    }

    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method method : methods) {
            System.out.print("  ");
            System.out.print(Modifier.toString(method.getModifiers()));
            System.out.print(" " + method.getReturnType());
            System.out.print(" " + method.getName() + "(");
            Class[] types = method.getParameterTypes();
            for (int i = 0; i < types.length; i++) {
                if (i > 0) {System.out.print(", ");}
                System.out.print(types[i]);
            }
            System.out.println(");");

        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            System.out.print("  ");
            System.out.print(Modifier.toString(field.getModifiers()));
            System.out.print(" " + field.getType().getName());
            System.out.print(" " + field.getName());
            System.out.print(";\n");
        }
    }


}
