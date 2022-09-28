package com.greatlearning.project.main;


import com.greatlearning.project.bean.*;

public class App {
    public static void main(String[] args) {

        AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();

        System.out.println(
                String.format(
                        "Welcome to %s\n" +
                                "%s\n" +
                                "%s\n" +
                                "%s\n",
                        adminDepartment.departmentName(),
                        adminDepartment.getTodaysWork(),
                        adminDepartment.getWorkDeadline(),
                        adminDepartment.isTodayAHoliday()
                )
        );

        System.out.println(
                String.format(
                        "Welcome to %s\n" +
                                "%s\n" +
                                "%s\n" +
                                "%s\n" +
                                "%s\n",
                        hrDepartment.departmentName(),
                        hrDepartment.doActivity(),
                        hrDepartment.getTodaysWork(),
                        hrDepartment.getWorkDeadline(),
                        hrDepartment.isTodayAHoliday()
                )
        );

        System.out.println(
                String.format(
                        "Welcome to %s\n" +
                                "%s\n" +
                                "%s\n" +
                                "%s\n" +
                                "%s\n",
                        techDepartment.departmentName(),
                        techDepartment.getTodaysWork(),
                        techDepartment.getWorkDeadline(),
                        techDepartment.getTechStackInformation(),
                        techDepartment.isTodayAHoliday()
                )
        );



    }
}

