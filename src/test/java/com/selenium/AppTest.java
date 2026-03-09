package com.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    App app = new App();
    @Test
    public void getTitle()
    {
        String title = app.getTitle();
        assertTrue(title.equals("Google"));
    }
}
