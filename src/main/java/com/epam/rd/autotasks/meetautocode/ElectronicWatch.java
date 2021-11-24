package com.epam.rd.autotasks.meetautocode;

import java.sql.Time;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = Math.abs(scanner.nextInt());
        currentDailyTime(seconds);
    }

    public static void currentDailyTime(int sec) {
        Time time = new Time(00, 00, sec);
        String printTime = time.toString();

        if (printTime.charAt(0) == '0') {
            System.out.println(printTime.substring(1));
        } else {
            System.out.println(printTime);
        }
    }
}