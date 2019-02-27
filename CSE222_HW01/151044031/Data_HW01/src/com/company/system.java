package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * system class.
 * @see com.company.systemInterface it's interface for system.
 * @see com.company.otel it's super class for system.
 * @author VefikFiratAkman.
 * @version 1.00.
 */
public class system extends otel implements systemInterface {

    private static final String COMMA_DELIMITER = ";";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "roomNumber;ownerName;guessNumber;roomStatus;maxGuessNumber;pin";
    private static final String Owner_Name = "Firat";

    private int guessNum;
    private String username;
    private int usertype;
    private int [] inputArr;
    private int t;



    system() throws IOException {
        t = 0;
        dataReader();
        inputArr = new int[30];
        for(int i = 0; i < 30; ++i){
            inputArr[i] = -1;
        }
        inputArr[0] = 1;
        inputArr[1] = 1;
        inputArr[2] = 4;
        inputArr[3] = 100;
        inputArr[4] = 13;
        inputArr[5] = 3;
        inputArr[6] = 2;
        inputArr[7] = 1234;
        inputArr[8] = 5;
        inputArr[9] = 2;
        inputArr[10] = 100;
        inputArr[11] = 3;
        inputArr[12] = 100;
        inputArr[13] = 5;
        inputArr[14] = 7;

    }

    @Override
    public void dataWriter() throws IOException {
        FileWriter fileW = new FileWriter("src\\com\\Data\\Dataotel.csv");
        fileW.append(FILE_HEADER);
        fileW.append(NEW_LINE_SEPARATOR);
        for (int i = 0; i<ROOMS; ++i) {
            fileW.append(String.valueOf(roomlist[i].roomNumber));
            fileW.append(COMMA_DELIMITER);
            fileW.append(roomlist[i].ownerName);
            fileW.append(COMMA_DELIMITER);
            fileW.append(String.valueOf(roomlist[i].guessNumber));
            fileW.append(COMMA_DELIMITER);
            fileW.append(roomlist[i].roomStatus);
            fileW.append(COMMA_DELIMITER);
            fileW.append(String.valueOf(roomlist[i].maxGuessNumber));
            fileW.append(COMMA_DELIMITER);
            fileW.append(String.valueOf(roomlist[i].pin));
            fileW.append(NEW_LINE_SEPARATOR);
        }
        fileW.flush();
        fileW.close();


    }

    @Override
    public void dataReader() throws IOException {
        BufferedReader fileReader;
        String line;
        fileReader = new BufferedReader(new FileReader("src\\com\\Data\\Dataotel.csv"));
        fileReader.readLine();

        int i = 0;
        while ((line = fileReader.readLine()) != null) {

            String[] tokens = line.split(COMMA_DELIMITER);

            roomlist[i].roomNumber = Integer.parseInt(tokens[0]);
            roomlist[i].ownerName = tokens[1];
            roomlist[i].guessNumber = Integer.parseInt(tokens[2]);
            roomlist[i].roomStatus = tokens[3];
            roomlist[i].maxGuessNumber = Integer.parseInt(tokens[4]);
            roomlist[i].pin = Integer.parseInt(tokens[5]);

            ++i;
        }


        fileReader.close();


    }

