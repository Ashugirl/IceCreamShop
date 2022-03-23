package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

import java.util.Scanner;

public class IceCreamSalon implements IceCreamSeller {
    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon() {

    }

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }


    @Override
    public double getProfit() {
        return totalProfit;
    }



    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        int numBalls = balls.length;
        double priceCone = priceList.getBallPrice() * numBalls;
        System.out.println("The price of your ice cream cone is €" + priceCone + ".");
        totalProfit = totalProfit + priceCone;
        return new Cone(balls);
    }

    @Override
    public IceRocket orderIceRocket() {
        double priceIceRocket = priceList.getRocketPrice();
        System.out.println("The price of an ice rocket is €" + priceIceRocket + ".");
        totalProfit = totalProfit + priceIceRocket;
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        double priceMagnum = priceList.getMagnumStandardPrice(type);
        System.out.println("The price of your Magnum is " + priceMagnum + ".");
        totalProfit = totalProfit + priceMagnum;
        return new Magnum(type);
    }


    @Override
    public String toString() {
        return "IceCreamSalon total profit = " + totalProfit;



    }
}