package com.acme.csci3130;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void IntegerTest() throws Exception {
        int x,y;
        x=5;
        y=x;
        assertEquals(x,y);
    }
    @Test
    public void IntegerTest2() throws Exception {
        int x,y;
        x=5;
        y=4;
        assertEquals(x,y);
    }
    @Test
    public void ArrayTest() throws Exception {
        int x[] = new int[101];
        int y[] = new int[101];
        for(int i=0;i<=100;i++){
            x[i]=i;
            y[i]=i;
        }
        assertArrayEquals(x,y);
    }
}