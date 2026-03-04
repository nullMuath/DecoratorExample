public class Sandwich {

    private String description;
    private double price;

    private String ChipotleSauce = ", Chipotle";
    private String Mayonnaise = ", Mayonnaise";
    private String Pickles = ", Pickles";
    private String GarlicSauce = ", Garlic Sauce";
    private String Ketchup = ", Ketchup";
    private String BlueCheese = ", Blue Cheese";
    private String FetaCheese = ", Feta Cheese";
    private String Mustard = ", Mustard";

    public Sandwich(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasGarlicSauce() {
        description += GarlicSauce;
        price += 1.2;
        return true;
    }

    public boolean hasChipotleSauce() {
        description += ChipotleSauce;
        price += 1.0;
        return true;
    }

    public boolean hasMayonnaise() {
        description += Mayonnaise;
        price += 0.8;
        return true;
    }

    public boolean hasKetchup() {
        description += Ketchup;
        price += 0.5;
        return true;
    }

    public boolean hasFetaCheese() {
        description += FetaCheese;
        price += 1.5;
        return true;
    }

    public boolean hasBlueCheese() {
        description += BlueCheese;
        price += 1.7;
        return true;
    }

    public boolean hasMustard() {
        description += Mustard;
        price += 0.6;
        return true;
    }
}


