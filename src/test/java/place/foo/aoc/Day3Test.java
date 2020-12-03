package test.java.place.foo.aoc;

import main.java.place.foo.aoc.Answer;
import main.java.place.foo.aoc.days.Day3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day3Test {

    @Test
    public void testDay3() {
        Answer day3 = new Day3().solve();
        assertEquals(day3.getFirst(),200.0, 0);
        assertEquals(day3.getSecond(),3737923200.0,0);
    }

}
