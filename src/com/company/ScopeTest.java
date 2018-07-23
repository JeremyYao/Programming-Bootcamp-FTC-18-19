package com.company;

public class ScopeTest
{
    private static int myGlobalInt = 9;

    public static void main(String[] args)
    {
        myGlobalInt = 1;

        while (myGlobalInt == 1)
        {
            myGlobalInt++;
            int myLocalInt = 2;
        }
        //myGlobalInt = myLocalInt;
    }
}
