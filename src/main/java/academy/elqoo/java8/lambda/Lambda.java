package academy.elqoo.java8.lambda;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Lambda {

    public static List<String> filter(List<String> strings, Predicate<String> condition){
        return strings.stream().filter(condition).collect(toList());
    }

    public static void processWithinTransaction(Runnable runnable){
        Transaction transaction = new Transaction();
        transaction.start();
        runnable.run();
        transaction.stop();
    }

    public static String create(Supplier<String> supplier){
        return supplier.get();
    }

    public static Integer getStringLength(String s, Function<String, Integer> function){
        return function.apply(s);
    }

    public static int multiply(int a, int b, BiFunction<Integer, Integer, Integer> function){
        return function.apply(a,b);
    }

    public static List<String> sortStrings(List<String> strings, Comparator<String> comparator){
         return strings.stream().sorted(comparator).collect(toList());
    }

}
