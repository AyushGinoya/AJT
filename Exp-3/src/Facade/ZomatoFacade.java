package Facade;

public class ZomatoFacade {
    public static void main(String[] args) {
        // Create instances of your classes: DeliveryTeam, DeliveryBoy, and Restaurant
        DeliveryTeam deliveryTeam = new DeliveryTeam();
        DeliveryBoy deliveryBoy = new DeliveryBoy();
        Restaurant restaurant = new Restaurant();

        // Place an order
        placeOrder(restaurant, deliveryTeam, deliveryBoy);
    }

    public static void placeOrder(Restaurant restaurant, DeliveryTeam deliveryTeam, DeliveryBoy deliveryBoy) {
        restaurant.prepareOrder();
        deliveryTeam.allocateToDeliveryBoy();
        deliveryBoy.pickUpDelivery();
        deliveryBoy.deliveryToCustomer();
    }
}
