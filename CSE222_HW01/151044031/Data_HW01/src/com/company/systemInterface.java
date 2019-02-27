package com.company;

import java.io.IOException;

/**
 * systemInterface Interface.
 * @author VefikFiratAkman.
 * @version 1.00.
 */

 interface systemInterface {

    /**
     * dataWriter write roomlist array to csv file.
     * Took help from the tutorialspoint.
     * @exception IOException for file IO
     */
     void dataWriter() throws IOException;

    /**
     * dataReader read csv file.
     * And write value of csv file to roomlist array.
     * Took help from the tutorialspoint.
     * @exception IOException for file IO
     */
     void dataReader() throws IOException;

    /**
     * mainSystem main method of class.
     * When this function end, program end too.
     * @exception IOException because use dataWriter method.
     */
    void mainSystem() throws IOException;

    /**
     * Booking take guess wish and show suitable room.
     *
     */
     void Booking();

    /**
     * reserve apply booking to roomlist array.
     * So booking completed.
     */
     void reserve();

    /**
     * cancelReserve for cancel reservation.
     * Which room have 'Reserved' status turn to 'Empty' status.
     * And delete other details.
     */
     void cancelReserve();

    /**
     * adminRoomPanel listing all room with private detail.
     * Just admin can access.
     */
     void adminRoomPanel();

    /**
     * checkIn Which room have 'Reserved' status turn to 'Full' status.
     * Just admin can access.
     */
     void checkIn();

    /**
     * checkOut Which room have 'Full' status turn to 'Empty' status.
     * And delete other details.
     * Just admin can access.
     */
     void checkOut();
    
    
    

}
