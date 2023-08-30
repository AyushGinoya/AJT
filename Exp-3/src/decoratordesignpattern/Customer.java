package decoratordesignpattern;

public class Customer {
    public static void main(String[] args) {
        System.out.println();

        IceCream iceCream = new ButterScotchIceCream();
        iceCream = new ChocoSyrupDecorator(new ChocoChipsDecorator(iceCream));
        System.out.println("Cost: " + iceCream.cost());
        System.out.println("Description: " + iceCream.getDesc());

        IceCream iceCream2 = new ChocolateIceCream();
        iceCream2 = new ChocoChipsDecorator(iceCream2);
        System.out.println("Ice Cream 2 Cost: $" + iceCream2.cost());
        System.out.println("Ice Cream 2 Description: " + iceCream2.getDesc());
    }
}
