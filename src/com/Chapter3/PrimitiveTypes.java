package com.Chapter3;

public class PrimitiveTypes {

    // Java的8个基本数据类型
    public static void main(String[] args) {

        // int 类型： 4字节，32位，-2^31 ~ 2^31-1
        int a = 2147483647;
        // -2147483648
        System.out.println(a + 1);

        // short 类型： 2字节，16位，-2^15 ~ 2^15-1
        short b = 32767;

        // 自动类型转换报错：java: 不兼容的类型: 从int转换到short可能会有损失
        // short c = b + 1;

        // 32769
        // 自动变为int类型?为什么int类型就不可以升成long？
        System.out.println(b + 2);

        // long 类型： 8字节，64位，-2^63 ~ 2^63-1
        long c = 9223372036854775807L;
        // -9223372036854775808
        System.out.println(c + 1);

        // byte 类型： 1字节，8位，-2^8 ~ 2^8-1
        byte d = 127;
        System.out.println(d + 1);


        // float 类型： 4字节，6~7位有效数字 (IEEE754规范)，
        // 有三个预留值： 正无穷，负无穷和NaN
        // https://www.youtube.com/watch?v=8afbTaA-gOQ
        float e = 123.456f;
        System.out.println(e + 2);

        // double 类型： 8字节，15位有效数字
        double f = 123.456;
        System.out.println(f + 2);

        // char类型： 单个字符，可以表达一些Unicode字符 'A' 和 "A" 不同，前者是编码位65的字符常量，后者是字符串
        // char可以表达由4个16进制值组成的Unicode字符

    }
}