    @Override
    public void mainSystem() throws IOException {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean mainOperation = true;

        System.out.println("           Welcome To Dreams Hotel!           \n"
                + "Your Holiday, Your Way, Your Dream, Our World!\n"
                + "                                                 ");

        while (mainOperation) {
            System.out.println("Hi Stranger! Please Explain Your Login's Reason\n"
                    + "1 - Customer \n"
                    + "2 - Receptionist\n"
                    + "3 - Exit Program");
            //usertype = sc.nextInt();
            usertype = inputArr[t];
            System.out.println("İnput: "+ inputArr[t]);
            ++t;

            if (usertype == 1) {
                boolean wantOp = true;
                boolean nameOp = true;

                while(nameOp) {
                    System.out.println("What is your name? (You will be owner of room)\n");
                    //username = sc.next();
                    username = Owner_Name;

                    if (username.length() > 10) {
                        System.out.println("Username Must Be Smaller Than 10 Characters");
                    } else {
                        System.out.println("Welcome " + username + "!");
                        nameOp = false;
                    }
                }
                while (wantOp) {
                    System.out.println("What do you want? \n"
                            + "1) Booking \n"
                            + "2) Cancel Reservation\n"
                            + "3) Return Main Menu\n"
                            + "4) Exit Program");
                    //num = sc.nextInt();
                    num = inputArr[t];
                    System.out.println("İnput: "+ inputArr[t]);
                    ++t;
                    if (num == 1) {
                        Booking();
                        reserve();
                    } else if (num == 2) {
                        cancelReserve();
                    } else if (num == 3) {
                        wantOp = false;
                    } else if (num == 4) {
                        wantOp = false;
                        mainOperation = false;
                    } else {
                        System.out.println("Wrong Choice! Try again...");
                    }
                }

            } else if (usertype == 2) {

                System.out.println("Please Enter Password: (Password:1234)");
                //int pass = sc.nextInt();
                int pass = inputArr[t];
                System.out.println("İnput: "+ inputArr[t]);

                ++t;

                if (pass == 1234) {
                    boolean wantOp = true;

                    username = "Receptionist";
                    System.out.println("Welcome " + username + "!");

                    while (wantOp) {
                        System.out.println("What do you want? \n"
                                + "1) Booking\n"
                                + "2) Check-in\n"
                                + "3) Check-out\n"
                                + "4) Cancel Reservation\n"
                                + "5) List ALL Room With Detail\n"
                                + "6) Return Main Menu\n"
                                + "7) Exit Program");
                        //num = sc.nextInt();
                        num = inputArr[t];
                        System.out.println("İnput: "+ inputArr[t]);

                        ++t;
                        if (num == 1) {
                            Booking();
                            reserve();

                        } else if (num == 2) {
                            checkIn();
                        } else if (num == 3) {
                            checkOut();
                        } else if (num == 4) {
                            cancelReserve();
                        } else if (num == 5) {
                            adminRoomPanel();
                        } else if (num == 6) {
                            wantOp = false;
                        } else if (num == 7) {
                            wantOp = false;
                            mainOperation = false;
                        } else {
                            System.out.println("Wrong Choice! Try again...");
                        }
                    }

                } else {
                    System.out.println("Wrong Password!");
                }
            } else if (usertype == 3) {
                mainOperation = false;
            }
            else {
                System.out.println("Wrong Choice! Try Again...");
            }
        }

        dataWriter();

    }

