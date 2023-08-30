package decoratordesignpattern;

public class ChocoChipsDecorator extends IceCreamDecorator {
    IceCream i;

    public ChocoChipsDecorator(IceCream i) {
        super(i);
        this.i = i;
    }

    @Override
    String getDesc() {
        return i.getDesc() + " With Choco Chips";
    }

    @Override
    int cost() {
        return 50 + i.cost();
    }
}
