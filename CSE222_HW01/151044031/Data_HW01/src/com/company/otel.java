package com.company;


import java.util.Random;

/**
 * otel class.
 * @author VefikFiratAkman.
 * @version 1.00.
 */
class otel {

    static final int ROOMS = 30;
    room[] roomlist;

    /**
     * Constructor of class.
     * İt's create otel with room class.
     */
    otel()  {

        roomlist = new room[ROOMS];

        for (int i = 0; i<ROOMS; ++i) {
            roomlist[i] = new room();
            roomlist[i].roomNumber = 100+ i;
            roomlist[i].ownerName = "----";
            roomlist[i].guessNumber = 0;
            roomlist[i].roomStatus = "Empty";
            Random rand = new Random();
            roomlist[i].maxGuessNumber = rand.nextInt(4) + 1;
            roomlist[i].pin = 0;
        }
    }

}
