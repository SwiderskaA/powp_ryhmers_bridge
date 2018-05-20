package edu.kis.vh.nursery.collection;

public class IntArrayStack {
	private static final int EMPTY_VALUE = -1;

	private static final int MAX_CAPACITy = 12;

	private final int[] numbers = new int[MAX_CAPACITy]; //12 raczej nie nazywac SIZE !!! raczej capacity !!!

	private int total = EMPTY_VALUE; //value if empty 

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_VALUE;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int peekaboo() {
		if (callCheck())
			return EMPTY_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_VALUE;
		return numbers[total--];
	}

}