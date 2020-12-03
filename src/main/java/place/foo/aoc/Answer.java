package main.java.place.foo.aoc;

public final class Answer {
    private final double first;
    private final double second;

    public Answer(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public Answer(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }
}
