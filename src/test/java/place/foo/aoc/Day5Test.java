package test.java.place.foo.aoc;

import main.java.place.foo.aoc.Answer;
import main.java.place.foo.aoc.days.Day5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day5Test {

    @Test
    public void testDay5() {
        Answer day5 = new Day5().solve();
        assertEquals(day5.getFirst(),861.0, 0);
        assertEquals(day5.getSecond(),633.0,0);
    }

}
