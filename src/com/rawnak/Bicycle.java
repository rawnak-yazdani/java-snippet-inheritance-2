package com.rawnak;

public class Bicycle {
    int cadence;
    int gear;
    int speed;

    void setCadence(int cadence){
        this.cadence = cadence;
    }

    void setGear(int gear){
        this.gear = gear;
    }

    void applyBreak(int decrement){
        this.speed -= decrement;
    }

    void speedUp(int increment){
        this.speed += increment;
    }
}
