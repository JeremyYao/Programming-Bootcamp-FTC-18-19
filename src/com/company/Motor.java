package com.company;

public class Motor
{
    private String companyName;
    private int maxRPM;
    private float weightKg;

    public Motor(String in_companyName, int in_maxRPM, float in_Weight)
    {
        companyName = in_companyName;
        maxRPM = in_maxRPM;
        weightKg = in_Weight;
    }

    public Motor()
    {
        companyName = "Undefined";
        maxRPM = 0;
        weightKg = 0;
    }

    public void spin(float pow)
    {
        if (Math.abs(pow) <= 1)
        {
            System.out.println("VRRRRRRRRRR");
            System.out.println("Spinning at " + pow * maxRPM + " RPM!");
        }
        else
            System.out.println("ERROR");
    }

    public void spin()
    {
        spin(1f);
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public int getMaxRPM()
    {
        return maxRPM;
    }

    public float getWeightKg()
    {
        return weightKg;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

}
