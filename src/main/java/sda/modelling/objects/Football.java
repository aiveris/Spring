package sda.modelling.objects;

import sda.modelling.entities.Ball;

public class Football implements Ball {

    @Override
    public long move(long meters) {

        System.out.printf("Ball moves " + meters + " m. ");
        return meters;
    }

}
