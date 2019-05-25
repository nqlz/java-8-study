package com.java8.java8study.lamda;

import java.util.function.Supplier;

/**
 * 功能描述:
 *
 * @author: MR.zt
 * @date: 2019/5/25 11:05
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<Object> supplier = () -> "啥子和哑巴";
        System.out.println(supplier.get());

        Supplier<Person> supplier1 = () -> new Person("李子洲", 12);
        System.out.println(supplier1.get().getUserName());
    }
}
