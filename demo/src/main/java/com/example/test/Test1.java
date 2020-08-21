package com.example.test;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Chenjl
 * @date 2020/8/19 14:39
 */

public class Test1 {
    public static void main(String[] args) {

        // 使用双冒号::来构造静态函数引用
        Function<String, Integer> fun = Integer::parseInt;
        Integer value = fun.apply("123");
        System.out.println(value);

        // 使用双冒号::来构造非静态函数引用
        String content = "Hello JDK8";
        Function<Integer, String> func = content::substring;
        String result = func.apply(1);
        System.out.println(result);

    }
}
