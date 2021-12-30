package io.robb.functionalProgramming;

import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {
        List<Integer> arrayList = List.of(12,22,19,33,15);
        int sum = addListStructured(arrayList);
        System.out.println(sum);
    }

    private static int addListStructured(List<Integer> arrayList) {
        int sum = 0;
        for (int i: arrayList){
            sum += i;
        }
        return sum;
    }
}
