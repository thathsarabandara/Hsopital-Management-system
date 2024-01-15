/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author thath
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ward {
    private static Map<Integer, Ward> wardDetails = new HashMap<>();

    private static String wardName;
    private static int wardNumber;
    private static int houseOfficer;
    private static TypeOfWard typeOfWard;

    public static  enum TypeOfWard {
        General,
        Cardiothoracic,
        Neuro,
        Pediatric,
        Plastic,
        Otolaryngology
    }

    public Ward(String wardName, int wardNumber, int houseOfficer, TypeOfWard typeOfWard) {
        this.wardName = wardName;
        this.wardNumber = wardNumber;
        this.houseOfficer = houseOfficer;
        this.typeOfWard = typeOfWard;
    }

    public String getWardName() {
        return wardName;
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public int getHouseOfficer() {
        return houseOfficer;
    }

    public TypeOfWard getTypeOfWard() {
        return typeOfWard;
    }

    public static void setWardDetails() {
        Scanner ward = new Scanner(System.in);
        System.out.println("Enter the name of the Ward:-");
        String wardName = ward.nextLine();
        System.out.println("Enter the type of the Ward:- ");
        TypeOfWard typeOfWard = TypeOfWard.valueOf(ward.nextLine());
        System.out.println("Enter the Employee number of house Officer ");
        int houseOfficer = ward.nextInt();
        System.out.println("Ward added successfully");

        wardDetails.put(wardNumber, new Ward(wardName, wardNumber, houseOfficer, typeOfWard));
        
        System.out.println("Here is the ward number :-" + wardNumber);
        wardNumber++;
    }

    public static void getWardDetails(int wardNumber) {
    if (wardDetails.containsKey(wardNumber)) {
        Ward ward = wardDetails.get(wardNumber);
        System.out.println("Ward Number: " + ward.getWardNumber());
        System.out.println("Ward Name: " + ward.getWardName());
        System.out.println("Ward Type: " + ward.getTypeOfWard());
        System.out.println("House Officer: " + ward.getHouseOfficer());
    } else {
        System.out.println("Invalid Ward Number. Ward details not found.");
    }
}

    
    public static void getAllWardDetails() {
    for (Ward ward : wardDetails.values()) {
        System.out.println("Ward Number: " + ward.getWardNumber());
        System.out.println("Ward Name: " + ward.getWardName());
        System.out.println("Ward Type: " + ward.getTypeOfWard());
        System.out.println("House Officer: " + ward.getHouseOfficer());
        System.out.println("------------------------------");
    }
}
     public static boolean checkWardID(int wardNumber) {
       return wardDetails.containsKey(wardNumber);
}

}
