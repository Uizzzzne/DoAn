package com.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.util.Random;

@Component
public class Common {

    @Autowired
    private Random random;

    @Autowired
    private DecimalFormat decimalFormat;

    public int getSize(Object[] items) {
        return items.length;
    }

    public String randString(String[] items) {
        return items[random.nextInt(getSize(items))];
    }

    public String formatPrice(Double price) {
        return decimalFormat.format(price);
    }
}
