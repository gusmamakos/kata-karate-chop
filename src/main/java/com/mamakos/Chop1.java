package com.mamakos;

public class Chop1 implements IChop {
    public Chop1() {
    }

    public int chop(int searchTarget, int[] sortedIntArray) {
        if (sortedIntArray.length == 0)
            return -1;

        int startIndex = 0;
        int endIndex = sortedIntArray.length - 1;
        while ((endIndex - startIndex + 1) > 2) { //loop until there are only 2 items left
            int midIndex = startIndex + ((endIndex - startIndex) / 2);
            if (searchTarget == sortedIntArray[midIndex]) {
                return midIndex;
            }
            if (searchTarget < sortedIntArray[midIndex]) {
                endIndex = midIndex;
            } else {
                startIndex = midIndex;
            }
        }

        if (searchTarget == sortedIntArray[startIndex])
            return startIndex;
        if (searchTarget == sortedIntArray[endIndex])
            return endIndex;
        return -1;
    }
}
