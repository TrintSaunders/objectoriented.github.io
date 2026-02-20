import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();

        //Items being created and called from other classes
        //Item item = new Item("Generic Item", 10); 
        Fruit apple = new Fruit("Apple", 20, "Honey Crisp");
        Fruit orange = new Fruit("Orange", 5, "Climitine");
        Weapon sword = new Weapon("Sword", 2, 75, "Melee");
        Weapon spear = new Weapon("Spear", 1, 50, "Melee");
        Weapon axe = new Weapon("Axe", 1, 90, "Melee");
        
        //Places the item created above into the users inventory
        inventory.addItem(apple);
        inventory.addItem(sword);
        inventory.addItem(spear);
        inventory.addItem(orange);
        inventory.addItem(axe);

        //Scanner process
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to see?");
        System.out.println("1 - All Items");
        System.out.println("2 - Filter by Type");
        System.out.println("3 - Filter by Name");

        int choice = scanner.nextInt();
        scanner.nextLine(); //consumes newline

        switch(choice){
            case 1:
                inventory.displayInventory();
                break;
            case 2:
                System.out.println("Enter type (ex. Melee): ");
                String type = scanner.nextLine();
                inventory.displayInventoryByType(type);
                break;
            case 3:
                System.out.println("Enter name (ex. Apple or Sword): ");
                String name = scanner.nextLine();
                inventory.displayInventoryByName(name);
                break;
            
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
