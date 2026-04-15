package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int CAPACITY = 12;
    private static final int EMPTY_VALUE = -1;
    private static final int TOTAL_VALUE = -1;
    private static final int FULL_INDEX = CAPACITY - 1;
    private final int[] numbers = new int[CAPACITY];

    public int total = TOTAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peek() {
        if (isEmpty())
            return EMPTY_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return EMPTY_VALUE;
        return numbers[total--];
    }

}
