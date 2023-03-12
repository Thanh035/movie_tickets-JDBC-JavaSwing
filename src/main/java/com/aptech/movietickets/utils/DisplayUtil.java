package com.aptech.movietickets.utils;

import java.sql.Timestamp;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class DisplayUtil {

    public static String printCurrency(double currencyAmount, String outputCurrency) {
        Locale locale;

        if (outputCurrency.equals("Yen")) {
            locale = new Locale("jp", "JP");
        } else if (outputCurrency.equals("Euros")) {
            locale = new Locale("de", "DE");
        } else if (outputCurrency.equals("Dollars")) {
            locale = new Locale("en", "US");
        } else if (outputCurrency.equals("Vietnamese Dongs")) {
            locale = new Locale("vi", "VN");
        } else {
            locale = new Locale("vi", "VN");
        }
//        else {
//            locale = new Locale("en", "US");
//        }

        Currency currency = Currency.getInstance(locale);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        return numberFormat.format(currencyAmount);
    }

    public static Timestamp getTimeStampNow() {
        return new Timestamp(System.currentTimeMillis());
    }

}
