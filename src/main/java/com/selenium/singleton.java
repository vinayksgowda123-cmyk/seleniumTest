package com.selenium;

public class singleton {
    private singleton(){

    }

    private static class Holder{
        private static final singleton INSTANCE = new singleton();
    }

    public static singleton getInstance(){
        return Holder.INSTANCE;
    }
}
