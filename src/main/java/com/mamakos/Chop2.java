package com.mamakos;

public class Chop2 implements IChop {
    public Chop2() {
    }

    public int chop(int searchTarget, int[] sortedIntArray) {
        if (sortedIntArray.length == 0)
            return -1;
        return recursiveChopper(searchTarget,sortedIntArray,0,sortedIntArray.length - 1);
    }

    public int recursiveChopper(int searchTarget, int[] sortedIntArray, int startIndex, int endIndex) {

        int midIndex = startIndex + ((endIndex - startIndex) / 2);
        if (searchTarget == sortedIntArray[midIndex]) {
            return midIndex;
        }
        if(((endIndex - startIndex + 1) <= 2)){
            if (searchTarget == sortedIntArray[startIndex])
                return startIndex;
            if (searchTarget == sortedIntArray[endIndex])
                return endIndex;
            return -1;
        }
        if (searchTarget < sortedIntArray[midIndex]) {
            return recursiveChopper(searchTarget,sortedIntArray,startIndex, midIndex);
        } else {
            return recursiveChopper(searchTarget,sortedIntArray, midIndex, endIndex);
        }

    }

}
