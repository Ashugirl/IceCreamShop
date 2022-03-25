package be.intecbrussel.applications;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamApp2{

    public static void main(String[] args) throws Exception {
        Stock stock = new Stock(2, 7, 12, 10);
        PriceList priceList = new PriceList(1.95, 2.95, 3.50);

        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock);
        IceCreamCar iceCreamSeller = new IceCreamCar(priceList, stock);


        System.out.println();


        Magnum magnum1 = iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        Magnum magnum2 = iceCreamCar.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
        Magnum magnum3 = iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        Cone.Flavor[] choice1 = {Cone.Flavor.MOKKA, Cone.Flavor.PISTACHE};
        Cone cone1 = iceCreamCar.orderCone(choice1);
        Cone.Flavor[] choice2 = {Cone.Flavor.LEMON, Cone.Flavor.STRAWBERRY, Cone.Flavor.BANANA};
        Cone cone2 = iceCreamCar.orderCone(choice2);
        Cone.Flavor[] choice3 = {Cone.Flavor.STRACIATELLA, Cone.Flavor.STRACIATELLA, Cone.Flavor.MOKKA};
        Cone cone3 = iceCreamCar.orderCone(choice3);
        IceRocket iceRocket1 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket2 = iceCreamCar.orderIceRocket();
        IceRocket iceRocket3 = iceCreamCar.orderIceRocket();
        System.out.println();


        Eatable[] orders = {iceRocket1, iceRocket2, iceRocket3};
        for (Eatable order : orders) {
            order.eat();
        }


        System.out.println();
        System.out.println();
        iceCreamCar.getProfit();}

    }

