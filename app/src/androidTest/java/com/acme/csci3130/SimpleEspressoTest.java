package com.acme.csci3130;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.EditText;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SimpleEspressoTest {

    private String textToFind;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initString()
    {
        textToFind = "password";
    }

    @Test
    public void findText()
    {
        //Tries to find the text on the screen
        //Return true if it matches the expected test
        //onView(withId(R.id.helloText)).check(typeText(textToFind));
        //EditText enter = (EditText)findViewById(R.id.editText);

        //Same thing but not using IDs
        //It does not makes much sense in this case
        //(onView(withText(textToFind)).toString().toLowerCase()).check(matches(withText(textToFind).toString()));
        //assisted by Josh Morris fellow student
        //onView(withId(R.id.editText)).perform(withText(textToFind));
        //replacetext("")
        //enterText
        //Clickbutton
        //matchDisplay
        //onView(withId(R.id.helloText)).check(enter.toString().length()>=8);
        //onView(withId(R.id.helloText)).check(matches(withText(textToFind)));
    }


}
