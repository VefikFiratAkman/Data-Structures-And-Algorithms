package com.company;

import java.io.IOException;
/**
 * Main class
 * Have a main method of all program.
 * @author VefikFiratAkman.
 * @version 1.00.
 */
public class Main {
    /**
     * Main method of all program.
     * Have a try/catch exception system. For IOException.
     * @param args for command line input.
     */
    public static void main(String[] args) {

        system user1;
        try {
            user1 = new system();
            user1.mainSystem();
        } catch (IOException e) {
            System.err.println("IOException Detected! Please Close CSV File After Start Program Again. ");
        }


    }
}
