package com.java8.java8study.lamda;

import com.alibaba.fastjson.JSONArray;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * 功能描述:
 *
 * @author: MR.zt
 * @date: 2019/5/25 11:22
 */
public class BinaryOperaterTest {

    public static void main(String[] args) {


        /*System.out.println(compute(2, 5, (a, b) -> a * b));

        System.out.println(getShort("ssshgadfdfs", "sldjkf", (a, b) ->
             a.length()-b.length()
        ));*/

        Person person = new Person("李四", 15);
        Person person1 = new Person("张三", 16);
        List<Person> people = Arrays.asList(person, person1);
//        JSONArray objects = JSONArray.parseArray(people.toString());
        Map<String, Integer> collect = people.stream().collect(Collectors.toMap(item -> item.getUserName(), item -> item.getAge()));
        System.out.println(collect);


    }

    public static int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public static String getShort(String a, String b, Comparator<String> comparable) {
        return BinaryOperator.maxBy(comparable).apply(a, b);
    }
}
