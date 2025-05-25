public class Burger extends Food {
    private int numberOfPatty;

    public Burger() {}

    public Burger(String name, String[] ingredients, double price, float calories, int numberOfPatty) {
        super(name, ingredients, price, calories);
        this.numberOfPatty = numberOfPatty;
    }

    public void setNumberOfPatty(int numberOfPatty) { this.numberOfPatty = numberOfPatty; }
    public int getNumberOfPatty() { return numberOfPatty; }

    public void showDetails() {
        System.out.println("Burger: " + getName());
        System.out.println("Patties: " + numberOfPatty);
        System.out.println("Price: " + getPrice());
        System.out.println("Calories: " + getCalories());
        System.out.print("Ingredients: ");
        for (String ing : getIngredients()) {
            System.out.print(ing + " ");
        }
        System.out.println("\n-----------------------");
    }
}
