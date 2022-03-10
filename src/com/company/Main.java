package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Car,CarsData> maps = new HashMap<>();
        Car car1 = new Car(123245,"AB1233");
        Car car2 = new Car(253685,"AB4563");
        Car car3 = new Car(173985,"CB6583");
        Car car4 = new Car(446985,"CB9583");
        Car car5 = new Car(347985,"SB9583");

        CarsData carSdata1 = new CarsData("2020","BMW",42345,"Black");
        CarsData carSdata2 = new CarsData("2017","Mersedes",20345,"White");
        CarsData carSdata3 = new CarsData("2021","Toyota",12455,"Red");
        CarsData carSdata4 = new CarsData("2002","Woks Vagen",12345,"Blue");
        CarsData carSdata5 = new CarsData("2005","Audi",23000,"Yellow");

        maps.put(car1,carSdata1);
        maps.put(car2,carSdata2);
        maps.put(car3,carSdata3);
        maps.put(car4,carSdata4);
        maps.put(car5,carSdata5);

        for (Map.Entry<Car,CarsData> cars : maps.entrySet()) {
            System.out.println("Id and Number: " + cars.getKey() + " Datas of car: " + cars.getValue());
        }




    }
}



//    Map<Integer,String> person = new HashMap<Integer,String>();
//        person.put(1223343555,"Abdyraeva Nurzhan");
//        person.put(1237884909,"Sultanmuratova Nargiza");
//        person.put(1233549039,"Allanov Mukhamed");
//        person.put(1247749039,"Mamakadyr uulu Beksultan");
//        person.put(464649039,"Aizhan eje");
//
//        for (Map.Entry<Integer,String> item : person.entrySet()) {
//            System.out.println("Kluchi: " + item.getKey() + " Znachenie: " + item.getValue());
//        }
//
//
//
//        System.out.println(person.get(1237884909));
//        System.out.println(person.keySet());
//        System.out.println(person.values());
//        System.out.println(person.replace(1237884909," have not name"));
//        System.out.println(person.get(1237884909));
//        System.out.println(person.remove(1237884909));
//        System.out.println(person.values());
//        System.out.println(person.size());
//        person.clear();