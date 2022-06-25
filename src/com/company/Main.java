package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer,City> hashMap=new HashMap();
        hashMap.put(1,new City(5,"Batken"));
        hashMap.put(2,new City(6,"Jalal-Abad"));
        hashMap.put(3,new City(4,"Bishkek"));
        hashMap.put(4,new City(7,"Osh"));
        hashMap.put(5,new City(3,"Naaryn"));
        hashMap.put(6,new City(8,"Kara-Bak"));
        hashMap.put(7,new City(2,"Talas"));
        hashMap.put(9,new City(9,"Chuy"));
        hashMap.put(8,new City(1,"Isyk-Kul"));

        Set<Integer>set=new TreeSet<>(Comparator.reverseOrder());
        for (City city :hashMap.values()) {
            if (city.getCode()%2==1){
                set.add(city.getCode());
            }else{
                System.out.println(city);
            }
        }
        System.out.println("""
        ___________________________
          Odd numbers here: """);
        for (Integer in :set) {
            System.out.println(in);
        }
    }
}
