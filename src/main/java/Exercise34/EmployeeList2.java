/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matias Gacitua
 */

package Exercise34;

import java.util.ArrayList;

public class EmployeeList2
{
    private ArrayList<String> employees;

    public EmployeeList2()
    {
        employees = new ArrayList<>();
        employees.add("Janet Jackson");
        employees.add("Angelina Jolie");
        employees.add("Brad Pitt");
        employees.add("Tom Cruise");
        employees.add("Halle Berrie");
        employees.add("Samuel Jackson");
        employees.add("John Travolta");
        employees.add("Uma Thurman");
    }

    public ArrayList<String> getEmployees()
    {
        return employees;
    }

    public void removeEmployee(String employeeName)
    {
        if(! employees.contains(employeeName))
        {
            throw new IllegalArgumentException("That employee does not exist.");
        }
        else
        {
            employees.remove(employeeName);
        }
    }
}