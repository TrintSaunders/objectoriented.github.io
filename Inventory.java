import java.util.ArrayList;

public class Inventory {
    
    private ArrayList<ItemInfo> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(ItemInfo item) {
        items.add(item);
    }

    public void displayInventory() {
        for(ItemInfo item: items) {
            item.displayInfo();
        }
    }

    //Displays fruit or weapons by type
    public void displayInventoryByType(String type) {

        for (ItemInfo item : items){

            if(item instanceof Weapon) {
                Weapon weapon = (Weapon) item;
                
                if (weapon.getType().equalsIgnoreCase(type)){
                        weapon.displayInfo();
                }
            }
    
            if (item instanceof Fruit){
                Fruit fruit = (Fruit) item;
                    
                if (fruit.getType().equalsIgnoreCase(type)) {
                    fruit.displayInfo();
                }
            }

            if (item instanceof Potion){
                Potion potion = (Potion) item;
                    
                if (potion.getType().equalsIgnoreCase(type)) {
                    potion.displayInfo();
                }
            }
        }
    }

    //Display items by its name
    public void displayInventoryByName(String name) {

        for(ItemInfo item : items) {
            if(item.getName().equalsIgnoreCase(name)) {
                item.displayInfo();
            }
        }
    }

    //Loops through weapons and find the damage with the highest damage value
    public void displayHighestDamageWeapon() {

        Weapon highest = null;

        for(ItemInfo item : items) {

            if(item instanceof Weapon) {
                Weapon weapon = (Weapon) item;
            
                if(highest == null || weapon.getDamage() > highest.getDamage()) {
                    highest = weapon;
                }
            }
        }

        if(highest != null) {
            System.out.println("Weapon with highest damage:");
            highest.displayInfo();
        }
            else{
                System.out.println("No weapons found in inventory.");
            }
    }

    //Loops through potions and finds the highest healing potion
    public void displayHighestHealingPotion() {

        Potion highestHealing = null;

        for(ItemInfo item : items) {
            
            if(item instanceof Potion) {
                Potion potion = (Potion) item;

                if(highestHealing == null || potion.getHealing() > highestHealing.getHealing()) {
                    highestHealing = potion;
                }
            }
        }

        if(highestHealing != null){
            System.out.println("Potion with highest healing:");
            highestHealing.displayInfo();
        }
        else{
            System.out.println("No potions found in inventory.");
        }
    }

}
