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

    public void displayInventory(String type) {
        for(ItemInfo item : items) {
            if (item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)){
                item.displayInfo();
            } else if (item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)) {
                item.displayInfo();
            }
        }
    }
}
