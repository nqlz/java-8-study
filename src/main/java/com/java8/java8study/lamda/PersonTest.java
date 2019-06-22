package com.java8.java8study.lamda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 功能描述:
 *
 * @author: MR.zt
 * @date: 2019/5/23 23:51
 */
public class PersonTest {


    public static void main(String[] args) {

        Person person1 = new Person("张三", 11);
        Person person2 = new Person("李四", 23);
        Person person3 = new Person("王五", 65);
        Person person4 = new Person("小强", 33);
        Person person5 = new Person("旺财", 22);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);
        List<Boolean> ss = personList.stream().map(item ->
                item.getUserName().equals("旺财")
        ).collect(Collectors.toList());
        personList.stream().map(item ->
                {
                    item.setAge(88);
                    return item;
                }
        ).forEach(it -> System.out.println(it));

        System.out.println(personList);

//        Collection<Person> collect = personList.stream().filter(person -> person.getAge() < 30)
//                .collect(Collectors.toList());

//        System.out.println(collect);
//        System.out.println(getPersonByAge(30,personList));;
    }

    public static List<Person> getPersonByAge(Integer age, List<Person> personList) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageParam, personsParam) -> {
            return personsParam.stream().filter(person -> person.getAge() > ageParam).collect(Collectors.toList());
        };
        return biFunction.apply(age, personList);
    }


}
