package com.kodilla.exception.main;

import com.kodilla.exception.FileReaderException;
import com.kodilla.exception.io.FileReader;

public class ExceptionModuleRunner {

    public static void main(String args[]) {

        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
