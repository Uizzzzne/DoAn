package com.app.util;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {

        DecimalFormat priceFormat = new DecimalFormat("##,### đ");

        Double price = 10000000D;

        System.out.println(priceFormat.format(price));


    }
}
