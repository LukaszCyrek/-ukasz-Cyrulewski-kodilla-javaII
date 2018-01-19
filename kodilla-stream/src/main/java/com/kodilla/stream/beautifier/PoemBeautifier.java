package com.kodilla.stream.beautifier;

public class PoemBeautifier {
 static String changeStr(PoemDecorator a, String s){
     return a.decorate(s);
 }
    public static void main(String[] args) {
     String inStr = "To jest tekst wejściowy";
     String outStr;
     System.out.println("Zdanie: " +inStr);
        PoemDecorator reverse = (str) -> {
          String result = "";

          for (int i = str.length()-1; i>= 0; i--)
              result += str.charAt(i);
          return result;
        };
        outStr = changeStr(reverse, inStr);
        System.out.println("Zdanie od tyłu: " + outStr );

        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("Dodanie - zamiast spacji: " + outStr);

        outStr = changeStr((str) -> {
         String result = "";
         char a;

         for (int i = 0; i < str.length(); i++) {
             a = str.charAt(i);
             if (Character.isUpperCase(a));
             result += Character.toUpperCase(a);
            }
            return result;
        }, inStr);
        System.out.println("Tekst z dużych liter: " + outStr );

    }
    }

