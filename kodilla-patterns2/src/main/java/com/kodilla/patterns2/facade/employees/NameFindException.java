package com.kodilla.patterns2.facade.employees;

public class NameFindException extends Exception{
    public static String ERROR_EMPLOYEE_NOT_FOUND = "Employee not found in the databse";
    public static String ERROR_COMPANY_NOT_FOUND = "Company not found in the database";

    public NameFindException(String message) {
        super(message);
    }
}
