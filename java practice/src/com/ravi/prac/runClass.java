package com.ravi.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class runClass {

	public static void main(String[] args) {

        //sorting custom object array
        Employee[] empArr = new Employee[8];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(11, "Pankaj", 32, 50000);
        empArr[4] = new Employee(12, "Mikey1", 25, 9000);
        empArr[5] = new Employee(23, "Arun2", 29, 30000);
        empArr[6] = new Employee(4, "Lisa3", 35, 6000);
        empArr[7] = new Employee(15, "Pankaj4", 32, 40000);
        
        List<Employee> empList = new ArrayList<Employee>();
        
        for (Employee emp : empArr) {
        	empList.add(emp);
        }
        
        String s = null;
        
        if (null instanceof Object) {
        	System.out.println("null object");
        }
        
        String str1 = "new";
        
        String str2 = str1.toUpperCase();
        
        String str3 = str1.toString();
        
        String str4 = new String("new");
        
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.toUpperCase() == str4.toUpperCase());
        
        
        
        //sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Salary
        Arrays.sort(empArr, Employee.SalaryComparator);
        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Age
        Arrays.sort(empArr, Employee.AgeComparator);
        System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Name
        Arrays.sort(empArr, Employee.NameComparator);
        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
        
        //Employees list sorted by ID and then name using Comparator class
        //empArr[0] = new Employee(1, "Mikey", 25, 10000);
        Arrays.sort(empArr, Employee.AgeDescSalAsc);
        System.out.println("Employees list sorted by ID and Name:\n"+Arrays.toString(empArr));
        
        Collections.sort(empList, Employee.AgeDescSalAsc);
        System.out.println("Employees list sorted by ID and Name using Collections:\n"+empList);
    }

}
