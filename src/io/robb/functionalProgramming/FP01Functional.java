package io.robb.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
//        printAllNumbersFunctional(List.of(12,9,13,4,6,2,4,12,15));
        printAllEvenNumbers(List.of(12,13,99,8,7,0,1,19));
    }
    private static void print(int number){
        System.out.println(number);
    }
    private static boolean isEven(int number){
        return number % 2 == 0;
    }

    private static void printAllNumbersFunctional(List<Integer> integers) {
        // naming convention (nameofclass::name of static method)
//        ArrayList<Integer> newList = new ArrayList<>();
//        integers.stream().forEach(FP01Functional::print);
//        // or you could have simply
//        integers.stream().forEach(System.out::println); //method reference
    }
    private static void printAllEvenNumbers(List<Integer> integers){
        System.out.println("Even numbers: ");
        integers.stream()
                .filter(FP01Functional::isEven)
                .forEach(System.out::println);
    }
}
