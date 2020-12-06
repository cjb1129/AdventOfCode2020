package main.java.place.foo.aoc.days;

import main.java.place.foo.aoc.AdventSolution;
import main.java.place.foo.aoc.Answer;
import main.java.place.foo.aoc.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day6 implements AdventSolution {

    private final String[] input = Library.getInput("src/main/resources/Day6.txt");

    public static void main(String[] args) {
        Answer ans = new Day6().solve();
        System.out.println(ans.toString());
    }

    @Override
    public Answer solve() {
        int p1 = partOne();
        int p2 = partTwo();
        return new Answer(p1,p2);
    }

    private int partOne() {
        int yesCount = 0;
        List<Character> ca = new ArrayList<>();
        for (int i=0; i<input.length; i++) {
            String s = input[i];
            if (!s.isBlank() && !(i == input.length - 1)) {
                for (char c : s.toCharArray()) {
                    if (!ca.contains(c))
                        ca.add(c);
                }
            } else {
                yesCount += ca.size();
                ca.clear();
            }
        }
        return yesCount;
    }

    private int partTwo() {
        int yesCount = 0;
        String ca = "";
        int k = 0;
        for (int i=0; i<input.length; i++) {
            String s = input[i];
            if (!s.isBlank() && !(i == input.length - 1)) {
                for (char c : s.toCharArray()) {
                    if (ca.indexOf(c) == -1) {
                        if (k == 0) {
                            ca += c;
                        } else {
                            ca.replaceAll(String.valueOf(c), "");
                        }
                        System.out.println(ca);
                    } else {
                        if (s.indexOf(c) == -1) {

                        }
                    }
                }
                k++;
            } else {
                System.out.println(ca.length());
                yesCount += ca.length();
                ca = "";
                k = 0;
            }
        }
        return yesCount;
    }
}
