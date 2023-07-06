package com.company.theLast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String[] roles = new String[]{"loh", "chicken", "cock", "ktovashe", "loh duratski"};
        String[] texLines = new String[]{
                "loh: kuku vsem loh: \"kavo tut zaneslo\"",
                "chicken: qoqoqo",
                "loh: ti ptica, lelat ne umeesh haha",
                "cock: ti checken ne obizhai",
                "loh: nu ladno, ya to sam loh",
                "chicken: qoqoqoc",
                "loh duratski: opa a ya to tut"};

        System.out.println(printTextPerRole(roles, texLines));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder();

        for (String role : roles) {
            sb.append(role).append(":").append("\n");

            Pattern pattern = Pattern.compile(role + ":");

            for (int i = 0; i < textLines.length; i++) {
                Matcher matcher = pattern.matcher(textLines[i]);

                if (matcher.find() && matcher.start() == 0) {
                    sb.append(i + 1).append(") ").append(textLines[i], matcher.end()+1, textLines[i].length()).append("\n");
                }
            }

            sb.append("\n");

        }

        return sb.toString();
    }

}
