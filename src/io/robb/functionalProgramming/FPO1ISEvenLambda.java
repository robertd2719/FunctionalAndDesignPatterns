package io.robb.functionalProgramming;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class FPO1ISEvenLambda {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(List.of(1,2,3,33,14,7,88,12,91));

        arrayList.stream()
                .filter(item-> item % 2 == 0)
                .forEach(System.out::println);
    }

}
