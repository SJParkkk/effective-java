package edu.item.stream.item45;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;

/**
 * Read Dictionary : element -> alphabetize(method) 정렬
 * alphabetize(word) 가 있으면
 * "staple" key -> "aelpst"
 * "petals" key -> "aelpst"
 *
 * **/

public class Anagrams {
    public static void main(String[] args) {
        File dictionary = new File(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);

        Map<String, Set<String>> groups = new HashMap<>();
//        try(Scanner s = new Scanner(dictionary)){
//            while(s.hasNext()){
//                String word = s.next();
//                Function<? super K, ? extends V> function = ;
//                groups.computeIfAbsent(alphabetize(word),(s)),
//            }
////        }
//    }
//}
    }}