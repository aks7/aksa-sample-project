package com.aksa.sample.proj.test;
import java.util.*;
import java.text.*;

public class NumberFormatUse {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us,india,china,france;
        
        // Write your code here.
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        NumberFormat nfIndia = NumberFormat.getInstance(Locale.FRENCH);
        NumberFormat nfChina = NumberFormat.getInstance(Locale.CHINA);
        NumberFormat nfFrance = NumberFormat.getInstance(Locale.FRENCH);

        us=nfUs.format(payment);
        india=nfIndia.format(payment);
        china=nfChina.format(payment);
        france=nfFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

