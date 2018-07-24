package com.company;

/**
 * Provided by Oracle's Java Docs https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
 */
public interface BicycleInterface
{
    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}