package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int SIZE = 12;
    private int[] numbers = new int[SIZE];

    public int total = -1;
    public static final int EMPTY = -1;
    public static final int FULL = 11;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peek() {
        if (isEmpty())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return EMPTY;
        return numbers[total--];
    }

}
