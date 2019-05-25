package com.java8.java8study.lamda;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * 功能描述:
 *
 * @author: MR.zt
 * @date: 2019/5/25 11:22
 */
public class BinaryOperaterTest {

    public static void main(String[] args) {

        System.out.println(compute(2, 5, (a, b) -> a * b));

        System.out.println(getShort("ssshgadfdfs", "sldjkf", (a, b) ->
             a.length()-b.length()
        ));
    }

    public static int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public static String getShort(String a, String b, Comparator<String> comparable) {
        return BinaryOperator.maxBy(comparable).apply(a, b);
    }
}
