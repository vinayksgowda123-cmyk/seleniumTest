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
    /* 
    */
   
    App app = new App();
    @Test
    public void getTitle()
    {
        String title = app.getTitle();
        assertTrue(title.equals("Google"));
    }

    @Test
    public void search()
    {
        String url=app.search();
        assertTrue(url.contains("https://www.google.com/sorry/index?continue=https://www.google.com/search%3Fq%3Dwhat%2Bis%2Bthe%2Buse%2Bof%2Bselenium%2Bin%2Btesting%253F%26sca_esv%3D3b36d53a0ad7b307%26source%3Dhp%26ei%3DiHCuab3GB8275OUP9qKv6Q0%26iflsig%3DAFdpzrgAAAAAaa5-mHJOxYaFW_FdfvZdq2f01xWQ4nvv%26sei%3DinCuacHzLa2eseMPi5bwKA&q=EgRnsOoSGIvhuc0GIjA9tJovb5uaFzrjNkm0s96h9YqZxjXAMFSG_AizSCQ0-wCt5JGRIkJmlwx1_7kLI5oyAVJaAUM"));
    }
}
