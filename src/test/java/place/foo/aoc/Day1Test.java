package test.java.place.foo.aoc;

import main.java.place.foo.aoc.Answer;
import main.java.place.foo.aoc.days.Day1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day1Test {

    @Test
    public void testDay1() {
        Answer day1 = new Day1().solve();
        assertEquals(day1.getFirst(), 1013211.0, 0);
        assertEquals(day1.getSecond(),13891280.0, 0);
    }

}
