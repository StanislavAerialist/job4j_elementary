package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class DoWhileTest {

    @Test
    public void whenDoWhileFiveThenThreeHundred() {
        int num = 5;
        int result = DoWhile.bingo(num);
        int expected = 300;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDoWhileMinus5ThenMinus1() {
        int num = -5;
        int result = DoWhile.bingo(num);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}