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

public class Patient {
    private static Map<Integer, Patient > patientDetails = new HashMap<>();
    private static int patientID = 202303001;
    private static String patientName;
    private static String dateOfAddmission;
    private static int bedHeadTicketNumber;
    
    public Patient (String patientName, int bedHeadTicketNumber, String dateOfAddmission, int bedHeadTicketNumber1){
        this.patientName = patientName;
        this.dateOfAddmission = dateOfAddmission;
        this.bedHeadTicketNumber = bedHeadTicketNumber;
       
    }
    public static int getPatientID(){
        return patientID;
    }
    public static String getPatientName(){
        return patientName;
    }
    public static String getdDateOfAddmission(){
        return dateOfAddmission;
    }
    public static int getBedHeadTicketNumber(){
        return bedHeadTicketNumber;
    }
    public static void setPatientDetails(){
        Scanner patient = new Scanner (System.in);
        
        System.out.println("Enter the name of the Patient ");
        patientName = patient.nextLine();
        System.out.println("Enter the date of the addmission ");
        dateOfAddmission = patient.nextLine();
        System.out.println("Enter the bed head ticket number ");
        bedHeadTicketNumber = patient.nextInt();
        System.out.println("Patient added succesfully.........");
        patientDetails.put(patientID, new Patient( patientName,  patientID,  dateOfAddmission,  bedHeadTicketNumber ));
        System.out.println("Patient Id :-"+getPatientID());
        patientID++;
        
    }
        
    public static void getPatientDetails(int patientID){
        if (patientDetails.containsKey(patientID)){
        Patient patient = patientDetails.get(patientID);
        System.out.println("Patient Name:- "+patient.getPatientName());
        System.out.println("Date of Addmission:- "+patient.getdDateOfAddmission());
        System.out.println("Bed Head Ticket Number:- "+patient.getBedHeadTicketNumber());
        }else {
        System.out.println("Invalid patient ID. Patient details not found.");
    }
        
    }
   public static void getAllDetailsOfPatient(){
       for (Patient patient : patientDetails.values()) {
        System.out.println("Patient Name:- "+patient.getPatientName());
        System.out.println("Date of Addmission:- "+patient.getdDateOfAddmission());
        System.out.println("Bed Head Ticket Number:- "+patient.getBedHeadTicketNumber());
           
       }
   }
 public static boolean checkPatientID(int patientID) {
    return patientDetails.containsKey(patientID);
}

    
}
