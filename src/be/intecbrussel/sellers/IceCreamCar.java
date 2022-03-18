package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller, Profitable {

    private static PriceList priceList;
    private static Stock stock;
    private static double profit;

    public IceCreamCar() {

    }

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }


    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        prepareCone();
        int numBalls = balls.length;
        double priceCone = priceList.getBallPrice() * numBalls;
        System.out.println("The price of your ice cream cone is €" + priceCone + ".");
        profit = profit + priceCone;
        return new Cone(balls);
    }

    private Cone prepareCone() {
        int stockCones = stock.getCones();
        int stockBalls = stock.getBalls();
        int order = 0;
        order++;
        System.out.println("There are " + stockCones + " cones and " + stockBalls + " balls left in stock.");
        if (stockCones > 0 && stockBalls > 0) {
            stockCones = stockCones - order;
            stockBalls = stockBalls - order;
            System.out.println("Number of cones left: " + stockCones);
            System.out.println("Number of balls left: " + stockBalls);
        } else {
            System.out.println("Ice cream cones are sold out.");

        }
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        prepareIceRocket();
        double priceIceRocket = priceList.getRocketPrice();
        System.out.println("The price of an ice rocket is €" + priceIceRocket + ".");
        profit = profit + priceIceRocket;

        return new IceRocket();
    }

    private IceRocket prepareIceRocket() {
        int stockRockets = stock.getIceRockets();
        int order = 0;
        order++;
        System.out.println("There are " + stockRockets + " Ice Rockets in stock.");
        if (stockRockets > 0) {
            stockRockets = stockRockets - order;
            System.out.println("Number of Ice Rockets left: " + stockRockets);

        } else {
            System.out.println("Ice Rockets are sold out.");
        }

        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        prepareMagnum();
        double priceMagnum = priceList.getMagnumStandardPrice(type);
        System.out.println("The price of your Magnum is " + priceMagnum + ".");
        profit = profit + priceMagnum;
        return new Magnum(type);
    }

    private Magnum prepareMagnum() {
        int stockMagnum = stock.getMagni();
        int order = 0;
        order++;
        System.out.println("There are " + stockMagnum + " Magnums in stock.");
        if (stockMagnum > 0) {
            stockMagnum = stockMagnum - order;
            System.out.println("Number of Magnums left: " + stockMagnum);

        } else {
            System.out.println("Magnums are sold out.");
        }
        return null;
    }

    @Override
    public double getProfit() {
        System.out.printf("Total profit for Ice Cream Car is %.2f: ", profit);
        return profit;
    }
}