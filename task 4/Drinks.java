public class Drinks extends Food {
    private String type;
    private int sizeInLitter;

    public Drinks() {}

    public Drinks(String name, String[] ingredients, double price, float calories, String type, int sizeInLitter) {
        super(name, ingredients, price, calories);
        this.type = type;
        this.sizeInLitter = sizeInLitter;
    }

    public void setType(String type) { this.type = type; }
    public void setSize(int sizeInLitter) { this.sizeInLitter = sizeInLitter; }

    public String getType() { return type; }
    public int getSize() { return sizeInLitter; }

    public void showDetails() {
        System.out.println("drink: " + getName());
        System.out.println("type: " + type);
        System.out.println("size: " + sizeInLitter + "liters");
        System.out.println("price: " + getPrice());
        System.out.println("calories: " + getCalories());
        System.out.print("ingredients: ");
        for (String ing : getIngredients()) {
            System.out.print(ing + " ");
        }
        System.out.println("\n-----------------------");
    }
}
