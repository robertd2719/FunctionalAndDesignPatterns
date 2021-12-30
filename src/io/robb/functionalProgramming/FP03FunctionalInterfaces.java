package io.robb.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

    /*
        boolean isEven(int x){
        return x%2==0;

        int squared(int x){
        return x * x;
     */


    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> squareFunction = x -> x * x;
        Consumer<Integer> sysoutConsumer = item -> System.out.println(item);
        Consumer<Integer> sysoutConsumerOther = System.out::println;

        numbers.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(sysoutConsumerOther);
    }
}
