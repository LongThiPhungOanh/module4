package com.example.spring_mvc.Model;

public class Conversion {
    private double usdAmount;
    private double result;

    public Conversion(double usdAmount, double result) {
        this.usdAmount = usdAmount;
        this.result = result;
    }

    public double getUsdAmount() {
        return usdAmount;
    }
    public void setUsdAmount(double usdAmount) {
        this.usdAmount = usdAmount;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
