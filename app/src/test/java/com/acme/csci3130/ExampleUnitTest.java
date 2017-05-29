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
    public void passwordSecure() throws Exception {

        assertFalse("password".length()<8);
        assertFalse(("Sassword".toLowerCase()).equals("password"));
        assertFalse("password".contains(".*[!,@,#,$,%,^,&,*,(,),?].*"));
    }

}