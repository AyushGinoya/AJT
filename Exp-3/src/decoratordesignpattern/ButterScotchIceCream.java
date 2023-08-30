package decoratordesignpattern;

public class ButterScotchIceCream extends IceCream {
    @Override
    int cost() {
        return 50;
    }

    @Override
    String getDesc() {
        return "Butterscotch";
    }
}
