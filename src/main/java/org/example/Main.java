package org.example;

import io.netty.handler.codec.DateFormatter;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String firstName = "Julia ";
        String storeName = "Noble";
        int discount = 65;
        double shipping = 99.99;
        String product = "shoes";
        double productPrice = 69.99;
        String brand = "Timberland";
        Date currentTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE ", Locale.ENGLISH);
        String formattedTime = dateFormat.format(currentTime);
        byte endPeriod = 2;


        System.out.println("Dear " + firstName + ", welcome to " + storeName + "! ");
        System.out.println("These deals are too good to resist! Up to " + discount + "% of your favorite " + product + "! Free shipping on orders over $" + shipping + "! ");
        System.out.println("Never pay more! Get " + brand + " boots for as low as $" + productPrice + "! Act fast, it's " + formattedTime + "already! The deal is ending in " + endPeriod + " days!");

        int MaySale = 15000;
        int JuneSale = 20000;
        int JulySale = 34000;
        int totalSale = MaySale + JulySale + JuneSale;
        System.out.println("Total Sales: $" + totalSale);

        int i = 100;
        int salesDifference = JuneSale - MaySale;
        double changeInSale = (((double) salesDifference / MaySale)*i);
        System.out.println("June's Change in Sales: " + changeInSale);

        


    }
}