package main.java.place.foo.aoc.days;

import main.java.place.foo.aoc.AdventSolution;
import main.java.place.foo.aoc.Answer;
import main.java.place.foo.aoc.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day5 implements AdventSolution {

    public static void main(String[] args) {
        Answer ans = new Day5().solve();
        System.out.println(ans.toString());
    }

    public Answer solve() {

        String[] input = Library.getInput("src/main/resources/Day5.txt");

        List<Integer> ids = new ArrayList<Integer>();

        for (String s : input) {

            List<Integer> row = new ArrayList<Integer>();
            List<Integer> col = new ArrayList<Integer>();



            for (int i = 0; i < 127; i++)
                row.add(i);

            for (int i = 0; i < 8; i++)
                col.add(i);

            for (int i = 0; i < 8; i++) {
                System.out.println(Arrays.toString(row.toArray()));
                if (s.charAt(i) == 'F') {
                    for (int j = (int) Math.ceil(row.size() / 2); j < row.size(); j++) {
                            row.remove(row.size() - 1);
                    }
                }
                if (s.charAt(i) == 'B') {
                    for (int j = 0; j < (int) Math.ceil(row.size() / 2); j++) {
                        row.remove(0);
                    }
                }
            }

            System.out.println(Arrays.toString(row.toArray()));







            //int row = binToDec(getBinary(s.substring(0,7)));
            //int col = binToDec(getBinary(s.substring(7,s.length())));

            //String r = s.replaceAll("B|L","0").replaceAll("F|R","1");

            //int row = Integer.parseInt(r.substring(0,7),2);
            //int col = Integer.parseInt(r.substring(7,r.length()),2);

            //idsList.add((row * 8) + col);
        }

        //System.out.println(Arrays.toString(idsList.toArray()));

        //Collections.sort(idsList);

        //final int MAX = idsList.get(idsList.size() - 1);

        //System.out.println("(" + MAX / 8 + " * 8) + " + MAX % 8);
        //System.out.println(MAX);

        return new Answer(0.0,0.0);
    }

    int[] getBinary(String s) {
        List<Integer> binary = new ArrayList<Integer>();
        for (char c : s.toCharArray()){
            int i=0;
            switch (c) {
                case 'B':
                    i = 0;
                    break;
                case 'L':
                    i = 0;
                    break;
                default:
                    i = 1;
                    break;
            }
            binary.add(i);
        }
        return binary.stream().mapToInt(i -> i).toArray();
    }

    int binToDec(int[] binary) {
        int dec = 0;
        for (int i = binary.length - 1; i >= 0; i--) {
            if (binary[binary.length - i - 1] == 1)
                dec += Math.pow(2, i);

        }
        return dec;
    }
}
