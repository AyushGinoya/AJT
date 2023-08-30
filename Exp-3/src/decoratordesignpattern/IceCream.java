package decoratordesignpattern;

public abstract class IceCream {
    String desc;
    String getDesc() {
        return desc;
    }
    abstract int cost();
}
