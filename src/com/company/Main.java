package com.company;

public class Main {

    public static void main(String[] args) {
	    parseInt("100");
        System.out.println(" ");
        parseDouble("100.00");

    }

    public static void parseInt (String intString){
        int parsedInt = Integer.parseInt(intString);
        System.out.println("parsed int = " + parsedInt);
        parsedInt++;
        System.out.println("parsed int + 1 = " + parsedInt);
    }

    public static void parseDouble(String doubleString){
          double parsedDouble = Double.parseDouble(doubleString);
        System.out.println("parsed double = " + parsedDouble);
        parsedDouble += 1.01;
        System.out.println("parsed double + 1.01 = " + parsedDouble);

    }
}
