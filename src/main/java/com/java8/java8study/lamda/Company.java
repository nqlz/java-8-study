package com.java8.java8study.lamda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 功能描述:
 *
 * @author: MR.zt
 * @date: 2019/5/25 20:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    private String name;
    private List<Employee> employees;
}
