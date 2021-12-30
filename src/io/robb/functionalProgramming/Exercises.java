package io.robb.functionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercises {
    public static void main(String[] args) {
        List<Integer> arrayList = List.of(1, 2, 33, 12, 19, 24, 200, 12, 1);
        // Print only odd numbers
        arrayList.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
        // Print out each course
        List<String> courses = List.of("Spring", "Spring Boot", "API", "AOP", "Docker", "PCF", "Kubernetes");
        courses.stream().forEach(System.out::println);
        // words that contain 'Spring' in them
        System.out.println("Ex 4");
        courses.stream()
                .filter(item -> item.contains("Spring"))
                .forEach(System.out::println);
        // words that have at least 4 characters
        System.out.println("Ex 5");
        courses.stream()
                .filter(number -> number.length() >= 4)
                .forEach(System.out::println);
        // if we want to square each even number
        System.out.println("Ex. 6");
        arrayList.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
        courses.stream()
                .map(String::length)// we can replace with a method reference here from the String.lenth() class
                .forEach(System.out::println);
        // square every number in a list and return the sum of squares
        System.out.println("Exercise 7");
        int sumSquares = arrayList.stream()
                .map(x -> x * x)
                .reduce(0, Integer::sum);
        System.out.println("Sum of Squares: " + sumSquares);
        // cube every number and return the result
        int sumCubes = arrayList.stream()
                .map(x -> x * x * x)
                .reduce(0, Integer::sum);
        System.out.println("Sum of cubes: " + sumCubes);
        // find the sum of odd numbers in the list
        int sumOdds = arrayList.stream()
                .filter(x -> x % 2 != 0)
                .reduce(0, Integer::sum);
        System.out.println("odd sum: " + sumOdds);
        // print out distinct numbers
        arrayList.stream().distinct().forEach(System.out::println);
        // sort values in ascending order
        arrayList.stream().sorted().forEach(System.out::println);
        // and we can easily combine both
        arrayList.stream().distinct().sorted().forEach(System.out::println);
        // the same is possible for list of strings -natural order-
        courses.stream().sorted().forEach(System.out::println);
        // if we want to have a diferent order we have to implemet a omparator
        courses.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        // we can actually define our own comparators or use method references
        courses.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
        arrayList.stream().filter(item -> item > 20)
                .forEach(System.out::println);
        //Exercise 10 All of the evens filtered out with a new list
        arrayList.stream()
                .filter(item -> item % 2 != 0)
                .collect(Collectors.toList()).forEach(System.out::println);
        List<Integer> courseLengths = courses.stream()
                .map(item -> item.length())
                .collect(Collectors.toList());
        System.out.println(courseLengths);
    }
}
