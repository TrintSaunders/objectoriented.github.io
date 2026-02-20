public class Potion implements ItemInfo, Healable {
    private String name;
    private int quantity;
    private String type;
    private int healing;

    public Potion(String name, int quantity, int healing, String type){
        this.name = name;
        this.healing = healing;
        this.type = type;
        this.quantity = quantity;
    }

    public int getHealing() {
        return healing;
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

    @Override
        public void displayInfo() {
            System.out.println("Potion: " + getName() + ", Quantity: " + getQuantity() + ", Healing: " 
            + getHealing() + ", Type: " + getType()); 
    }
}