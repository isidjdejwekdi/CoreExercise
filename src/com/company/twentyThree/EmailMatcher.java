package com.company.twentyThree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMatcher {
    public static void main(String[] args) {
        System.out.println(isGmailOrOutlook("misha1shtykar2@gmail.com"));
    }

    public static boolean isGmailOrOutlook(String email){

        return Pattern.matches("[a-zA-Z0-9]+@(outlook|gmail).com", email);
    }

}
