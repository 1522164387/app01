package com.example.cnjnuedux2020101335;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BollingGameTest {

    private game g;

    @Before
    public void setUp() {
        g = new game();
    }
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    @Test
    public void test1()
    {
        rollMany(20,0);
        assertEquals(0, g.score());
    }
    @Test
    public void test2()
    {
        rollMany(20,1);
        assertEquals(20,g.score());
    }
    @Test
    public void test3()
    {
        rollSpare();
        g.roll(3);
        rollMany(17,0);
        assertEquals(13,g.score());
    }
}