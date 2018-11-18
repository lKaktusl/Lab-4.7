package com.company;

public class Main {

    public static void main(String[] args) {
	String s1 = "ABC", s2 = "Abc", s3 = "aBc", s4 = "ABc", s5 = "AbC";
	if (s4.equals(s5)) {
	    s1+=" "+s2;
    } else {
	    s1+=" "+s3;
    }
        System.out.println(s1);
    }
}
