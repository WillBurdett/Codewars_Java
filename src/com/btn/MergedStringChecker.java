package com.btn;

public class MergedStringChecker {
    public static boolean isMerge(String s, String part1, String part2) {
        String[] testInput = s.split("");
        String[] part1Arr = part1.split("");
        String[] part2Arr = part2.split("");
        Integer part1Index = 0;
        Integer part2Index = 0;
        Boolean noMatch1 = false;
        Boolean noMatch2 = false;

        String output = "";

        for (int i=0; i<testInput.length; i++) {
            if (part1Index != part1Arr.length) {
                if (testInput[i].equals(part1Arr[part1Index])){
                    output += testInput[i];
                    part1Index++;
                    noMatch1 = false;
                    System.out.println("Part 1 : " + output );
                } else {
                    noMatch1 = true;
                }
            } else {
                noMatch1 = true;
            }
            if (part2Index != part2Arr.length && noMatch1){
                if (testInput[i].equals(part2Arr[part2Index])){
                    output += testInput[i];
                    part2Index++;
                    noMatch2 = false;
                    System.out.println("Part 2 : " + output );
                } else {
                    noMatch2 = true;
                }
            } else {
                noMatch2 = true;
            }
            if (noMatch1 && noMatch2){
                return false;
            }
            noMatch1 = false;
            noMatch2 = false;
        }
        if (!s.equals(output) && testInput.length == output.length()){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isMerge("Can we merge it? Yes, we can!", "Cwe mr?Yca", "an ege it es, we n!"));
    }
}
