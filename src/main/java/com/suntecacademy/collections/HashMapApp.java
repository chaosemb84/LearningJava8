package com.suntecacademy.collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapApp {

    public static void main(String[] args) {
        HashMap<String,String> capitals=new HashMap<>();

        capitals.put("AE","United Arab Emirates");
        capitals.put("AU","Australia");
        capitals.put("JP","Japan");
        capitals.put("CA","Canada");
        capitals.put("MY","Malaysia");

        System.out.println(capitals);

        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();

        if(capitals.containsKey(input) && input.equals("AE")){
            System.out.println("United Arab Emirates is in list");
        }else if(capitals.containsKey(input) && input.equals("AU")){
            System.out.println("Australia is in list");
        }else if(capitals.containsKey(input) && input.equals("JP")){
            System.out.println("Japan is in list");
        }else if(capitals.containsKey(input) && input.equals("CA")){
            System.out.println("Canada is in list");
        } else if(capitals.containsKey(input) && input.equals("MY")){
            System.out.println("Malaysia is in list");
        }
    }
}
