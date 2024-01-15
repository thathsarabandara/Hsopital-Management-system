/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author thath
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class HospitalManagementSystem {

    public HospitalManagementSystem(int tempPatientID, int tempDoctorID, int tempNurseID, int tempWardID) {
    }
    private static Map <Integer, HospitalManagementSystem> hospitalServiceList = new HashMap<> ();
    static Scanner hospitalInput = new Scanner(System.in);
    static int serviceId =001;
    
    
    public static void main(String[] args) {
        System.out.println("------------------------------------Welcome to the Hospital Management System --------------------------------------------------");
        System.out.println("------------------------------------------We are Here To Assist You ------------------------------------------------------------");
        int loop=0;
        while(loop !=6){
            displayMenu();
            loop = hospitalInput.nextInt();
            switch(loop){
                case 1 -> {
                    displayDoctorsMenu();
                    System.out.println("Welcome to the Doctors Menu");
                    System.out.println("How can I help you");
                }
                case 2 -> {
                    displayNurseMenu();
                    System.out.println("Welcome to the Nurse Menu");
                    System.out.println("How can I help you");
                }
                case 3 -> {
                    displayPatientMenu();
                    System.out.println("Welcome to the patient Menu");
                    System.out.println("How can I help you");
                }
                case 4 -> {
                    displayWardMenu();
                    System.out.println("Welcome to the Ward Menu");
                    System.out.println("How can I help you");
                }
                case 5 ->{
                    System.out.println("Adding Patient to the ward ");
                    addPatientAndEmployeesToTheWard();
                }
                case 6 -> {
                    System.out.println("Exiting From the Hospital Management System");
                    System.out.println("Good bye , Have a Nice day ");
                }
                default -> System.out.println("You Entere invalid number , Enter No 1,2,3,4 or 5 as Input ");
            }    
        }
    }
    public static void displayMenu(){
        System.out.println("1.Open Doctors Menu");
        System.out.println("2.Open Nurse Menu ");
        System.out.println("3.Open Patient Menu ");
        System.out.println("4.Open Ward Menu");
        System.out.println("5.Admit a Patient to the Ward");
        System.out.println("6.Exit From the Hospital Managment System ");
    }
    //----------------------------------------------------------case 1 -----------------------------------------------------------------
    public static void displayDoctorsMenu(){
        Scanner doctorsInput =  new Scanner (System.in);
        int doctorsLoop =0;
         while(doctorsLoop != 4){
             displayDoctorsInnerMenu();
             doctorsLoop = doctorsInput.nextInt();
             switch(doctorsLoop){
                 case 1:
                     Doctor.setDoctorsDetails();
                     System.out.println("Wait, Adding In progress ");
                     break;
                 case 2:
                     Doctor.getAllDoctorsDetails();
                     System.out.println("Wait, List is loading..........");
                     break;
                 case 3:
                     System.out.println("Wait.......System is preparing........");
                     System.out.println("Enter the ID");
                     int tempID = doctorsInput.nextInt();
                     Doctor.getDoctorDetails(tempID);
                     break;
                 case 4:
                     System.out.println("Exiting from the Docters Menu ");
                     break;
                 default :
                     System.out.println("You enterd invalid number , Please input 1,2 or 3 for valid input");
                     break;
             }
             
         }
    }
    public static void displayDoctorsInnerMenu(){
        System.out.println("1.Add a Doctors to the Menu ");
        System.out.println("2.Display Currently Registered Doctors List ");
        System.out.println("3 Search doctor by Id ");
        System.out.println("4.Exit from the Doctors Menu ");
    }
     //----------------------------------------------------------case 2 -----------------------------------------------------------------
    public static void  displayNurseMenu(){
        Scanner nurseInput =  new Scanner (System.in);
        int nurseLoop =0;
         while(nurseLoop != 4){
             displayNurseInnerMenu();
             nurseLoop = nurseInput.nextInt();
             switch(nurseLoop){
                 case 1 -> {
                     Nurse.setNurseDetails();
                     System.out.println("Wait, Adding In progress ");
                }
                 case 2 -> {
                     Nurse.getAllDetailsOfNurse();
                     System.out.println("Wait, List is loading..........");
                }
                 case 3 -> {
                     System.out.println("Wait.......System is preparing........");
                     System.out.println("Enter the ID");
                     int tempID = nurseInput.nextInt();
                     Nurse.getNurseDetails(tempID);
                }
                 case 4 -> System.out.println("Exiting from the Nurses Menu ");
                 default -> System.out.println("You enterd invalid number , Please input 1,2 or 3 for valid input");
             }
             
         }
        
    }
    public static void displayNurseInnerMenu(){
        System.out.println("1.Add a Nurse to the Menu ");
        System.out.println("2.Display Currently Registered Nurse List ");
        System.out.println("3 Search Nurse by Id ");
        System.out.println("4.Exit from the Nurse Menu ");
    }
     //----------------------------------------------------------case 3 -----------------------------------------------------------------
    public static void displayPatientMenu(){
       Scanner patientsInput =  new Scanner (System.in);
        int patientsLoop =0;
         while(patientsLoop != 4){
             displayPatientsInnerMenu();
             patientsLoop = patientsInput.nextInt();
             switch(patientsLoop){
                 case 1 -> {
                     Patient.setPatientDetails();
                     System.out.println("Wait, Adding In progress ");}
                 
                 case 2 -> {
                     Patient.getAllDetailsOfPatient();
                     System.out.println("Wait, List is loading..........");
               }
                 case 3 -> {
                     System.out.println("Wait.......System is preparing........");
                     System.out.println("Enter the ID");
                     int tempID = patientsInput.nextInt();
                     Patient.getPatientDetails(tempID);
               }
                 case 4 -> System.out.println("Exiting from the patient Menu ");
                 default -> System.out.println("You enterd invalid number , Please input 1,2 or 3 for valid input");
             }
             
         }
        
    }
     public static void displayPatientsInnerMenu(){
        System.out.println("1.Add a Patient to the Menu ");
        System.out.println("2.Display Currently Registered Patient List ");
        System.out.println("3 Search Patient by Id ");
        System.out.println("4.Exit from the Patient Menu ");
    }
     //----------------------------------------------------------case 4 -----------------------------------------------------------------
    public static void displayWardMenu(){
        Scanner wardInput =  new Scanner (System.in);
        int wardLoop =0;
         while(wardLoop != 4){
             displayWardInnerMenu();
             wardLoop = wardInput.nextInt();
             switch(wardLoop){
                 case 1 ->{ 
                     Ward.setWardDetails();
                     System.out.println("Wait, Adding In progress ");}
                 case 2 -> {
                     System.out.println("Wait, List is loading..........");
                     Ward.getAllWardDetails();
                }
                 case 3 -> {
                     System.out.println("Wait.......System is preparing........");
                     System.out.println("Enter the ID");
                     int tempID = wardInput.nextInt();
                     Ward.getWardDetails(tempID);
                }
                 case 4 -> System.out.println("Exiting from the Ward Menu ");
                 default -> System.out.println("You enterd invalid number , Please input 1,2 or 3 for valid input");
             }
             
         }
        
    }
    public static void displayWardInnerMenu(){
        System.out.println("1.Add a Ward to the Menu ");
        System.out.println("2.Display Currently Registered Ward List ");
        System.out.println("3 Search Ward by Id ");
        System.out.println(".Exit from the Ward Menu ");
    }

     public static void addPatientAndEmployeesToTheWard(){
         Scanner service = new Scanner(System.in);
         
         System.out.println("Enter the Patient ID");
         int tempPatientID = service.nextInt();
         System.out.println("Enter the Doctor ID ");
         int tempDoctorID = service.nextInt();
         System.out.println("Enter the Nurse ID ");
         int tempNurseID = service.nextInt();
         System.out.println("Enter the Ward Number ");
         int tempWardID = service.nextInt();
         
        
          if (Patient.checkPatientID(tempPatientID) && Doctor.checkDoctorID(tempDoctorID) && Nurse.checkNurseID(tempNurseID) && Ward.checkWardID(tempWardID)) {
             hospitalServiceList.put(serviceId, new HospitalManagementSystem(tempPatientID, tempDoctorID, tempNurseID, tempWardID));
             System.out.println("Patient admitted to the ward successfully.");
             serviceId++;
            } else {
              System.out.println("Invalid IDs. Unable to admit patient to the ward.");
            }

         
    }                     
}
