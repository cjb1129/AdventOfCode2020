package main.java.place.foo.aoc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

public final class Library {
    public static String[] getInput(String path) {
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String line;
            ArrayList<String> lines = new ArrayList<>();
            while((line = in.readLine()) != null)
                lines.add(line);
            return lines.toArray(new String[lines.size()]);
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    public static int[] toIntegerArray(String[] array) {
        int[] intArray = new int[array.length];
        for (int i=0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(array[i]);
        }
        return intArray;
    }
}
