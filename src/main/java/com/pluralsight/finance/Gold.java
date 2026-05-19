package com.pluralsight.finance;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(double weight) {
        super("Gold", weight * 2000);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}
