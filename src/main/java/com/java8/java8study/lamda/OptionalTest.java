package com.java8.java8study.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * 功能描述:不是函数式接口，而是用于防止 NullPointerException 的漂亮工具
 *
 * @author: MR.zt
 * @date: 2019/5/25 17:51
 */
public class OptionalTest {

    public static void main(String[] args) {
        //of（）：为非null的值创建一个Optional
        Optional<String> optionalS = Optional.of("hello");
        Optional<String> optionalS1 = Optional.empty();
        // isPresent（）： 如果值存在返回true，否则返回false
        //get()：如果Optional有值则将其返回，否则抛出NoSuchElementException
        optionalS.get();
        optionalS.ifPresent(System.out::println);
        //ifPresent（）：如果Optional实例有值则为其调用consumer，否则不做处理
        //Consumer 接口表示要对单个输入参数执行的操作。
        optionalS.ifPresent(item -> System.out.println(item));
        //orElse（）：如果有值则将其返回，否则返回指定的其它值
        System.out.println(optionalS1.orElse("傻子"));

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
