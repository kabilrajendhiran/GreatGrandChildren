package com.company.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class GreatGrandChildren {
    String arr[][] = {
            {"Lava" , "Rama"},
            {"Lava's Son1", "Lava"},{"Lava's Son2", "Lava"},{"Lava's Son3", "Lava"},
            {"Lava's Son1's Son","Lava's Son1"},
            {"Kusha" , "Rama"} ,
            {"Rama" , "Dasarathan"},
            {"Lakshman" , "Dasarathan"} ,
            {"Angad", "Lakshman"},
            {"Dharamketu","Lakshman"},
            {"Abhisek","Amitabh"},
            {"Aaradhya","Abhisek"}
    };

    int count = 1;

    public ArrayList<String> getChildren(String name)
    {
        ArrayList<String> arrayList = new ArrayList();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i][1].equals(name)) {
              //  System.out.println(arr[i][0]);
                arrayList.add(arr[i][0]);
            }
        }
        return arrayList;
    }

    public ArrayList<String> getGrandChidren(ArrayList<String> arrayList)
    {
        ArrayList<String> arrayList1 = new ArrayList<>();

        for (String data:arrayList) {
            ArrayList<String> arrayList2 = getChildren(data);
            arrayList1.addAll(arrayList2);
        }

        for (String name:arrayList1 ) {
            System.out.println(name);
        }

        return arrayList1;
    }
}
