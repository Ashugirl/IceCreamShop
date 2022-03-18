package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;


public class PriceList{
    private double ballPrice = 1.95;
    private double rocketPrice = 2.95;
    private double magnumStandardPrice = 3.50;

    public PriceList(){

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice){
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public void setBallPrice(double ballPrice){
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice){
            this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice){
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice(){
        return ballPrice;
    }

    public double getRocketPrice(){
        return rocketPrice;
    }

    public double getMagnumStandardPrice(Magnum.MagnumType type){
        if(type == Magnum.MagnumType.ALPINENUTS){
            return magnumStandardPrice * 1.5;}
        else if(type == Magnum.MagnumType.ROMANTICSTRAWBERRIES){
            return magnumStandardPrice * 2;}
        else{
            return magnumStandardPrice;
        }
    }
}
