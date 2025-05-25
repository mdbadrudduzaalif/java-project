public class Start {
    public static void main(String[] args) {
        Drinks d1 = new Drinks("Coke", new String[]{"Water", "Sugar", "Flavor"}, 50, 150, "Soft", 1);
        Drinks d2 = new Drinks("Sprite", new String[]{"Water", "Sugar"}, 45, 140, "Soft", 1);
        Drinks d3 = new Drinks("Juice", new String[]{"Fruit", "Water"}, 60, 120, "Natural", 0);
        Drinks d4 = new Drinks("Lassi", new String[]{"Milk", "Sugar"}, 40, 130, "Dairy", 0);
        Drinks d5 = new Drinks("Coffee", new String[]{"Coffee", "Milk", "Sugar"}, 70, 100, "Hot", 0);

        Burger b1 = new Burger("Beef Burger", new String[]{"Bun", "Beef", "Lettuce"}, 120, 300, 2);
        Burger b2 = new Burger("Chicken Burger", new String[]{"Bun", "Chicken", "Cheese"}, 100, 280, 1);
        Burger b3 = new Burger("Veg Burger", new String[]{"Bun", "Veg Patty"}, 80, 250, 1);
        Burger b4 = new Burger("Double Burger", new String[]{"Bun", "Beef", "Cheese"}, 150, 350, 3);
        Burger b5 = new Burger("Spicy Burger", new String[]{"Bun", "Spicy Patty"}, 110, 260, 2);

        Pizza p1 = new Pizza("Pepperoni", new String[]{"Cheese", "Pepperoni"}, 300, 500, 12);
        Pizza p2 = new Pizza("Veggie", new String[]{"Cheese", "Vegetables"}, 250, 450, 10);
        Pizza p3 = new Pizza("Mushroom", new String[]{"Cheese", "Mushrooms"}, 270, 470, 11);
        Pizza p4 = new Pizza("BBQ Chicken", new String[]{"Chicken", "BBQ Sauce"}, 320, 520, 12);
        Pizza p5 = new Pizza("Cheese Lovers", new String[]{"Cheese"}, 280, 480, 10);

        Restaurant res = new Restaurant("AIUB panda");

        res.addToOrder(d1);
        res.addToOrder(b2);
        res.addToOrder(p3);
        res.addToOrder(p5);

        res.showOrders();

        System.out.println("Total Bill: " + res.calculateBill());
    }
}
