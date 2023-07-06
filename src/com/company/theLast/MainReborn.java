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

        List<Pattern> patternList = new ArrayList<>();

        Map<Pattern, StringBuilder> map = new HashMap<>();

        for (String role : roles) {
            patternList.add(Pattern.compile(role + ":"));
        }

        for (Pattern r : patternList) {
            map.put(r, new StringBuilder());
        }

        for (int i = 0; i < textLines.length; i++) {

            for (Pattern cPattern : patternList) {
                Matcher matcher = cPattern.matcher(textLines[i]);

                if (matcher.find() && matcher.start() == 0) {
                    map.get(cPattern).append(i+1).append(") ").append(textLines[i], matcher.end() + 1, textLines[i].length()).append("\n");
                    break;
                }
            }
        }

        for (Pattern role : patternList) {
            sb.append(role).append("\n");
            sb.append(map.get(role));
        }

        return sb.toString();
    }
}
