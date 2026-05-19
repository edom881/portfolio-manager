package com.pluralsight.finance;

public class House  extends FixedAsset {
    private int squareFeet;

    public House(String name, int squareFeet, double marketValue) {
        super(name, marketValue);
        this.squareFeet = squareFeet;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}
