package com.company.cursor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //task 1
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            if (a % 3 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("ArrayList " + list);

        //task 2
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Strawberry");
        fruitList.add("Orange");
        fruitList.add("Grape");
        boolean hasOrange = false;
        for (int i = 0; i < fruitList.size(); i++) {
            if (fruitList.get(i) == "Orange") {
                fruitList.set(i, "GrapeFruit");
                hasOrange = true;
            }

        }
        if (!hasOrange) {
            System.out.println("Value has not present");
        }
        System.out.println("fruitList " + fruitList);

        //task 3
        Date date1 = new Date(2003, 01, 24);
        Date date2 = new Date(2003, 04, 02);
        Date date3 = new Date(1973, 04, 30);
        Date date4 = new Date(1976, 01, 10);
        Date date5 = new Date(1973, 04, 30);
        Date date6 = date3;
        Date date7 = new Date(1999, 9, 9);
        ArrayList<Date> dateArrayList1 = new ArrayList<>();
        dateArrayList1.add(date1);
        dateArrayList1.add(date3);
        dateArrayList1.add(date7);
        ArrayList<Date> dateArrayList2 = new ArrayList<>();
        dateArrayList2.add(date2);
        dateArrayList2.add(date6);
        dateArrayList2.add(date5);
        dateArrayList2.add(date4);
        System.out.println("DateArrayList1: " + dateArrayList1);
        System.out.println("DateArrayList2: " + dateArrayList2);
        for (int i = 0; i < dateArrayList1.size(); i++) {
            for (int j = 0; j < dateArrayList2.size(); j++) {
                if (dateArrayList1.get(i) == dateArrayList2.get(j)) {
                    System.out.println("These arrays have similar element: " + dateArrayList1.get(i));
                }
            }
        }
    }
}
