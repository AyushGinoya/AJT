package decoratordesignpattern;

public class ChocoSyrupDecorator extends IceCreamDecorator {
    IceCream i;

    public ChocoSyrupDecorator(IceCream i) {
        super(i);
        this.i = i;
    }

    @Override
    String getDesc() {
        return i.getDesc() + " With Choco Syrup";
    }

    @Override
    int cost() {
        return 40 + i.cost();
    }
}
