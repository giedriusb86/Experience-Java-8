package academy.elqoo.java8.stream;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream8 {

    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream()
                .map(Math::sqrt)
                .map(Double::intValue)
                .collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        throw new NotImplementedException();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream()
                .map(User::getAge)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream()
                .limit(2)
                .collect(Collectors.toList());
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return ((Long) users.stream()
                .map(User::getAge)
                .filter(a -> a > 25).count())
                .intValue();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream()
                .reduce(0, Integer::sum);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream()
                .skip(toSkip)
                .collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream()
                .map(name -> name.split(" ")[0])
                .collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream()
                .flatMapToInt(CharSequence::chars)
                .distinct()
                .mapToObj(name -> (char) name)
                .map(String::valueOf)
                .collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream()
                .map(user -> user.getName())
                .collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge).average().getAsDouble();
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream()
                .max(Comparator.comparingInt(User::getAge))
                .get().getAge();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream()
                .map(User::getAge)
                .min(Comparator.comparingInt(x -> x)).get();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        throw new NotImplementedException();
    }

    public static boolean anyMatch(List<User> users, int age) {
        throw new NotImplementedException();
    }

    public static boolean noneMatch(List<User> users, int age) {
        throw new NotImplementedException();
    }

    public static Optional<User> findAny(List<User> users, String name) {
        throw new NotImplementedException();
    }

    public static List<User> sortByAge(List<User> users) {
        throw new NotImplementedException();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        throw new NotImplementedException();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        throw new NotImplementedException();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        throw new NotImplementedException();
    }

    public static User findOldest(List<User> users) {
        throw new NotImplementedException();
    }

    public static int sumAge(List<User> users) {
        throw new NotImplementedException();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        throw new NotImplementedException();
    }

}
