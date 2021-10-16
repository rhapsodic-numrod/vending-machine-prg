
import java.util.Scanner;

class OwnersMenu{

    public static void printOwnersMenu(){
        System.out.println("----------------------");
        System.out.println("---- Owners Menu ----");
        System.out.println("----------------------");
        System.out.println("What would you like to do?");
        System.out.println("[1] Restock/Add new items");
        System.out.println("[2] Change prices");
        System.out.println("[3] Cash out/ cash in");
        System.out.println("[4] Print out summary of all items in stock");
        System.out.println("[5] Print out amount of cash");
        System.out.println("[6] Print out items that need restocking");
        System.out.println("[7] EXIT");
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

    public static void printAllItems(String[][] items, int lastRow, int columLen){
        System.out.println("Item ID\tItem Name\tItem Price\tStock Available");
        for (int i = 0; i <= lastRow; i++){
            for (int j = 0; j < columLen; j++){
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }
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
                    System.out.println("[1] Restock");
                    System.out.println("[2] Add a new item");
                    System.out.println("[3] Go back");
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
                            // Only add if the array is not full
                            if (end + 1 != rows){
                                // Get item information
                                System.out.print("Enter the item ID: ");
                                String newItemID = input.next();
                                System.out.print("Enter the item name: ");
                                String newItemName = input.next();
                                System.out.print("Enter the item price: ");
                                String newItemPrice = input.next();
                                System.out.print("Enter the ammount to be added: ");
                                String newItemStock = input.next();
                                // Add new item information to an array
                                String[] newItem = {newItemID, newItemName, newItemPrice, newItemStock};
                                // Add new item array to the inventory
                                inventory[end + 1] = newItem;
                                // Increase the end
                                end++;
                                System.out.println("Process Successfull :)");
                                break;
                            } else{
                                System.out.println("Unfortunately inventory is full cannot add any more items");
                                break;
                            }
                        } case 3:{
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
                    printAllItems(inventory, end, cols);
                    System.out.print("[1]")
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