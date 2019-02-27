package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class systemTest {

        system systemTest;

    {
        try {
            systemTest = new system();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static final String COMMA_DELIMITER = ";";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "roomNumber;ownerName;guessNumber;roomStatus;maxGuessNumber;pin";


    @org.junit.Test
    public void dataWriter() throws IOException {
        FileWriter fileW = new FileWriter("src\\com\\Data\\DataotelT.csv");
        fileW.append(FILE_HEADER);
        fileW.append(NEW_LINE_SEPARATOR);

        room room = new room();
        room.roomNumber = 112;
        room.roomStatus = "Full";
        room.ownerName = "Garen";
        room.maxGuessNumber = 4;
        room.guessNumber = 3;
        room.pin = 2102;


        fileW.append(String.valueOf(room.roomNumber));
            fileW.append(COMMA_DELIMITER);
            fileW.append(room.ownerName);
            fileW.append(COMMA_DELIMITER);
            fileW.append(String.valueOf(room.guessNumber));
            fileW.append(COMMA_DELIMITER);
            fileW.append(room.roomStatus);
            fileW.append(COMMA_DELIMITER);
            fileW.append(String.valueOf(room.maxGuessNumber));
            fileW.append(COMMA_DELIMITER);
            fileW.append(String.valueOf(room.pin));
            fileW.append(NEW_LINE_SEPARATOR);

        fileW.flush();
        fileW.close();


    }

    @org.junit.Test
    public void dataReader() throws IOException {

        BufferedReader fileReader;

        room room = new room();

        //Create a new list of student to be filled by CSV file data

        String line;

        //Create the file reader

        fileReader = new BufferedReader(new FileReader("src\\com\\Data\\DataotelT.csv"));

        //Read the CSV file header to skip it

        fileReader.readLine();

        //Read the file line by line starting from the second line

        while ((line = fileReader.readLine()) != null) {

            //Get all tokens available in line

            String[] tokens = line.split(COMMA_DELIMITER);

            room.roomNumber = Integer.parseInt(tokens[0]);
            room.ownerName = tokens[1];
            room.guessNumber = Integer.parseInt(tokens[2]);
            room.roomStatus = tokens[3];
            room.maxGuessNumber = Integer.parseInt(tokens[4]);
            room.pin = Integer.parseInt(tokens[5]);

        }


        fileReader.close();



    }

    @org.junit.Test
    public void booking() {
        Scanner sc = new Scanner(System.in);
        boolean guessOp = true;


        int usertype = 1;
        String username;
        String usernameT = "Ali";
        int guessNum;
        int guessNumT = 1;

        room room = new room();
        room.roomNumber = 107;
        room.roomStatus = "Empty";
        room.ownerName = "----";
        room.maxGuessNumber = 1;
        room.guessNumber = 0;
        room.pin = 0;




        if (usertype == 2) {
            boolean nameOp = true;

            while(nameOp) {
                System.out.println("What Is Your Customer's Name?\n");
                //username = sc.next();
                username = usernameT;
                if (username.length() > 10) {
                    System.out.println("Customer's Name Must Be Smaller Than 10 Characters");
                } else {
                    System.out.println("Welcome " + username + "!");
                    nameOp = false;
                }
            }
        }

        while (guessOp) {

            System.out.println("How many of you are?(1 mean just you)\n"
                    + "Remember, Our Biggest Room Size 4\n"
                    + "If You're More Than 4 People,You Need Reserve Again.");
            //guessNum = sc.nextInt();
            guessNum = guessNumT;

            if (guessNum < 1) {
                System.out.println("You Can't Enter <1!! Try Again");
            } else if (guessNum > 4) {
                System.out.println("More Than 4 People!\n"
                        + "Your Guess Number Fixed To 4!\n"
                        + "Don't Forget Other Friend And Reserve Again!");
                guessNum = guessNumT;
                guessOp = false;
            } else {
                guessOp = false;
            }
        }

        System.out.println("You Will See Just Suitable Room For Your Guess Number.");
        guessNum = guessNumT;
        if (room.roomStatus.equals("Empty")) {
            if (room.maxGuessNumber >= guessNum) {
                System.out.println("Room " + room.roomNumber + " is Empty.And Room Size: "
                        + room.maxGuessNumber + "\n");

            }
        }

    }

    @org.junit.Test
    public void reserve() {

        boolean operation = true;
        int input = 114;
        int choose;

        String  username = "Halil";
        int guessNum = 2;
        room room = new room();
        room.roomNumber = 114;
        room.roomStatus = "Empty";
        room.ownerName = "----";
        room.maxGuessNumber = 2;
        room.guessNumber = 0;
        room.pin = 0;

        while (operation) {
            System.out.println("Choose Room Please: Or -1 For Return \n");

            //choose = sc.nextInt();
            choose = input;
            choose = choose - 100;

            if (choose < 0 || choose > 29) {
                if(choose == -101){
                    operation = false;
                }
                else {
                    System.out.println("This Room Number Does Not Exist! Try Again.");
                }
            } else {

                if (room.roomStatus.equals("Empty") && room.maxGuessNumber >= guessNum) {
                    System.out.println("Room " + room.roomNumber + " is Reserved");
                    room.ownerName = username;
                    room.guessNumber = guessNum;
                    room.roomStatus = "Reserved";
                    System.out.println("Please Enter PIN For After Reservation Cancelling...");
                    //room.pin = sc.nextInt();
                    room.pin = 2114;

                    System.out.println("Success!Reservation Completed!");

                    operation = false;

                } else {
                    System.out.println("Wrong Room Status Or Size! Try Again.");

                }

            }
        }

    }

    @org.junit.Test
    public void cancelReserve() {

        Scanner sc = new Scanner(System.in);
        int choose;
        int upin;
        int usertype = 1;
        boolean cancelOP = true;

        room room = new room();
        room.roomNumber = 122;
        room.roomStatus = "Reserved";
        room.ownerName = "Adnan";
        room.maxGuessNumber = 3;
        room.guessNumber = 3;
        room.pin = 2122;

        int pinTest = 2122;
        int input = 122;


        while (cancelOP) {

            if(usertype == 2){
                for (int i = 0; i < 30; ++i) {
                    if (room.roomStatus.equals("Reserved")) {
                        System.out.println("Room " +room.roomNumber + " Is Reserved By "
                                + room.ownerName);
                    }
                }
            }

            System.out.println("Choose Room Please: Or -1 For Return ");
            if(usertype == 2){
                System.out.println("Remember: Admin Doesn't Need PIN For Cancel");
            }
            //choose = sc.nextInt();
            choose = input;

            choose = choose - 100;
            if (choose < 0 || choose > 29) {
                if(choose == -101){
                    cancelOP = false;
                }
                else {
                    System.out.println("This Room Number Does Not Exist! Try Again.");
                }
            } else {
                if (usertype == 1){
                    System.out.println("Enter Reservation Cancel PIN: \n");
                    //upin = sc.nextInt();
                    upin = pinTest;

                }
                else{

                    upin = room.pin;
                }

                if (room.roomStatus.equals("Reserved") && room.pin == upin) {
                    room.ownerName = "----";
                    room.guessNumber = 0;
                    room.roomStatus = "Empty";
                    room.pin = 0;
                    System.out.println("Success!Reservation Cancelled!");
                    cancelOP = false;
                } else {
                    System.out.println("Wrong Room Or Wrong PIN. Try Again.\n");
                }
            }
        }



    }

    @org.junit.Test
    public void adminRoomPanel(){

        room room = new room();
        room.roomNumber = 122;
        room.roomStatus = "Reserved";
        room.ownerName = "Adnan";
        room.maxGuessNumber = 3;
        room.guessNumber = 3;
        room.pin = 2122;


        System.out.print("Room " + room.roomNumber + "    " + room.roomStatus);

        for (int a = 10 - room.roomStatus.length(); a >= 0; --a){
            System.out.print(" ");
        }
        System.out.print("Owner's Name: " + room.ownerName);
        for (int a = 10 - room.ownerName.length(); a >= 0; --a){
            System.out.print(" ");
        }
        System.out.print("Room's Size: " + room.maxGuessNumber);
        for (int a = 3; a >= 0; --a){
            System.out.print(" ");
        }
        System.out.print( "Guess Number: " + room.guessNumber);
        for (int a = 3; a >= 0; --a){
            System.out.print(" ");
        }
        System.out.println("Reservetion Cancel PIN: " + room.pin);


    }

    @org.junit.Test
    public void checkIn() {
        int input = 102;
        int choose;

        room room = new room();
        room.roomNumber = 112;
        room.roomStatus = "Reserved";
        room.ownerName = "Eric";
        room.maxGuessNumber = 4;
        room.guessNumber = 3;
        room.pin = 2102;


        choose = input;
        System.out.println("İnput: " + input);

        choose = choose - 100;
        if (choose < 0 || choose > 29) {
            if (choose == -101) {

            } else {
                System.out.println("This Room Number Does Not Exist! Try Again.");
            }
        } else {
            if (room.roomStatus.equals("Reserved")) {
                room.roomStatus = "Full";
                System.out.println("Success!Check-in Completed!");

            } else {
                System.out.println("Wrong Room Status! Try Again.");
            }
        }


    }


    @org.junit.Test
    public void checkOut() {
        int input = 102;
        int choose;

        room room = new room();
        room.roomNumber = 102;
        room.roomStatus = "Full";
        room.ownerName = "Eric";
        room.maxGuessNumber = 4;
        room.guessNumber = 3;
        room.pin = 2102;


        choose = input;
        System.out.println("İnput: " + input);

        choose = choose - 100;
        if (choose < 0 || choose > 29) {
            if (choose == -101) {

            } else {
                System.out.println("This Room Number Does Not Exist! Try Again.");
            }
        } else {
            if (room.roomStatus.equals("Full")) {
                room.roomStatus = "Empty";
                System.out.println("Success!Check-out Completed!");

            } else {
                System.out.println("Wrong Room Status! Try Again.");
            }
        }



    }

}