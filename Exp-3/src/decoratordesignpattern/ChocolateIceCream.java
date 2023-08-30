package decoratordesignpattern;

public class ChocolateIceCream extends IceCream {

    @Override
    int cost() {
        return 70;
    }

    @Override
    String getDesc() {
        return "Chocolate";
    }
}
