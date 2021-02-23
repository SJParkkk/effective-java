package edu.item.stream.item45.lazyevaluation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Apps {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10, 20, 30, 40, 50, 60);
        System.out.println(numList.stream()
                .filter(num -> {
                    System.out.println("num < 50");
                    return num < 50;
                })
                .filter(num ->{
                    System.out.println("num < 30");
                    return num < 30;
                })
                .map(num ->{
                    System.out.println("num * 100");
                    return num * 100;
                })
                .collect(Collectors.toList())
        );
    }

}
