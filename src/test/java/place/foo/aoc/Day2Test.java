package test.java.place.foo.aoc;

import main.java.place.foo.aoc.Answer;
import main.java.place.foo.aoc.days.Day2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day2Test {

    @Test
    public void testDay2() {
        Answer day2 = new Day2().solve();
        assertEquals(new Day2().solve().getFirst(),582.0, 0);
        assertEquals(new Day2().solve().getSecond(),729.0, 0);
    }

}
