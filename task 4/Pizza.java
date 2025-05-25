public class Pizza extends Food {
    private int sizeInInches;

    public Pizza() {}

    public Pizza(String name, String[] ingredients, double price, float calories, int sizeInInches) {
        super(name, ingredients, price, calories);
        this.sizeInInches = sizeInInches;
    }

    public void setSize(int sizeInInches) { this.sizeInInches = sizeInInches; }
    public int getSize() { return sizeInInches; }

    public void showDetails() {
        System.out.println("Pizza: " + getName());
        System.out.println("Size: " + sizeInInches + " inches");
        System.out.println("Price: " + getPrice());
        System.out.println("Calories: " + getCalories());
        System.out.print("Ingredients: ");
        for (String ing : getIngredients()) {
            System.out.print(ing + " ");
        }
        System.out.println("\n-----------------------");
    }
}
