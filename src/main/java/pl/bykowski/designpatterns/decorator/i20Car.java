package pl.bykowski.designpatterns.decorator;

public class i20Car extends Car {

    // with car accessories
    @Override
    public float price() {
        float basePrice  =  20000;
        return basePrice;
    }

    @Override
    public String description() {
        return "Hyundai i20";
    }
}
