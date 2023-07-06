package com.company.theLast;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainReborn {

    public static void main(String[] args) {

        String[] roles = new String[]{"loh", "chicken", "cock", "ktovashe", "loh duratski"};
        String[] texLines = new String[]{
                "loh: kuku vsem loh: \"kavo tut zaneslo\"",
                "chicken: qoqoqo",
                "loh: ti ptica, lelat ne umeesh haha",
                "cock: ti checken ne obizhai",
                "loh: nu ladno, ya to sam loh",
                "chicken: qoqoqoc",
                "loh duratski: opa a ya to tut",
                "chicken: alo vi vahe tut"};

        System.out.println(printTextPerRole(roles, texLines));

    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder();

        Map<String, StringBuilder> map = new HashMap<>();

        for (String r : roles) {
            map.put(r, new StringBuilder());
        }

        for (int i = 0; i < textLines.length; i++) {

            String[] roleAndTextSplit = textLines[i].split(": ", 2);

            map.get(roleAndTextSplit[0]).append(i + 1).append(") ").append(roleAndTextSplit[1]).append("\n");

        }

        for (String role : roles) {
            sb.append(role).append(":").append("\n");
            sb.append(map.get(role));
        }

        return sb.toString();
    }
}
