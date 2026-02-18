public class Weapon implements ItemInfo, Damageable {
    private String name;
    private int quantity;
    private int damage;
    private String type;

    public Weapon(String name, int quantity, int damage, String type){
        this.name = name;
        this.damage = damage;
        this.type = type;
        this.quantity = quantity;
    }

    public int getDamage() {
        return damage;
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
        System.out.println("Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " 
        + getDamage() + ", Type: " + getType()); 
    }
}
