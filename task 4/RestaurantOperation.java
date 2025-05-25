public interface RestaurantOperation {
    void addToOrder(Food f);
    void removeFromOrder(Food f);
    void showOrders();
    double calculateBill();
}
