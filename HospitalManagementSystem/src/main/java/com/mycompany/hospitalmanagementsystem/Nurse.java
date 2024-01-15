/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author thath
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Nurse extends Employee {
    private static Map<Integer, Nurse> nurseDetails = new HashMap<>();
    private static int nurseRegistrationNumber;
    private static int nurseEmployeeNumber = 202302001;
    private static String nurseName;

    public Nurse(int employeeNumber, String employeeName, int nurseRegistrationNumber, Shift shift) {
        super(employeeNumber, employeeName, shift);
        this.nurseRegistrationNumber = nurseRegistrationNumber;
    }

    private Nurse(int nurseEmployeeNumber, String nurseName, int nurseRegistrationNumber) {
       
    }

    public static  String getNurseName() {
        return nurseName;
    }

    public static int getNurseEmployeeNumber() {
        return nurseEmployeeNumber;
    }

    public static int getNurseRegistrationNumber() {
        return nurseRegistrationNumber;
    }

    public static void setNurseDetails() {
        Scanner nurseScanner = new Scanner(System.in);

        System.out.println("Enter the name of the nurse");
        nurseName = nurseScanner.nextLine();
        System.out.println("Enter the Registration Number ");
        nurseRegistrationNumber = nurseScanner.nextInt();
        nurseScanner.nextLine();
        nurseDetails.put(nurseEmployeeNumber, new Nurse(nurseEmployeeNumber, nurseName, nurseRegistrationNumber));
        System.out.println("The Employee Id: " + getNurseEmployeeNumber());
        System.out.println("The Employee added successfully ");
        nurseEmployeeNumber++;
    }

    public static void getNurseDetails(int nurseEmployeeNumber) {
        if (nurseDetails.containsKey(nurseEmployeeNumber)) {
            Nurse nurse = nurseDetails.get(nurseEmployeeNumber);
            System.out.println("Employee ID:-" + nurse.getNurseEmployeeNumber());
            System.out.println("Employee name:-" + nurse.getNurseName());
            System.out.println("The Nurse Registration Number:- " + nurse.getNurseRegistrationNumber());
        } else {
            System.out.println("Invalid Employee ID. Employee details not found.");
        }
    }

    public static void getAllDetailsOfNurse() {
        for (Nurse nurse : nurseDetails.values()) {
            System.out.println("Employee ID:-" + nurse.getNurseEmployeeNumber());
            System.out.println("Employee name:-" + nurse.getNurseName());
            System.out.println("The Nurse Registration Number:- " + nurse.getNurseRegistrationNumber());
        }
    }

    public static  boolean checkNurseID(int nurseEmployeeNumber) {
        return nurseDetails.containsKey(nurseEmployeeNumber);
    }
}

