package decoratordesignpattern;

public class RainbowSprinklesDecorator extends IceCreamDecorator {
    IceCream i;

    public RainbowSprinklesDecorator(IceCream i) {
        super(i);
        this.i = i;
    }

    @Override
    String getDesc() {
        return i.getDesc() + " With Rainbow Sprinkles";
    }

    @Override
    int cost() {
        return 20 + i.cost();
    }
}
