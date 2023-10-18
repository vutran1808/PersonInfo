/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ScannerFactory {

    private Scanner SCANNER;

    public Scanner getScanner() {
        if (SCANNER == null) {
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }

    public int getInt() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (input.matches("^[\\d]+")) {
                break;
            }
        }
        return Integer.parseInt(input);
    }

    public String getYN() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (input.matches("^[YyNn]")) {
                break;
            }
        }
        return input;
    }

    public String getString(String title) {
        String pattern = "[a-zA-Z0-9\\s]+";
        String input;
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (input.matches(pattern)) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        return input;
    }

    public String getFilePath(String title) {
        String input;
        String pattern = "([a-zA-Z]:)?(\\\\[a-zA-Z0-9_.-]+)+\\\\?";
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (input.matches(pattern)) {
                break;
            }
        }
        return input;
    }

    public float getDouble(String title) {
        String floatRegexp = "^(\\d+\\.)?\\d+$";
        String input;
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (input.matches(floatRegexp) && Double.parseDouble(input) > 0) {
                break;
            }
        }
        return Float.parseFloat(input);
    }

    public int getAge() {
        String input;
        while (true) {
            System.out.println("Enter age: ");
            input = getScanner().nextLine();
            if (input.matches("^[\\d]+") && (Integer.parseInt(input) >= 18 && Integer.parseInt(input) <= 50)) {
                break;
            }
        }
        return Integer.parseInt(input);
    }

    public String getCode() {
        String input;
        while (true) {
            System.out.println("Enter code: ");
            input = getScanner().nextLine();
            if (input.matches("^W\\d+")) {
                break;
            }
        }
        return input;
    }

}