    @Override
    public void Booking() {

        Scanner sc = new Scanner(System.in);
        boolean guessOp = true;

        if (usertype == 2) {
            boolean nameOp = true;

            while(nameOp) {
                System.out.println("What Is Your Customer's Name?\n");
                //username = sc.next();
                username = "murat";
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
            guessNum = inputArr[t];
            System.out.println("İnput: "+ inputArr[t]);

            ++t;

            if (guessNum < 1) {
                System.out.println("You Can't Enter <1!! Try Again");
            } else if (guessNum > 4) {
                System.out.println("More Than 4 People!\n"
                        + "Your Guess Number Fixed To 4!\n"
                        + "Don't Forget Other Friend And Reserve Again!");
                guessNum = 4;
                guessOp = false;
            } else {
                guessOp = false;
            }
        }

        System.out.println("You Will See Just Suitable Room For Your Guess Number.");
        for (int i = 0; i < ROOMS; ++i) {
            if (roomlist[i].roomStatus.equals("Empty")) {
                if (roomlist[i].maxGuessNumber >= guessNum) {
                    System.out.println("Room " + roomlist[i].roomNumber + " is Empty.And Room Size: "
                            + roomlist[i].maxGuessNumber + "\n");

                }
            }
        }
    }

    @Override
    public void reserve() {

        Scanner sc = new Scanner(System.in);
        int choose;
        boolean operation = true;

        while (operation) {
            System.out.println("Choose Room Please: Or -1 For Return \n");
            //choose = sc.nextInt();
            choose = inputArr[t];
            System.out.println("İnput: "+ inputArr[t]);

            ++t;

            choose = choose - 100;
            if (choose < 0 || choose > 29) {
                if(choose == -101){
                    operation = false;
                }
                else {
                    System.out.println("This Room Number Does Not Exist! Try Again.");
                }
            } else {

                if (roomlist[choose].roomStatus.equals("Empty") && roomlist[choose].maxGuessNumber >= guessNum) {
                    System.out.println("Room " + roomlist[choose].roomNumber + " is Reserved");
                    roomlist[choose].ownerName = username;
                    roomlist[choose].guessNumber = guessNum;
                    roomlist[choose].roomStatus = "Reserved";
                    System.out.println("Please Enter PIN For After Reservation Cancelling...");
                    //roomlist[choose].pin = sc.nextInt();
                    roomlist[choose].pin = inputArr[t];
                    System.out.println("İnput: "+ inputArr[t]);
                    ++t;
                    System.out.println("Success!Reservation Completed!");

                    operation = false;

                } else {
                    System.out.println("Wrong Room Status Or Size! Try Again.");

                }

            }
        }
    }

    @Override
    public void cancelReserve() {

        Scanner sc = new Scanner(System.in);
        int choose;
        int upin;
        boolean cancelOP = true;

        while (cancelOP) {

            if(usertype == 2){
                for (int i = 0; i < ROOMS; ++i) {
                    if (roomlist[i].roomStatus.equals("Reserved")) {
                        System.out.println("Room " +roomlist[i].roomNumber + " Is Reserved By "
                                + roomlist[i].ownerName);
                    }
                }
            }

            System.out.println("Choose Room Please: Or -1 For Return ");
            if(usertype == 2){
                System.out.println("Remember: Admin Doesn't Need PIN For Cancel");
            }
            //choose = sc.nextInt();
            choose = inputArr[t];
            System.out.println("İnput: "+ inputArr[t]);

            ++t;
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
                    upin = inputArr[t];
                    System.out.println("İnput: "+ inputArr[t]);

                    ++t;
                }
                else{

                    upin = roomlist[choose].pin;
                }

                if (roomlist[choose].roomStatus.equals("Reserved") && roomlist[choose].pin == upin) {
                    roomlist[choose].ownerName = "----";
                    roomlist[choose].guessNumber = 0;
                    roomlist[choose].roomStatus = "Empty";
                    roomlist[choose].pin = 0;
                    System.out.println("Success!Reservation Cancelled!");
                    cancelOP = false;
                } else {
                    System.out.println("Wrong Room Or Wrong PIN. Try Again.\n");
                }
            }
        }
    }

    @Override
    public void adminRoomPanel() {


        for( int i=0; i<ROOMS; ++i) {
            System.out.print("Room " + roomlist[i].roomNumber + "    " + roomlist[i].roomStatus);

            for (int a = 10 - roomlist[i].roomStatus.length(); a >= 0; --a){
                System.out.print(" ");
            }
            System.out.print("Owner's Name: " + roomlist[i].ownerName);
            for (int a = 10 - roomlist[i].ownerName.length(); a >= 0; --a){
                System.out.print(" ");
            }
            System.out.print("Room's Size: " + roomlist[i].maxGuessNumber);
            for (int a = 3; a >= 0; --a){
                System.out.print(" ");
            }
            System.out.print( "Guess Number: " + roomlist[i].guessNumber);
            for (int a = 3; a >= 0; --a){
                System.out.print(" ");
            }
            System.out.println("Reservetion Cancel PIN: " + roomlist[i].pin);

        }


    }

    @Override
    public void checkIn() {
        Scanner sc = new Scanner(System.in);
        int choose;
        boolean op = true;

        for (int i = 0; i < ROOMS; ++i) {
            if (roomlist[i].roomStatus.equals("Reserved")) {
                System.out.println("Room " +roomlist[i].roomNumber + " Is Reserved By "
                                + roomlist[i].ownerName);
            }
        }

            while (op) {
            System.out.println("Choose Room Please: Or -1 For Return ");
            //choose = sc.nextInt();
            choose = inputArr[t];
                System.out.println("İnput: "+ inputArr[t]);

                ++t;
            choose = choose - 100;
            if (choose < 0 || choose > 29) {
                if(choose == -101){
                    op = false;
                }
                else {
                    System.out.println("This Room Number Does Not Exist! Try Again.");
                }
            } else {
                if (roomlist[choose].roomStatus.equals("Reserved")) {
                    roomlist[choose].roomStatus = "Full";
                    System.out.println("Success!Check-in Completed!");

                    op = false;
                } else {
                    System.out.println("Wrong Room Status! Try Again.");
                }
            }
        }
    }

    @Override
    public void checkOut() {

        Scanner sc = new Scanner(System.in);
        int choose;
        boolean op = true;

        for (int i = 0; i < ROOMS; ++i) {
            if (roomlist[i].roomStatus.equals("Full")) {
                System.out.println("Room " +roomlist[i].roomNumber + " Is Full With "
                        + roomlist[i].ownerName);
            }
        }

        while (op) {
            System.out.println("Choose Room Please: Or -1 For Return ");
            //choose = sc.nextInt();
            choose = inputArr[t];
            System.out.println("İnput: "+ inputArr[t]);

            ++t;
            choose = choose - 100;
            if (choose < 0 || choose > 29) {
                if(choose == -101){
                    op = false;
                }
                else {
                    System.out.println("This Room Number Does Not Exist! Try Again.");
                }
            } else {
                if (roomlist[choose].roomStatus.equals("Full")) {
                    roomlist[choose].guessNumber = 0;
                    roomlist[choose].ownerName = "----";
                    roomlist[choose].roomStatus = "Empty";
                    roomlist[choose].pin = 0;
                    System.out.println("Success!Check-out Completed!");

                    op = false;
                } else {
                    System.out.println("Wrong Room Status! Try Again.");
                }
            }
        }

    }

}
