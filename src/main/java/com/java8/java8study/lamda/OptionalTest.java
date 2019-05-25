package com.java8.java8study.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * 功能描述:
 *
 * @author: MR.zt
 * @date: 2019/5/25 17:51
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optionalS = Optional.of("hello");
        Optional<String> optionalS1 = Optional.empty();

//        optionalS.ifPresent(System.out::println);
//        optionalS.ifPresent(item -> System.out.println(item));

//        System.out.println(optionalS1.orElse("傻子"));


        Employee employee1=new Employee("张三");
        Employee employee2=new Employee("梨子");
        Employee employee3=new Employee("红枣");
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);

        Company company=new Company("alibaba",employees);

        Optional<Company> optional=Optional.ofNullable(company);

        System.out.println(
                optional.map(theCompany->theCompany.getEmployees()).orElse(Collections.emptyList())
        );
    }
}
