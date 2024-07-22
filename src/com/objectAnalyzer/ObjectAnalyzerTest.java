package com.objectAnalyzer;

import java.util.ArrayList;

/**
 * 注意：
 * 如果目标对象有私有字段 直接运行会报错，需要在jvm参数里面添加如下语句：
 * --add-opens
 * java.base/java.util=ALL-UNNAMED
 * --add-opens
 * java.base/java.lang=ALL-UNNAMED
 * --add-opens
 * java.base/jdk.internal.reflect=ALL-UNNAMED
 *
 * 将如上的包打开为无名的模块（详见java模块）
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        var squares = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
