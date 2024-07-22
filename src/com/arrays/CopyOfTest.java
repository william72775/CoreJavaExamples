package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 使用反射机制拷贝数组对象
 */
public class CopyOfTest {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = (int[]) CopyOfTest.goodCopyOf(a, 10);
        System.out.println(Arrays.toString(b));
    }

    /**
     * This method attempts to grow an array by allocating a new array of the same type
     * and coping all elements.
     * @param a the array to grow. This can be an object array or a primitive type array
     * @param newLength
     * @return a larger array that contains all elements of a.
     */
    public static Object goodCopyOf(Object a, int newLength){
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, length);
        return newArray;
    }
}
