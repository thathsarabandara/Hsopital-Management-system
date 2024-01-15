/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalmanagementsystem;

/**
 *
 * @author thath
 */
public class Employee {
    static int employeeNumber = 202301001;
    static String employeeName;
    Shift shift;

    enum Shift {
        Morning,
        Evening,
        Night,
        FullDay
    }

    public Employee(int employeeNumber, String employeeName, Shift shift) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.shift = shift;
    }

    Employee() {
    }

    public static void setEmployeeName(String employeeName) {
        Employee.employeeName = employeeName;
    }

    public static int getEmployeeNumber() {
        return employeeNumber;
    }

    public static String getEmployeeName() {
        return employeeName;
    }
}
