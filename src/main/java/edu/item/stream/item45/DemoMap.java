package edu.item.stream.item45;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Set<String>> test = new HashMap<>();
        Set<String> element = new HashSet<>();
        element.add("staple");
        element.add("petals");
        test.put("aelpst", element);
        System.out.println(test);
        System.out.println("=====================");

        List<String> testMethod = Arrays.asList("ab", "AB", "b","c","d");
        Map<String, Set<String>> test1 = new HashMap<>();
        for (String s : testMethod) {
            test1.computeIfAbsent(s.toLowerCase(), s1 -> new TreeSet<>()).add(s);
        }
        System.out.println(test1);
        List<Integer> integers = Arrays.asList(1,2,3,4,1,2,11,22,33,44,11);
        Map<Integer, Set<Integer>> testInt = new HashMap<>();
        for (Integer i : integers) {
            testInt.computeIfAbsent(i, integer -> new HashSet<>()).add(i);
        }
        System.out.println(testInt);
        String text = "hello java";
        Arrays.stream(text.split("")).forEach(System.out::print);
        System.out.println("\nchars() 이용");
        text.chars().forEach(s-> System.out.print((char)s));
    }
}
