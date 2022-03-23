package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {

    private static PriceList priceList;
    private static Stock stock;
    private static double profit;

    public IceCreamCar() throws Exception {

    }

    public IceCreamCar(PriceList priceList, Stock stock) throws Exception {
        this.priceList = priceList;
        this.stock = stock;
    }


    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        prepareCone();
        int numBalls = balls.length;
        double priceCone = priceList.getBallPrice() * numBalls;
        System.out.println("The price of your ice cream cone is €" + priceCone + ".");
        System.out.println();
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
            stock.setCones(stockCones);
            stock.setBalls(stockBalls);
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
        System.out.println();
        profit = profit + priceIceRocket;

        return new IceRocket();
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {
        int stockRockets = stock.getIceRockets();
        System.out.println("There are " + stockRockets + " Ice Rockets in stock.");
            if (stockRockets > 0) {
                stockRockets--;
                stock.setIceRockets(stockRockets);
                System.out.println("Number of Ice Rockets left: " + stockRockets);
            } else {
                throw new NoMoreIceCreamException("Item sold out");
            }
         return new IceRocket();
    }
    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        prepareMagnum();
        double priceMagnum = priceList.getMagnumStandardPrice(type);
        System.out.println("The price of your Magnum is " + priceMagnum + ".");
        System.out.println();
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
            stock.setMagni(stockMagnum);
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