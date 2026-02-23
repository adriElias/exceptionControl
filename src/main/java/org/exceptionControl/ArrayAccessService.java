package org.exceptionControl;

public class ArrayAccessService {
    private final int[] numbers = {2, 4, 6, 8, 10};

    public int getElement(int position){
        return numbers[position];
    }
}
