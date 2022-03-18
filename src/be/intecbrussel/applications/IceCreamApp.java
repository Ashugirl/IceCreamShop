package be.intecbrussel.applications;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

import java.util.Arrays;

public class IceCreamApp {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(1.95, 2.95, 3.5);
        System.out.println("Prices: ice cream cone per scoop: €" + priceList.getBallPrice());
        System.out.println("Ice Rocket: €" + priceList.getRocketPrice());
        System.out.println("Magnum Milk chocolate, White chocolate, or Dark Chocolate: €" + priceList.getMagnumStandardPrice(Magnum.MagnumType.valueOf("MILKCHOCOLATE")));
        System.out.println("Magnum Alpine Nuts: €" + priceList.getMagnumStandardPrice(Magnum.MagnumType.valueOf("ALPINENUTS")));
        System.out.println("Magnum Romantic Strawberries: €" + priceList.getMagnumStandardPrice(Magnum.MagnumType.valueOf("ROMANTICSTRAWBERRIES")));

        Cone.Flavor[] balls = {Cone.Flavor.STRAWBERRY, Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA, Cone.Flavor.LEMON, Cone.Flavor.STRACIATELLA,Cone.Flavor.MOKKA, Cone.Flavor.PISTACHE};

        System.out.println("Ice cream flavor menu: " );
            for (Cone.Flavor f : balls) {
                 System.out.println(f);
            }
       System.out.println();
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
        IceCreamSeller iceCreamSeller = iceCreamSalon;



        Cone.Flavor[] choice1 = {Cone.Flavor.MOKKA, Cone.Flavor.PISTACHE};
        Cone cone1 = iceCreamSalon.orderCone(choice1);
        Cone.Flavor[] choice2 = {Cone.Flavor.LEMON, Cone.Flavor.STRAWBERRY, Cone.Flavor.BANANA};
        Cone cone2 = iceCreamSalon.orderCone(choice2);
        Magnum magnum1 = iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
        IceRocket iceRocket1 = iceCreamSalon.orderIceRocket();
        IceRocket iceRocket2 = iceCreamSalon.orderIceRocket();
        Magnum magnum2 = iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        System.out.println();


        Eatable[] orders = {cone1, cone2, magnum1, magnum2, iceRocket1, iceRocket2};
        for(Eatable order : orders){
            order.eat();
        }
        System.out.println();
        System.out.println(iceCreamSeller);

        }


    }
