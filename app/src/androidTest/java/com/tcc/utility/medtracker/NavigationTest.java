package com.tcc.utility.medtracker;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by TCC on 9/26/2018.
 */

@RunWith(AndroidJUnit4.class)
public class NavigationTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception{
        mainActivity = mainActivityTestRule.getActivity();
    }

    @Test
    public void TestMain()
    {

    }

    @After
    public void tearDown() throws Exception
    {
        mainActivity = null;
    }

}
