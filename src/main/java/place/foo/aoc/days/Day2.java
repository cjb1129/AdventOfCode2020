package main.java.place.foo.aoc.days;

import main.java.place.foo.aoc.AdventSolution;
import main.java.place.foo.aoc.Answer;
import main.java.place.foo.aoc.Library;

public class Day2 implements AdventSolution {

    public static void main(String[] args) throws Exception {
        System.out.println( new Day2().solve() );
    }

    public Answer solve() {

        String[] lines = Library.getInput("src/main/resources/Day2.txt");

        int valid1 = 0;
        int valid2 = 0;

        for (int i=0; i < lines.length; i++) {
            String[] split = lines[i].split("\\s");
            String[] minAndMax = split[0].split("-");

            if (isValid(
                    Integer.valueOf(minAndMax[0]), // MINIMUM
                    Integer.valueOf(minAndMax[1]), // MAXIMUM
                    split[1].charAt(0),            // CHARACTER
                    split[2]                       // PASSWORD
            )) {
                valid1++;
            }

            if (isValidIndex(
                    Integer.valueOf(minAndMax[0]), // MINIMUM
                    Integer.valueOf(minAndMax[1]), // MAXIMUM
                    split[1].charAt(0),            // CHARACTER
                    split[2]                       // PASSWORD
            )) {
                valid2++;
            }
        }

        return new Answer(valid1, valid2);
    }

    public boolean isValid(int min, int max, char c, String s) {
        int charCount = 0;
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                charCount++;
        }
        return (charCount >= min) && (charCount <= max);
    }

    public boolean isValidIndex(int index1, int index2, char c, String s) {
        return (s.charAt(index1 - 1) == c ^ s.charAt(index2 - 1) == c);
    }
}
