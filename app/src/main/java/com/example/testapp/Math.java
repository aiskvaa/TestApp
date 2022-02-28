package com.example.testapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Math {
    public String add(String a,String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());

        if (num1<0 || num2<0){
            return "Ошибка обнаружили отрицательное число";
        }
        return String.valueOf(num1 + num2);
    }

    public String subtract(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 - num2);

    }

    public String multiply(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 * num2);

    }

    public String dividedByZero(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {

        }
        return  "число 2 ,  не можете разделить на ноль";

    }

    public String divide(String a,String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());

        return String.valueOf(num1 / num2);
    }

    public String areSymbolsIncluded(String a, String b) {
        Pattern p = Pattern.compile("[^a-c1-5 ]", Pattern.CASE_INSENSITIVE);
        Matcher m1 = p.matcher(a);
        boolean c = m1.find();


        if (c) {
        }
            return "Ошибка, обнаружены специальные символы-";


    }


}
