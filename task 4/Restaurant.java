public class Restaurant implements RestaurantOperation {
    private String restaurantName;
    private Food[] order = new Food[100];

    public Restaurant() {}

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setRestaurantName(String restaurantName) { this.restaurantName = restaurantName; }
    public String getRestaurantName() { return restaurantName; }

    public void addToOrder(Food f) {
        for (int i = 0; i < order.length; i++) {
            if (order[i] == null) {
                order[i] = f;
                break;
            }
        }
    }

    public void removeFromOrder(Food f) {
        for (int i = 0; i < order.length; i++) {
            if (order[i] == f) {
                order[i] = null;
                break;
            }
        }
    }

    public void showOrders() {
        System.out.println("Orders in " + restaurantName + ":");
        for (Food f : order) {
            if (f != null) {
                f.showDetails();
            }
        }
    }

    public double calculateBill() {
        double sum = 0;
        for (Food f : order) {
            if (f != null) {
                sum += f.getPrice();
            }
        }
        return sum;
    }
}
