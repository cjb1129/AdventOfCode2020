package main.java.place.foo.aoc.days;

import main.java.place.foo.aoc.AdventSolution;
import main.java.place.foo.aoc.Answer;
import main.java.place.foo.aoc.Library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day5 implements AdventSolution {

    public static void main(String[] args) {
        Answer ans = new Day5().solve();
        System.out.println(ans.toString());
    }

    public Answer solve() {

        String[] input = Library.getInput("src/main/resources/Day5.txt");

        List<Integer> ids = new ArrayList<>();

        assert input != null;
        for (String s : input) {

            byte min = 0;
            byte max = 127;

            for (int i = 0; i < 8; i++) {

                if (s.charAt(i) == 'F') {
                    max -= ((max - min) / 2) + 1;
                }
                if (s.charAt(i) == 'B') {
                    min += ((max - min) / 2) + 1;
                }
            }

            final int row = s.charAt(6) == 'F' ? min : max;

            max = 7;
            min = 0;

            for (int i = 7; i < s.length(); i++) {
                if (s.charAt(i) == 'L') {
                    max -= ((max - min) / 2) + 1;
                }
                if (s.charAt(i) == 'R') {
                    min += ((max - min) / 2) + 1;
                }
            }
            final int col = s.charAt(s.length() - 1) == 'R' ? max : min;

            ids.add((row * 8) + col);
        }

        Collections.sort(ids);

        final int HIGHEST = ids.get(ids.size() - 1);

        int empty = 0;

        int i = 0;
        while (i < (HIGHEST - 1) && empty == 0) {
            if(i != HIGHEST - 1 && ids.get(i+1) - ids.get(i) > 1) {
                empty = ids.get(i) + 1;
            }
            i++;
        }

        return new Answer(HIGHEST,empty);
    }

}
