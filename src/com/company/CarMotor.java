package com.company;

public class CarMotor extends Motor
{
    private String carModel;
    private String powerSource;

    public CarMotor(String carModel, String powerSource,String in_companyName, int in_maxRPM, float in_Weight)
    {
        super(in_companyName,in_maxRPM,in_Weight);
        this.carModel = carModel;
        this.powerSource = powerSource;
    }

    public void accelerate()
    {
        if (powerSource.toLowerCase().equals("electric"))
        {
            super.spin();
        }
        else
        {
            System.out.println("GAS NOISES");
            spin();
        }
    }
}
