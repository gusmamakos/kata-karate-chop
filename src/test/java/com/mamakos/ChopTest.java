package com.mamakos;

import junit.framework.TestCase;
import org.junit.Test;

public class ChopTest extends TestCase {

    public void testChop() {
        IChop c = new Chop1();
        assert -1 == c.chop(3, new int[]{}) : "Test 13: Failed";
        assert -1 == c.chop(3, new int[]{1}) : "Test 14: Failed";
        assert 0 == c.chop(1, new int[]{1}) : "Test 15: Failed";
        assert 0 == c.chop(1, new int[]{1, 3, 5}) : "Test 16: Failed";
        assert 1 == c.chop(3, new int[]{1, 3, 5}) : "Test 17: Failed";
        assert 2 == c.chop(5, new int[]{1, 3, 5}) : "Test 18: Failed";
        assert -1 == c.chop(0, new int[]{1, 3, 5}) : "Test 19: Failed";
        assert -1 == c.chop(2, new int[]{1, 3, 5}) : "Test 20: Failed";
        assert -1 == c.chop(4, new int[]{1, 3, 5}) : "Test 21: Failed";
        assert -1 == c.chop(6, new int[]{1, 3, 5}) : "Test 22: Failed";
        assert 0 == c.chop(1, new int[]{1, 3, 5, 7}) : "Test 23: Failed";
        assert 1 == c.chop(3, new int[]{1, 3, 5, 7}) : "Test 24: Failed";
        assert 2 == c.chop(5, new int[]{1, 3, 5, 7}) : "Test 25: Failed";
        assert 3 == c.chop(7, new int[]{1, 3, 5, 7}) : "Test 26: Failed";
        assert -1 == c.chop(0, new int[]{1, 3, 5, 7}) : "Test 27: Failed";
        assert -1 == c.chop(2, new int[]{1, 3, 5, 7}) : "Test 28: Failed";
        assert -1 == c.chop(4, new int[]{1, 3, 5, 7}) : "Test 29: Failed";
        assert -1 == c.chop(6, new int[]{1, 3, 5, 7}) : "Test 30: Failed";
        assert -1 == c.chop(8, new int[]{1, 3, 5, 7}) : "Test 31: Failed";
        assert 13 == c.chop(100, new int[]{1, 3, 5, 7,9,11,33,44,55,66,77,88,99,100,101,999}) : "Test 31: Failed";
    }

    public void testChop2() {
        IChop c = new Chop2();
        assert -1 == c.chop(3, new int[]{}) : "Test 13: Failed";
        assert -1 == c.chop(3, new int[]{1}) : "Test 14: Failed";
        assert 0 == c.chop(1, new int[]{1}) : "Test 15: Failed";
        assert 0 == c.chop(1, new int[]{1, 3, 5}) : "Test 16: Failed";
        assert 1 == c.chop(3, new int[]{1, 3, 5}) : "Test 17: Failed";
        assert 2 == c.chop(5, new int[]{1, 3, 5}) : "Test 18: Failed";
        assert -1 == c.chop(0, new int[]{1, 3, 5}) : "Test 19: Failed";
        assert -1 == c.chop(2, new int[]{1, 3, 5}) : "Test 20: Failed";
        assert -1 == c.chop(4, new int[]{1, 3, 5}) : "Test 21: Failed";
        assert -1 == c.chop(6, new int[]{1, 3, 5}) : "Test 22: Failed";
        assert 0 == c.chop(1, new int[]{1, 3, 5, 7}) : "Test 23: Failed";
        assert 1 == c.chop(3, new int[]{1, 3, 5, 7}) : "Test 24: Failed";
        assert 2 == c.chop(5, new int[]{1, 3, 5, 7}) : "Test 25: Failed";
        assert 3 == c.chop(7, new int[]{1, 3, 5, 7}) : "Test 26: Failed";
        assert -1 == c.chop(0, new int[]{1, 3, 5, 7}) : "Test 27: Failed";
        assert -1 == c.chop(2, new int[]{1, 3, 5, 7}) : "Test 28: Failed";
        assert -1 == c.chop(4, new int[]{1, 3, 5, 7}) : "Test 29: Failed";
        assert -1 == c.chop(6, new int[]{1, 3, 5, 7}) : "Test 30: Failed";
        assert -1 == c.chop(8, new int[]{1, 3, 5, 7}) : "Test 31: Failed";
        assert 13 == c.chop(100, new int[]{1, 3, 5, 7,9,11,33,44,55,66,77,88,99,100,101,999}) : "Test 31: Failed";
    }

}