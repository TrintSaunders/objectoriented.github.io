public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();

        //Items being created and called from other classes
        //Item item = new Item("Generic Item", 10); 
        Fruit fruit = new Fruit("Apple", 20, "Fuji");
        Weapon weapon = new Weapon("Sword", 2, 75, "Melee");
        
        //Places the item created above into the users inventory
        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory(); //Displays the whole inventory
        inventory.displayInventory("Fuji"); //Displays the specfic type of item
    }
}
