package com.java8.java8study.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 功能描述:
 *
 * @author: MR.zt
 * @date: 2019/5/25 9:43
 */
public class PridicateTest {

    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 4;

//        System.out.println(predicate.test("哈哈哈哈22"));;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> result = conditionFilter(list, item -> item % 2 == 0, item -> item > 2);
        System.out.println(result);

    }

    public static List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(item ->
                predicate.test(item)
        ).collect(Collectors.toList());
    }

    public static List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        return list.stream().filter(item ->
                predicate.or(predicate2).negate().test(item)
        ).collect(Collectors.toList());
    }

}
