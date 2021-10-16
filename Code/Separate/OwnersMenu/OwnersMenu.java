package OwnersMenu;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
class OwnersMenu{

    public static void printOwnersMenu(){
        System.out.println("--- Owners Menu ---");
        System.out.println("----------------------");
        System.out.println("What would you like to do?");
        System.out.println("1. restock/add new items");
        System.out.println("2. change prices");
        System.out.println("3. Cash out/ cash in");
        System.out.println("4. print out summary of all items in stock");
        System.out.println("5. print out amount of cash");
        System.out.println("6. print out items that need restocking");
        System.out.println("7. EXIT");
        System.out.print("Enter a number: ");
    }

    public static int findItem(String[][] arr, String searchItem){
        int indexOfItem = 0, id = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i][id].equalsIgnoreCase(searchItem)){
                indexOfItem = i;
                break;
            } else{
                indexOfItem = -1;
                break;
            }
        }
        return indexOfItem;
    }
    public static void main(String[] args){
        int id = 0, name = 1, price = 2, stock = 3, end = 0,rows = 20, cols = 4;
        String[][] inventory = new String[rows][cols];
        String[] testItem = {"12AB", "Chips", "10", "20"};
        inventory[end] = testItem;
        Scanner input = new Scanner(System.in);
        int ownersMenuChoice = -1;
        do{
            printOwnersMenu();
            ownersMenuChoice = input.nextInt();

            switch (ownersMenuChoice){
                case 1:{
                    System.out.println("-------------------");
                    System.out.println("Would you like to:");
                    System.out.println("1. Restock");
                    System.out.println("2. Add a new item");
                    System.out.println("3. Go back");
                    int addRestockChoice = input.nextInt();
                    switch (addRestockChoice){
                        case 1:{
                            System.out.println("restock item");
                            System.out.print("Enter item id: ");
                            String itemToBeRestocked = input.next();
                            // Find item
                            int itemRow = findItem(inventory, itemToBeRestocked);
                            // If item row is -1 than the item doesnt exist
                            if (itemRow == -1){
                                System.out.println("Item does not exist in inventory");
                                break;
                            } else{
                                // Print the items name
                                System.out.printf("Item name: %s Current Stock: %s%n",  inventory[itemRow][name], inventory[itemRow][stock]);
                                System.out.print("Enter amount to be added: ");
                                // Get ammount to be added
                                int amountToBeAdded = input.nextInt();
                                // Get the current stock from the item row
                                int currentStock = Integer.parseInt(inventory[itemRow][stock]);
                                // Add the new stock to the existing stock
                                int newStock = amountToBeAdded + currentStock;
                                // Change the value of the old stock to the new stock
                                inventory[itemRow][stock] = String.valueOf(newStock);
                                System.out.printf("Item name: %s Current Stock: %s%n",  inventory[itemRow][name], inventory[itemRow][stock]);
                                System.out.println("Process successfull :)");
                                break;
                            }
                        } case 2:{
                            System.out.println("add new");
                            break;
                        } case 3:{
                            System.out.println("go back");
                            break;
                        } 
                    }
                    break;
                } case 2:{
                    System.out.println("change price");
                    break;
                } case 3:{
                    System.out.println("cash in /out");
                    break;
                } case 4:{
                    System.out.println("print all");
                    break;
                } case 5:{
                    System.out.println("print all cash");
                    break;
                } case 6:{
                    System.out.println("need restock");
                    break;
                } case 7:{
                    System.out.println("Goodbye :)");
                    break;
                }// } default:{
                //     System.out.println("Enter from numbers 1-7");
                // } 
            }
        } while(ownersMenuChoice != 7);
        input.close();
    }
}