import java.util.Scanner;

//this class is the main class of the program. it contains one main method, which is the menu interface
//for the inventory function.

public class Main{

        //this method sets up an inventory interface. it is a loop that lets the user select from a menu,
        //and once the function requested is executed, the loop breaks and goes back to the menu.

        public static void main(String[] args){

                Inventory inventory = new Inventory(50);
                int loopvar = 0;

                for(int loopvar2 = 0;loopvar == loopvar2;loopvar2++){

                       Scanner menuselection = new Scanner(System.in);

                       System.out.println("------------------");
                       System.out.println("1. Print Inventory");
                       System.out.println("2. Add Random Item");
                       System.out.println("3. Drop Item");
                       System.out.println("4. Equip Weapon");
                       System.out.println("5. Equip Armor");
                       System.out.println("6. Exit");
                       System.out.print(":");

                      int menuselect = menuselection.nextInt();
			if(menuselect == 1){
                               inventory.print();
                               loopvar++;
                       }

                       if(menuselect == 2){
                               Item addedItem = ItemGenerator.generate();
                               inventory.add(addedItem);
                               loopvar++;
                       }

                       if(menuselect == 3){
                               inventory.drop();
                               loopvar++;
                       }

                       if(menuselect == 4){
                               inventory.equipWeapon();
                               loopvar++;
                       }

                       if(menuselect == 5){
                               inventory.equipArmor();
                               loopvar++;
                       }

                       if(menuselect == 6){
                               break;
                       }
                }
        }
}


