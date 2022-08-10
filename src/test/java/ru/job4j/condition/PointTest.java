package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2()  {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to44then2()  {
        Point a = new Point(2, 4);
        Point b = new Point(4, 4);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void  when10to44then5() {
        Point a = new Point(1, 0);
        Point b = new Point(4, 4);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void  when10to56then7dot21() {
        Point a = new Point(1, 0);
        Point b = new Point(5, 6);
        double expected = 7.21;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void  when100to000then1() {
        Point a = new Point(1, 0, 0);
        Point b = new Point(0, 0, 0);
        double expected = 1;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void  when000to002then2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 2);
        double expected = 2;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}