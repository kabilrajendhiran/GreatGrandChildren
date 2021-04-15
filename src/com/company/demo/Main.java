package com.company.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GreatGrandChildren greatGrandChildren = new GreatGrandChildren();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name= scanner.next();
        System.out.println("Enter the depth");
        int depth =  scanner.nextInt();

        ArrayList<String> arrayList =  greatGrandChildren.getChildren(name);

        System.out.println("Children");

        arrayList.forEach(child->{
            System.out.println(child);
        });

        System.out.println();

        for (int i = 0; i < depth-1; i++) {
            if(arrayList.size()==0)
            {
                break;
            }

            String heading = "";
            for (int j = 0; j < i; j++) {
                heading = heading+"Great ";
            }
            heading = heading+"Grand Children";
            System.out.println(heading);
            arrayList = greatGrandChildren.getGrandChidren(arrayList);

            System.out.println("Number of "+heading+" is "+arrayList.size());
            System.out.println();
        }

    }
}
