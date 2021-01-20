package pl.bykowski.designpatterns.strategy;

public class Main {


    public static void main(String[] args) {
        String s = makeTshirt(Size.XL);
        System.out.println(s);
    }

    public static String makeTshirt(Size size) {
        if(size == Size.S)
            return "zrobiłem koszulke w rozmiarze S";
        if(size == Size.L)
            return "zrobiłem koszulke w rozmiarze L";
        if(size == Size.XL)
            return "zrobiłem koszulke w rozmiarze S";
        return null;
    }
}
