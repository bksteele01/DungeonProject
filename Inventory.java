import  java.util.ArrayList;
import java.util.Scanner;
import ansi_terminal.*;

class Inventory{

        //this class is the class that houses the inventory system. it is capable of constructing a new inventory
        //and has different functions that the main class uses to mainupulate the data within the inventory object.

        private ArrayList<Item> items = new ArrayList<Item>(50);
        private int maxWeight;
        private Item equippedWeapon;
        private Item equippedArmor;
        private int currentWeight;

        Inventory(int maxWeight){

                //this is the constructor for the inventory object. it takes the maximum weight a user can
                //carry as the parameter and sets the instance variable as the requested weight.
                //it also defaults the initial weight as zero, simulating an empty inventory.

                this.maxWeight = maxWeight;
                currentWeight = 0;
        }

        boolean add(Item item){

                //this method adds an item object to the inventory. it checks that the user is not carrying
                //too much weight, and then adds the item to the inventory if there is enough space.

                int itemWeight = item.getWeight();

                if(currentWeight+itemWeight > maxWeight){
                        System.out.println("You are carrying too much weight. Clear up some space in your inventory.");
                        return(false);
                }
                else{
                        System.out.println("Item added successfully.");
                        items.add(item);
                        currentWeight = currentWeight + itemWeight;
                        return (true);
                }
        }
	int totalWeight(){

                //this method returns the overall weight of the inventory.

                return currentWeight;
        }

        void print(){

                //this method loops through the inventory and prints out each item that it contains.

                for(int a = 0; a < items.size();a++){
                        Item currentItem = items.get(a);
                        Terminal.warpCursor(10+a, 72);
			System.out.print(currentItem);
                }
        }

        void drop(){

                //this method loops through the inventory and prints out each item. it asks which item
                //the user would like to abandon. once the user selects one, the method subtracts that items
                //weight from the total weight of the inventory, and then removes it from the inventory.

                for(int b = 1; b < items.size()+1;b++){
                        Item currentItem = items.get(b-1);
                        System.out.println(b);
                        System.out.println(currentItem.toString());
                }

                System.out.println("Which item would you like to drop");
                Scanner drop = new Scanner(System.in);
                int dropAnswer = drop.nextInt();

                Item selectedItem = items.get(dropAnswer-1);
                int itemWeight = selectedItem.getWeight();
                currentWeight = currentWeight - itemWeight;
                items.remove(dropAnswer-1);

        }
	void equipWeapon(){

                //this method equips a weapon by looping through the inventory and picking out all
                //items with the type "weapon". it then asks the user which weapon they would
                //like to equip, and sets the selection equal to the equip instance variable.

                for(int c = 0; c < items.size();c++){
			Item currentItem = items.get(c);
                        ItemType weapon = ItemType.weapon;
                        if(currentItem.getType() == weapon){
                                System.out.println((c+1) + "\n\r");
                                System.out.println(currentItem.toString() + "\n\r");
                        }

                }
		System.out.println("\n \r");
                System.out.println("Which weapon would you like to equip?\n\r");
                Scanner weaponequ = new Scanner(System.in);
                int equAnswer = weaponequ.nextInt();

                Item myWeapon = items.get(equAnswer-1);
                equippedWeapon = myWeapon;
               
                System.out.println(equippedWeapon + " has been equipped.\n\r");
		System.out.println("\n\r");
        }
	void equipArmor(){

                //this method equips armor by looping through the inventory and picking out all
                //items with the type "armor". it then asks the user which armor they would
                //like to equip, and sets the selection equal to the equip instance variable.

                for(int d = 0; d < items.size();d++){
			Item currentItem = items.get(d);
                        ItemType armor = ItemType.armor;
                        if(currentItem.getType() == armor){
                                System.out.println((d+1) + "\n\r");
                                System.out.println(currentItem.toString() + "\n\r");
                        }
                }
		System.out.println("\n\r");
                System.out.println("Which armor would you like to equip?\n\r");
                Scanner armorequ = new Scanner(System.in);
                int equAnswer = armorequ.nextInt();

                Item myArmor = items.get(equAnswer-1);
                equippedArmor = myArmor;
                System.out.println(equippedArmor + " has been equipped.\n\r");

        }
	public Item getWeapon() {
		return equippedWeapon;
	}
	public Item getArmor() {
		return equippedArmor;
	}

}




