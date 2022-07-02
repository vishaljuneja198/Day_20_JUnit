package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class RegexFirstName {

    Pattern pattern = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");

    boolean checkName(String name){
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}