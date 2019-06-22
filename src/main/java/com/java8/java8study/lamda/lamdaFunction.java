package com.java8.java8study.lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * 功能描述:Function 接口接受一个参数并生成结果。默认方法可用于将多个函数链接在一起（compose, andThen）
 *
 * @author: MR.zt
 * @date: 2019/5/23 21:41
 */
public class lamdaFunction {

    public static void main(String[] args) {
        Interface_fun in1 = () -> {
        };
//        System.out.println(in1.getClass().getInterfaces()[0]);
//        new Thread(()->{
//            System.out.println("自定义线程");
//        }).start();

        List<String> strList= Arrays.asList("docto","sth","sss");

//        strList.stream().map(item -> item.toUpperCase()).forEach(item-> System.out.println(item));
//        strList.stream().map(String::toUpperCase).forEach(item-> System.out.println(item));

//        Collections.sort(strList, (String o1,String o2)->{return o2.compareTo(o1);});
//        Collections.sort(strList, Comparator.reverseOrder());

//        Collections.sort(strList,(o1,o2)->o2.compareTo(o1));
//        System.out.println(strList);

        System.out.println(compute2(2,val->{
            Map map=new HashMap();
            map.put("com",String.valueOf("啥子，哑巴"+val));
            return map;
        }));

        System.out.println(compute3(2,val->val*2,val->val*val));
        System.out.println(compute4(2,val->val*2,val->val*val));

    }

    public static int compute(int a, Function<Integer,Integer> function){
        Integer result = function.apply(a);
        return result;
    }
    public static Map compute2(int a, Function<Integer,Map> function){
        Map result = function.apply(a);
        return result;
    }
    public static int compute3(int a, Function<Integer,Integer> function,Function<Integer,Integer> function2){
        return function.compose(function2).apply(a);
    }
    public static int compute4(int a, Function<Integer,Integer> function,Function<Integer,Integer> function2){
        return function.andThen(function2).apply(a);
    }
}

@FunctionalInterface
interface Interface_fun {
    void myMethod();
}

@FunctionalInterface
interface Interface_fun2 {
    void myMethod2();
}