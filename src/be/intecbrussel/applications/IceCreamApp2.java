package be.intecbrussel.applications;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamApp2{

    public static void main(String[] args) {
        Stock stock = new Stock();
        PriceList priceList = new PriceList();
        System.out.println("Prices: ice cream cone per scoop: €" + priceList.getBallPrice());
        System.out.println("Ice Rocket: €" + priceList.getRocketPrice());
        System.out.println("Magnum Milk chocolate, White chocolate, or Dark Chocolate: €" + priceList.getMagnumStandardPrice(Magnum.MagnumType.valueOf("MILKCHOCOLATE")));
        System.out.println("Magnum Alpine Nuts: €" + priceList.getMagnumStandardPrice(Magnum.MagnumType.valueOf("ALPINENUTS")));
        System.out.println("Magnum Romantic Strawberries: €" + priceList.getMagnumStandardPrice(Magnum.MagnumType.valueOf("ROMANTICSTRAWBERRIES")));

        Cone.Flavor[] balls = {Cone.Flavor.STRAWBERRY, Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA, Cone.Flavor.LEMON, Cone.Flavor.STRACIATELLA,Cone.Flavor.MOKKA, Cone.Flavor.PISTACHE};

        System.out.println("The following flavors are available: " );
        for (Cone.Flavor f : balls) {
            System.out.println(f);
        }
        System.out.println();
        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock);
        IceCreamCar iceCreamSeller = iceCreamCar;


        Magnum magnum1 = iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        Cone.Flavor[] choice1 = {Cone.Flavor.MOKKA, Cone.Flavor.PISTACHE};
        Cone cone1 = iceCreamCar.orderCone(choice1);
        IceRocket iceRocket1 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket2 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket3 = iceCreamCar.orderIceRocket();
        System.out.println();


        Eatable[] orders = {iceRocket1, iceRocket2, iceRocket3};
        for(Eatable order : orders){
            order.eat();
        }



        System.out.println();
        System.out.println();
        iceCreamCar.getProfit();

    }
}

