package com.mamakos;

import org.junit.Test;

public class ChopTest {
    @Test
    public void testChop() {
        IChop c = new Chop1();
        assert -1 == c.chop(3, new int[]{}) : "Test 1: Failed";
        assert -1 == c.chop(3, new int[]{1}) : "Test 2: Failed";
        assert 0 == c.chop(1, new int[]{1}) : "Test 3: Failed";
        assert 0 == c.chop(1, new int[]{1, 3, 5}) : "Test 4: Failed";
        assert 1 == c.chop(3, new int[]{1, 3, 5}) : "Test 5: Failed";
        assert 2 == c.chop(5, new int[]{1, 3, 5}) : "Test 6: Failed";
        assert -1 == c.chop(0, new int[]{1, 3, 5}) : "Test 7: Failed";
        assert -1 == c.chop(2, new int[]{1, 3, 5}) : "Test 8: Failed";
        assert -1 == c.chop(4, new int[]{1, 3, 5}) : "Test 8: Failed";
        assert -1 == c.chop(6, new int[]{1, 3, 5}) : "Test 10: Failed";
        assert 0 == c.chop(1, new int[]{1, 3, 5, 7}) : "Test 11: Failed";
        assert 1 == c.chop(3, new int[]{1, 3, 5, 7}) : "Test 12: Failed";
        assert 2 == c.chop(5, new int[]{1, 3, 5, 7}) : "Test 13: Failed";
        assert 3 == c.chop(7, new int[]{1, 3, 5, 7}) : "Test 14: Failed";
        assert -1 == c.chop(0, new int[]{1, 3, 5, 7}) : "Test 15: Failed";
        assert -1 == c.chop(2, new int[]{1, 3, 5, 7}) : "Test 16: Failed";
        assert -1 == c.chop(4, new int[]{1, 3, 5, 7}) : "Test 17: Failed";
        assert -1 == c.chop(6, new int[]{1, 3, 5, 7}) : "Test 18: Failed";
        assert -1 == c.chop(8, new int[]{1, 3, 5, 7}) : "Test 19: Failed";
        assert 13 == c.chop(100, new int[]{1, 3, 5, 7,9,11,33,44,55,66,77,88,99,100,101,999}) : "Test 20: Failed";
    }
    @Test
    public void testChop2() {
        IChop c = new Chop2();
        assert -1 == c.chop(3, new int[]{}) : "Test 1: Failed";
        assert -1 == c.chop(3, new int[]{1}) : "Test 2: Failed";
        assert 0 == c.chop(1, new int[]{1}) : "Test 3: Failed";
        assert 0 == c.chop(1, new int[]{1, 3, 5}) : "Test 4: Failed";
        assert 1 == c.chop(3, new int[]{1, 3, 5}) : "Test 5: Failed";
        assert 2 == c.chop(5, new int[]{1, 3, 5}) : "Test 6: Failed";
        assert -1 == c.chop(0, new int[]{1, 3, 5}) : "Test 7: Failed";
        assert -1 == c.chop(2, new int[]{1, 3, 5}) : "Test 8: Failed";
        assert -1 == c.chop(4, new int[]{1, 3, 5}) : "Test 8: Failed";
        assert -1 == c.chop(6, new int[]{1, 3, 5}) : "Test 10: Failed";
        assert 0 == c.chop(1, new int[]{1, 3, 5, 7}) : "Test 11: Failed";
        assert 1 == c.chop(3, new int[]{1, 3, 5, 7}) : "Test 12: Failed";
        assert 2 == c.chop(5, new int[]{1, 3, 5, 7}) : "Test 13: Failed";
        assert 3 == c.chop(7, new int[]{1, 3, 5, 7}) : "Test 14: Failed";
        assert -1 == c.chop(0, new int[]{1, 3, 5, 7}) : "Test 15: Failed";
        assert -1 == c.chop(2, new int[]{1, 3, 5, 7}) : "Test 16: Failed";
        assert -1 == c.chop(4, new int[]{1, 3, 5, 7}) : "Test 17: Failed";
        assert -1 == c.chop(6, new int[]{1, 3, 5, 7}) : "Test 18: Failed";
        assert -1 == c.chop(8, new int[]{1, 3, 5, 7}) : "Test 19: Failed";
        assert 13 == c.chop(100, new int[]{1, 3, 5, 7,9,11,33,44,55,66,77,88,99,100,101,999}) : "Test 20: Failed";

    }

}