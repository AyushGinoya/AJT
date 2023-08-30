package decoratordesignpattern;

public abstract class IceCreamDecorator extends IceCream{
    IceCream i;

    public IceCreamDecorator(IceCream i) {
        this.i = i;
    }

    String getDesc() {
        return i.getDesc();
    }

    abstract int cost();
}
