package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly kk = new RWOnly();
       // kk.name=vikas;
        kk.setName("vikas");
        kk.getName();
    }
}