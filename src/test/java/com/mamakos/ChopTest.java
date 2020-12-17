package com.mamakos;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@RunWith(value= Parameterized.class)
public class ChopTest {
    private int targetValue;
    private int[] sortedArrayList;
    private int expected;

    public ChopTest(int targetValue, int[] sortedArrayList, int expected) {
        this.targetValue = targetValue;
        this.sortedArrayList = sortedArrayList;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3,new int[]{},-1},
                {3,new int[]{1},-1},
                {1,new int[]{1},0},
                {1,new int[]{1,3,5},0},
                {3,new int[]{1,3,5},1},
                {5,new int[]{1,3,5},2},
                {0,new int[]{1,3,5},-1},
                {2,new int[]{1,3,5},-1},
                {4,new int[]{1,3,5},-1},
                {6,new int[]{1,3,5},-1},
                {1,new int[]{1,3,5,7},0},
                {3,new int[]{1,3,5,7},1},
                {5,new int[]{1,3,5,7},2},
                {7,new int[]{1,3,5,7},3},
                {0,new int[]{1,3,5,7},-1},
                {2,new int[]{1,3,5,7},-1},
                {4,new int[]{1,3,5,7},-1},
                {6,new int[]{1,3,5,7},-1},
                {8,new int[]{1,3,5,7},-1},
                {100,new int[]{1, 3, 5, 7,9,11,33,44,55,66,77,88,99,100,101,999},13},
        });
    }
    @Test
    public void testChop1(){
        IChop c = new Chop1();
        assertThat(c.chop(this.targetValue, this.sortedArrayList), is(this.expected));
    }
    @Test
    public void testChop2(){
        IChop c = new Chop2();
        assertThat(c.chop(this.targetValue, this.sortedArrayList), is(this.expected));
    }

}