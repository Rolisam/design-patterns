package pl.bykowski.designpatterns.observer;

public class Client2 implements Observer {

    @Override
    public void update() {
        System.out.println("Koniec pracy!!!" + this.getClass().getName());
    }

    @Override
    public void sendData(String info) {
        System.out.println(this.getClass().getName() + " " + info);

    }
}
