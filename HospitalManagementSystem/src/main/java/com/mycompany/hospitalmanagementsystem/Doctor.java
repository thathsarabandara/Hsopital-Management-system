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
import java.util.Scanner;
import java.util.Map;

public class Doctor extends Employee {
    private static Map <Integer, Doctor> doctorsDetails  = new HashMap <>();
    private static int  doctorEmployeeNumber = 202301001 ;
    private static String doctorName;
    
   private static int registrationNumberSLMC;

    Doctor(int employeeNumber1, String employeeName1, int registrationNumberSLMC1, TypeOfSurgeon typeOfSurgeon1) {
      
    }


   enum TypeOfSurgeon{
       General,
       Cardiothoratic,
       Neuro,
       Pediatric,
       Plastic,
       Otolaryngology
   }
   private static TypeOfSurgeon typeOfSurgeon;
   
   public Doctor(int employeeNumber, String employeeName, int registrationNumberSLMC, TypeOfSurgeon typeOfSurgeon, Shift shift) {
        super(employeeNumber, employeeName, shift);
        this.registrationNumberSLMC = registrationNumberSLMC;
        this.typeOfSurgeon = typeOfSurgeon;
    }
    private static String getDoctorName(){
        return doctorName;
    }
    private static int getDoctorEmployeeNumber(){
        return doctorEmployeeNumber;
    }
     private static int getRegistrationSLMC(){
        return registrationNumberSLMC;
    }
    private static TypeOfSurgeon getTypeOfSurgeon(){
        return typeOfSurgeon;
    }
   public static void setDoctorsDetails(){
        Scanner doctor = new Scanner(System.in);
        
       System.out.println("Enter the name of the doctor");
        doctorName = doctor.nextLine(); 
        System.out.println("Enter the SLMC Registration Number ");
        registrationNumberSLMC = doctor.nextInt();
        doctor.nextLine(); 
        System.out.println("Enter the Type of the Doctor  ");
        System.out.println("(General , cardiothoracic , Neuro , pediatric , Plastic , Otalaryngology )");
        typeOfSurgeon = TypeOfSurgeon.valueOf(doctor.nextLine());
        doctorEmployeeNumber++;
        doctorsDetails.put(doctorEmployeeNumber, new Doctor(doctorEmployeeNumber, doctorName , registrationNumberSLMC , typeOfSurgeon ));
        System.out.println("The Employee Id"+Employee.getEmployeeNumber());
        System.out.println("The Employee added succsesfully ");
    
    }
    public static void getDoctorDetails(int doctorEmployeeNumber){
        if (doctorsDetails.containsKey(doctorEmployeeNumber)){
        Doctor doctor = doctorsDetails.get(doctorEmployeeNumber);
        System.out.println("Employee Number:-"+doctor.getDoctorEmployeeNumber());
        System.out.println("Name of the Employee:-"+doctor.getDoctorName());
        System.out.println("SLMC Registration:-"+doctor.getRegistrationSLMC());
        System.out.println("Type of the Doctor:-"+doctor.getTypeOfSurgeon());
        }else {
        System.out.println("Invalid Employee Number. Employee details not found.");
    }
        
    }
    public static void getAllDoctorsDetails(){
        for(Doctor doctor : doctorsDetails.values()){
        System.out.println("EmployeeNumber:-"+doctor.getDoctorEmployeeNumber());
        System.out.println("Name of the Employee:-"+doctor.getDoctorName());
        System.out.println("SLMC Registration:-"+doctor.getRegistrationSLMC());
        System.out.println("Type of the Doctor:-"+doctor.getTypeOfSurgeon());
        System.out.println("------------------------------");
        }
    }
    public static boolean checkDoctorID(int doctorEmployeeNumber) {
       return doctorsDetails.containsKey(doctorEmployeeNumber);
  }
}
