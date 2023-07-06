package com.company.first;

public class Main {

    public static void main(String[] args) {
        System.out.println(drawisMonitorCounter(100,1));
    }

    public static int drawisMonitorCounter(int monitors, int programmers){
        int a =0;
        a = programmers == 1 ? monitors : monitors % programmers;
        //return monitors % programmers;
        return a;
    }
}