package com.acme.csci3130;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.TypeTextAction;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.acme.csci3130", appContext.getPackageName());
    }

    @Test
    public void testLength() throws Exception{
        //assisted by Josh Morris fellow student
        //replacetext("")
            onView(withId(R.id.editText)).perform(clearText());
        //enterText
            onView(withId(R.id.editText)).perform(replaceText("passwor"));
        //Clickbutton
        onView(withId(R.id.buttonTextField)).perform(click());
        //matchDisplay
        onView(withId(R.id.helloText)).check(matches(withText("unacceptable")));
    }

    @Test
    public void testPassword() throws Exception{
        //assisted by Josh Morris fellow student
        //replacetext("")
        onView(withId(R.id.editText)).perform(clearText());
        //enterText
        onView(withId(R.id.editText)).perform(replaceText("Password"));
        //Clickbutton
        onView(withId(R.id.buttonTextField)).perform(click());
        //matchDisplay
        onView(withId(R.id.helloText)).check(matches(withText("unacceptable")));
    }

    @Test
    public void testSpecial() throws Exception{
        //assisted by Josh Morris fellow student
        //replacetext("")
        onView(withId(R.id.editText)).perform(clearText());
        //enterText
        onView(withId(R.id.editText)).perform(replaceText("Password!"));
        //Clickbutton
        onView(withId(R.id.buttonTextField)).perform(click());
        //matchDisplay
        onView(withId(R.id.helloText)).check(matches(withText("unacceptable")));
    }

    @Test
    public void testAll() throws Exception{
        //assisted by Josh Morris fellow student
        //replacetext("")
        onView(withId(R.id.editText)).perform(clearText());
        //enterText
        onView(withId(R.id.editText)).perform(replaceText("Password1!"));
        //Clickbutton
        onView(withId(R.id.buttonTextField)).perform(click());
        //matchDisplay
        onView(withId(R.id.helloText)).check(matches(withText("acceptable")));
    }
}
