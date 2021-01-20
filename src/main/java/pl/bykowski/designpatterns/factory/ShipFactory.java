package pl.bykowski.designpatterns.factory;

public class ShipFactory {

    public static Ship createShip(ShipType ship) {
        if (ShipType.CARGO_SHIP == ship) {
            CargoShip cargoShip = new CargoShip();
            cargoShip.setCargoLimit(100);
            cargoShip.setTeammates(10);
            return cargoShip;
        } else if (ShipType.TRANSPORT_SHIP == ship) {
            return new TransportShip();
        } else if (ShipType.WAR_SHIP == ship) {
            return new WarShip();
        }
        return null;
    }
}
