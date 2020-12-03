package main.java.place.foo.aoc.days;

import main.java.place.foo.aoc.AdventSolution;
import main.java.place.foo.aoc.Answer;
import main.java.place.foo.aoc.Library;

public class Day3 implements AdventSolution {

    public static void main(String[] args) {
        System.out.println(new Day3().solve());
    }

    public Answer solve() {

        final int RIGHT = 3;
        final int DOWN = 1;

        final String[] sample = new String[]{
                "..##.......",
                "#...#...#..",
                ".#....#..#.",
                "..#.#...#.#",
                ".#...##..#.",
                "..#.##.....",
                ".#.#.#....#",
                ".#........#",
                "#.##...#...",
                "#...##....#",
                ".#..#...#.#"
        };

        String[] input = Library.getInput("src/main/resources/Day3.txt");

        double sum =
                  (double) getTrees(input, 1, 1)
                * (double) getTrees(input, 3, 1)
                * (double) getTrees(input, 5, 1)
                * (double) getTrees(input, 7, 1)
                * (double) getTrees(input, 1, 2)
        ;

        return new Answer(getTrees(input, RIGHT, DOWN), sum);
    }

    public int getTrees(String[] data, int right, int down) {
        int trees = 0;
        int locX = 0;
        for (int i=0; i < data.length && data[i] != null; i += down) {
            locX = ((i / down) * right % data[i].length());
            if (data[i].charAt(locX) == '#')
                trees++;
        }
        return trees;
    }
}
