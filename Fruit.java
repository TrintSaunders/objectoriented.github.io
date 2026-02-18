public class Fruit implements ItemInfo{
    private String name;
    private int quantity;
    private String type;


    public Fruit(String name, int quantity, String type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    //String is better if you want the collar to decide. Void is more strict depending on what you want
    @Override
    public void displayInfo() {
        System.out.println("Fruit: " + getName() + ", Quantity: " + getQuantity() 
        + ", Type: " + type); 
    }
}
