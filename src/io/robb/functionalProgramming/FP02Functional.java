package io.robb.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 22, 19, 33, 15);
        int sum = addListFunctional(numbers);
        System.out.println(sum);
        int max = accumulatorMax(numbers);
        System.out.println("max: " + max);
        int min = accumulatorMin(numbers);
        System.out.println("min: " + min);

        // Making new lists from streams
        List<Integer> doubleNumber = doubleList(numbers);
        System.out.println("Double numbers List:"+doubleNumber);
    }

    /*
   Sometimes we want to operate on a stream and return a list
   to do this we use the collector methods for it
    */
    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(item->item * item)
                .collect(Collectors.toList());
    }

    public static int sum(int a, int b) {
        System.out.println(a + " + " + b);
        return a + b;
    }

    private static int addListFunctional(List<Integer> numbers) {
        // Combine them into a single result
        // 0 and (a + b)
        // take a list of numbers and reduce it to one value
        // with each iteration the result of the previous
        // operation plus the last is added to the result

//        return numbers.stream()
//                .reduce(0, FP02Functional::sum);
        return numbers.stream()
//                .reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);
    }

    private static int accumulatorTest(List<Integer> numbers) {
        /*
        This will simply return the starting 'x' value without
        doing anything else, because the 'accumulator' starts @ 0
        it returns this zero as the accumulator or 'x' value which
        is then returned again and again resulting in 0.
         */
        return numbers.stream()
                .reduce(0, (x, y) -> x);
    }

    private static int accumulatorMax(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }
    private static int accumulatorMin(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
    }
}
