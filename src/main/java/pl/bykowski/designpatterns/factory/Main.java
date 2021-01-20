package pl.bykowski.designpatterns.factory;

public class Main {

    public static void main(String[] args) {


        Ship cargoShip = ShipFactory.createShip(ShipType.CARGO_SHIP);

        Ship cargoShipWithSpace = ShipFactory.createShip(ShipType.TRANSPORT_SHIP);

        System.out.println(cargoShip);
        System.out.println(cargoShipWithSpace);


    }
}
