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

}
